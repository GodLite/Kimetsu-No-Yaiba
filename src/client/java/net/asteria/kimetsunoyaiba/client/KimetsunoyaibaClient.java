package net.asteria.kimetsunoyaiba.client;

import net.asteria.kimetsunoyaiba.client.gui.ModClientGuiManager;
import net.asteria.kimetsunoyaiba.client.network.ModClientNetworking;
import net.asteria.kimetsunoyaiba.client.particle.ModClientParticles;
import net.fabricmc.api.ClientModInitializer;

import java.util.logging.Logger;

public class KimetsunoyaibaClient implements ClientModInitializer {
    public static Logger LOGGER = Logger.getLogger(KimetsunoyaibaClient.class.getName());

    @Override
    public void onInitializeClient() {
        ModClientParticles.initialize();
        ModClientNetworking.initialize();
        ModClientGuiManager.initialize();


    }
}
