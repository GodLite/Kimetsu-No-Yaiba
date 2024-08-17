package net.asteria.kimetsunoyaiba.client.particle;

import net.asteria.kimetsunoyaiba.particle.ModParticles;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;
import net.minecraft.client.particle.SweepAttackParticle;

public class ModClientParticles {

    public static void initialize() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.WATER_SWEEP_ATTACK, SweepAttackParticle.Factory::new);
    }
}
