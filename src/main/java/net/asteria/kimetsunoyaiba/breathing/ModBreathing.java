package net.asteria.kimetsunoyaiba.breathing;

import net.asteria.kimetsunoyaiba.api.breathing.BreathingManager;
import net.asteria.kimetsunoyaiba.breathing.breaths.WaterBreathing;

public class ModBreathing {

    public static void initialize() {
        BreathingManager.registerBreathing(new WaterBreathing());
    }
}
