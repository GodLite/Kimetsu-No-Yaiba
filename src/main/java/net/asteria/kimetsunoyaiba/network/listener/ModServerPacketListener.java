package net.asteria.kimetsunoyaiba.network.listener;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public interface ModServerPacketListener {

    public ServerPlayNetworking.PlayChannelHandler getChannel();
}
