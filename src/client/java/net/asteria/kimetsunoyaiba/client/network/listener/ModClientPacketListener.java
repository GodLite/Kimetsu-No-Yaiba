package net.asteria.kimetsunoyaiba.client.network.listener;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public interface ModClientPacketListener {

    public ClientPlayNetworking.PlayChannelHandler getChannel();
}
