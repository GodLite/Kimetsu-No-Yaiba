package net.asteria.kimetsunoyaiba.item;

import net.asteria.kimetsunoyaiba.item.custom.Katana;
import net.minecraft.item.Item;


public class Katanas {
    public static final Katana TEST_KATANA = register(new Katana(
            9998, getKatanaItemSettings()
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

    public static final Katana KATANA_MIST = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_mist");

    public static final Katana KATANA_RENGOKU = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_rengoku");

    public static final Katana KATANA_KANROJI = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_kanroji");

    public static final Katana KATANA_KANAE = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_kanae");

    public static final Katana KATANA_WIND = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_wind");

    public static final Katana KATANA_GOLDEN = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_golden");

    public static final Katana KATANA_TANJIRO = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_tanjiro");

    public static final Katana KATANA_TOKITO = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_tokito");

    public static final Katana KATANA_KAIGAKU = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_kaigaku");

    public static final Katana KATANA_INOSUKE = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_inosuke");

    public static final Katana KATANA_HIMEJIMA = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_himejima_1");

    public static final Katana KATANA_HIMEJIMA2 = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_himejima_2");

    public static final Katana KATANA_TOMIOKA = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_tomioka");

    public static final Katana KATANA_SENIOR = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_senior");

    public static final Katana KATANA_SENIOR2 = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_senior_2");

    public static final Katana KATANA_SENIOR_KANAWO = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_kanawo");

    public static final Katana KATANA_KOCHO = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_kocho");

    public static final Katana KATANA_SHINAZUQAWA = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_shinazugawa");

    public static final Katana KATANA_THUNDER = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_thunder");

    public static final Katana KATANA_UZUI = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_uzui");

    public static final Katana KATANA_YORIICHI = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_yoriichi");

    public static final Katana KATANA_MOON = register(new Katana(
            7, getKatanaItemSettings()
    ), "nichirinkatana_moon");

    public static final Katana HF_BLADE = register(new Katana(
            12, getKatanaItemSettings()
    ), "hf_blade");


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
