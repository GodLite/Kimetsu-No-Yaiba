package net.asteria.kimetsunoyaiba.network.packet;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;

public class ModGuiPacket implements ModPacket{
    private PacketByteBuf buf;

    @Override
    public Identifier getIdentifier() {
        return new Identifier(KimetsunoyaibaMod.MODID, "test_packet");
    }

    @Override
    public PacketByteBuf getBuf() {
        return buf;
    }

    @Override
    public String getRegisteredId() {
        return "test_packet";
    }

    public ModGuiPacket(PacketByteBuf buf) {
        this.buf = buf;
    }
}
