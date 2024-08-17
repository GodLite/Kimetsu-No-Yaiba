package net.asteria.kimetsunoyaiba.particle;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType WATER_SWEEP_ATTACK = (DefaultParticleType) register("water_sweep_attack", FabricParticleTypes.simple());;

    private static ParticleType register(String id, ParticleType particle) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(KimetsunoyaibaMod.MODID, id), particle);
    }

    public static void initialize() { }
}
