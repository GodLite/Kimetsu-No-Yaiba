package net.asteria.kimetsunoyaiba.network.packet;


import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;

public interface ModPacket {

    public Identifier getIdentifier();

    public PacketByteBuf getBuf();

    public String getRegisteredId();
}
