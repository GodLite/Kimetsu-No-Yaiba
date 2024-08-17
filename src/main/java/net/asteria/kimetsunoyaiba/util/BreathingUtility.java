package net.asteria.kimetsunoyaiba.util;

import net.asteria.kimetsunoyaiba.breathing.BreathingSweepAttack;
import net.asteria.kimetsunoyaiba.particle.ModParticles;
import net.asteria.kimetsunoyaiba.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import java.util.HashMap;
import java.util.Map;


public class BreathingUtility {
    public static final Map<String, BreathingSweepAttack> BREATHING_SWEEP_ATTACKS_MAP = new HashMap<String, BreathingSweepAttack>();

    public static String getBreathing(PlayerEntity player) {
        return "water";
    }


    static {
        BREATHING_SWEEP_ATTACKS_MAP.put("water", new BreathingSweepAttack(ModParticles.WATER_SWEEP_ATTACK, ModSounds.WATER_SWEEP_ATTACK));
    }
}
