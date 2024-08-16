package net.asteria.kimetsunoyaiba;

import net.asteria.kimetsunoyaiba.item.ModItemGroups;
import net.asteria.kimetsunoyaiba.item.ModItems;
import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class KimetsunoyaibaMod implements ModInitializer {
    public static final String MODID = "kimetsunoyaiba";
    public static final Logger LOGGER = Logger.getLogger(MODID);

    @Override
    public void onInitialize() {

        ModItemGroups.initialize();
        ModItems.initialize();

    }
}
