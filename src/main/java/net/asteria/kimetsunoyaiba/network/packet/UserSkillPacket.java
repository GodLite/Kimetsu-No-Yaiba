package net.asteria.kimetsunoyaiba.network.packet;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;

public class UserSkillPacket implements ModPacket{
    private final PacketByteBuf buf;
    private final String name = "user_skill";

    @Override
    public Identifier getIdentifier() {
        return new Identifier(KimetsunoyaibaMod.MODID, name);
    }

    @Override
    public PacketByteBuf getBuf() {
        return buf;
    }

    @Override
    public String getRegisteredId() {
        return name;
    }

    public UserSkillPacket(PacketByteBuf buf) {
        this.buf = buf;
    }
}
