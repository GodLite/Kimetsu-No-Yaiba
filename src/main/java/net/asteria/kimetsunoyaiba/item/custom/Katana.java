package net.asteria.kimetsunoyaiba.item.custom;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.asteria.kimetsunoyaiba.material.NichirinToolMaterial;
import net.asteria.kimetsunoyaiba.network.ModServerNetworking;
import net.asteria.kimetsunoyaiba.network.packet.ModGuiPacket;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class Katana extends SwordItem {

    public Katana(int attackDamage, Settings settings) {
        super(NichirinToolMaterial.INSTANCE, attackDamage, -2.4F, settings);

    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, @NotNull BlockState state) {
        if (state.isOf(Blocks.COBWEB)) {
            return 15.0F;
        } else {
            return state.isIn(BlockTags.SWORD_EFFICIENT) ? 1.5F : 1.0F;
        }
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!world.isClient && user instanceof ServerPlayerEntity) {
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeString("skill_selection"); // gui name

            ModServerNetworking.send(new ModGuiPacket(buf), (ServerPlayerEntity) user);
        }

        return TypedActionResult.pass(stack);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}
