package net.asteria.kimetsunoyaiba.client;

import net.asteria.kimetsunoyaiba.client.particle.ModClientParticles;
import net.fabricmc.api.ClientModInitializer;

public class KimetsunoyaibaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModClientParticles.initialize();
    }
}
