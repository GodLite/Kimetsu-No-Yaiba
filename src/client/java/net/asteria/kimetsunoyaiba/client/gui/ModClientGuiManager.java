package net.asteria.kimetsunoyaiba.client.gui;

import net.asteria.kimetsunoyaiba.client.gui.screen.SkillSelectionScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;

import java.util.HashMap;
import java.util.Map;

public class ModClientGuiManager {
    private static final Map<String, Screen> guiMap = new HashMap<String, Screen>();

    public static void updateGui(Screen screen) {
        MinecraftClient.getInstance().execute(() -> {
            MinecraftClient.getInstance().setScreen(screen);
        });
    }

    public static Screen getGui(String name) {
        return guiMap.get(name);
    }

    public static void updateGui(String name) {
        Screen gui = getGui(name);
        if (gui != null) {
            updateGui(getGui(name));
        }
    }

    public static void initialize() {
    }

    static {
        SkillSelectionScreen skillSelectionScreen = new SkillSelectionScreen();
        guiMap.put(skillSelectionScreen.getName(), skillSelectionScreen);
    }
}
