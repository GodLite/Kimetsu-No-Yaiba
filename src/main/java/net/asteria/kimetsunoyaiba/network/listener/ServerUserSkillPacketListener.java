package net.asteria.kimetsunoyaiba.network.listener;

import net.asteria.kimetsunoyaiba.api.ModSkillNetworkStates;
import net.asteria.kimetsunoyaiba.api.breathing.BreathingManager;
import net.asteria.kimetsunoyaiba.api.breathing.skill.SkillManager;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class ServerUserSkillPacketListener implements ModServerPacketListener{
    @Override
    public ServerPlayNetworking.PlayChannelHandler getChannel() {
        ServerPlayNetworking.PlayChannelHandler channelHandler = ((server, player, handler, buf, responseSender) -> {
            String state = buf.readString();
            String skillName = buf.readString();


            if (state == ModSkillNetworkStates.USE_SKILL) {
                SkillManager.useSkill(player, skillName);
            }
        });

        return null;
    }
}
