package net.asteria.kimetsunoyaiba.client.network;

import net.asteria.kimetsunoyaiba.client.network.listener.ModClientPacketListener;
import net.asteria.kimetsunoyaiba.client.network.listener.ModGuiPacketListener;
import net.asteria.kimetsunoyaiba.network.packet.ModGuiPacket;
import net.asteria.kimetsunoyaiba.network.packet.ModPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;


public class ModClientNetworking {

    private static ModPacket register(ModPacket packet, ModClientPacketListener listener) {
        ClientPlayNetworking.registerGlobalReceiver(packet.getIdentifier(), listener.getChannel());
        return packet;
    }

    public static void send(ModPacket packet) {
        PacketByteBuf buf = packet.getBuf();
        if (buf == null) buf = PacketByteBufs.empty();

        ClientPlayNetworking.send(packet.getIdentifier(), buf);
    }

    public static void send(ModPacket packet, PacketByteBuf buf) {
        ClientPlayNetworking.send(packet.getIdentifier(), buf);
    }

    public static void initialize() {
        register(new ModGuiPacket(PacketByteBufs.empty()), new ModGuiPacketListener());
    }
}
