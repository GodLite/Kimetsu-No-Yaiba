package net.asteria.kimetsunoyaiba.breathing;

import net.minecraft.particle.ParticleType;
import net.minecraft.sound.SoundEvent;

public class BreathingSweepAttack {
    private ParticleType particleType;
    private SoundEvent sound;

    public BreathingSweepAttack(ParticleType particleType, SoundEvent sound) {
        this.particleType = particleType;
        this.sound = sound;
    }

    public ParticleType getParticleType() {
        return particleType;
    }

    public SoundEvent getSound() {
        return sound;
    }
}
