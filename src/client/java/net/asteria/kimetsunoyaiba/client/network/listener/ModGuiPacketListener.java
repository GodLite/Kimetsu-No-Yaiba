package net.asteria.kimetsunoyaiba.client.network.listener;

import net.asteria.kimetsunoyaiba.client.gui.ModClientGuiManager;
import net.asteria.kimetsunoyaiba.client.gui.screen.SkillSelectionScreen;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class ModGuiPacketListener implements ModClientPacketListener {
    @Override
    public ClientPlayNetworking.PlayChannelHandler getChannel() {
        ClientPlayNetworking.PlayChannelHandler channelHandler = ((client, handler, buf, responseSender) -> {
            String guiName = buf.readString();

            ModClientGuiManager.updateGui(new SkillSelectionScreen());
        });

        return channelHandler;
    }
}
