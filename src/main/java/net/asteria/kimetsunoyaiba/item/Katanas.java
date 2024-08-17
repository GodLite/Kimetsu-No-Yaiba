package net.asteria.kimetsunoyaiba.item;

import net.asteria.kimetsunoyaiba.item.custom.Katana;
import net.minecraft.item.Item;


public class Katanas {
    public static final Katana TEST_KATANA = register(new Katana(
            9999, getKatanaItemSettings()
    ), "nichirinkatana_test");

    public static final Katana KATANA_BAMBOO = register(new Katana(
            3, getKatanaItemSettings()
    ), "nichirinkatana_bamboo");

    public static final Katana KATANA_DEFAULT = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_default");

    public static final Katana KATANA_CHERRY = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_cherry_blossom");

    public static final Katana KATANA_FLAME = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_flame");

    public static final Katana KATANA_GENYA = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_genya");

    public static final Katana KATANA_IGURO = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_iguro");

    public static final Katana KATANA_WATER = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_water");

    public static final Katana KATANA_ZENITSU = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_zenitsu");

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
