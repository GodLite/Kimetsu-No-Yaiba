package net.asteria.kimetsunoyaiba.particle;

import net.asteria.kimetsunoyaiba.network.ModNetworkManager;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModParticleManager {

    public void addParticle(String particleId, World world, Vec3d pos, Double yaw, Double pitch) {
        PacketByteBuf buf = PacketByteBufs.create();

        buf.writeString(particleId);
        buf.writeVec3d(pos);
        buf.writeDouble(yaw);
        buf.writeDouble(pitch);

        for (ServerPlayerEntity player : PlayerLookup.tracking((ServerWorld) world, BlockPos.ofFloored(pos))) {
            ModNetworkManager.send(player, ModNetworkManager.getChannelName("particle"), buf);
        }

    }

}
