package net.asteria.kimetsunoyaiba.network;

import net.asteria.kimetsunoyaiba.network.listener.ModServerPacketListener;
import net.asteria.kimetsunoyaiba.network.packet.ModGuiPacket;
import net.asteria.kimetsunoyaiba.network.packet.ModPacket;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

public class ModServerNetworking {

    private static ModPacket register(ModPacket packet, ModServerPacketListener listener) {
        ServerPlayNetworking.registerGlobalReceiver(packet.getIdentifier(), listener.getChannel());
        return packet;
    }

    private static ModPacket register(ModPacket packet) {
        ServerPlayNetworking.registerGlobalReceiver(packet.getIdentifier(), (server, player, handler, buf, responseSender) -> {});
        return packet;
    }

    public static void send(ModPacket packet, ServerPlayerEntity receiver) {
        PacketByteBuf buf = packet.getBuf();
        if (buf == null) buf = PacketByteBufs.empty();

        ServerPlayNetworking.send(receiver, packet.getIdentifier(), buf);
    }

    public static void initialize() {
        register(new ModGuiPacket(PacketByteBufs.empty()));
    }
}
