package net.asteria.kimetsunoyaiba.api.breathing;

import net.minecraft.entity.player.PlayerEntity;
import java.util.HashMap;
import java.util.Map;


public class BreathingManager {
    private static final Map<String, Breathing> BREATHINGS = new HashMap<String, Breathing>();

    public static Breathing getBreathing(String name) {
        return BREATHINGS.get(name);
    }
    public static String getPlayerBreathing(PlayerEntity player) {
        return "water";
    }
    public static Breathing getBreathing(PlayerEntity player) {
        return getBreathing(getPlayerBreathing(player));
    }

    public static void registerBreathing(Breathing breathing) {
        if (BREATHINGS.get(breathing.getName()) == null) {
            BREATHINGS.put(breathing.getName(), breathing);
        }
    }

}
