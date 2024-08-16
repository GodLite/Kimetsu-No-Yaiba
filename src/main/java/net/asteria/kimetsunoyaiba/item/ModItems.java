package net.asteria.kimetsunoyaiba.item;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.asteria.kimetsunoyaiba.itemGroup.ModItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = register(new Item(new Item.Settings()), "test_item", ModItemGroups.MAIN_MOD_GROUP);

    public static Item register(Item item, String id) {
        return Items.register(new Identifier(KimetsunoyaibaMod.MODID, id), item);
    }
    public static Item register(Item item, String id, RegistryKey<ItemGroup> itemGroup) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(entries -> entries.add(item));

        return  register(item, id);
    }

    public static void initialize() {
        Katanas.initialize();
    }
}
