package net.asteria.kimetsunoyaiba.item;

import net.asteria.kimetsunoyaiba.item.custom.Katana;
import net.minecraft.item.Item;

public class Katanas {
    public static final Katana TEST_KATANA = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_test");

    private static Katana register(Katana sword, String id) {
        ModItems.register(sword, id, ModItemGroups.MAIN_MOD_GROUP);
        return sword;
    }
    private static Item.Settings getKatanaItemSettings() {
        Item.Settings settings = new Item.Settings();
        settings.maxCount(1);

        return settings;
    }

    public static void initialize() {

    }
}
