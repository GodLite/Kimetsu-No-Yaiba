package net.asteria.kimetsunoyaiba.sound;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent WATER_SWEEP_ATTACK = register("water_sweep_attack");

    private static SoundEvent register(String id) {
        return SoundEvent.of(new Identifier(KimetsunoyaibaMod.MODID, id));
    }

    public static void initialize() {}
}
