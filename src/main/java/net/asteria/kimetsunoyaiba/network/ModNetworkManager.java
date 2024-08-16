package net.asteria.kimetsunoyaiba.network;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class ModNetworkManager {

    public static Identifier getChannelName(String adder, String id) {
        return new Identifier(KimetsunoyaibaMod.MODID, adder + id);
    }
    public static Identifier getChannelName(String id) {
        return new Identifier(KimetsunoyaibaMod.MODID, id);
    }

    public static void send(ServerPlayerEntity player, Identifier channelName, PacketByteBuf buf) {
        ServerPlayNetworking.send(player, channelName, buf);
    }
}
