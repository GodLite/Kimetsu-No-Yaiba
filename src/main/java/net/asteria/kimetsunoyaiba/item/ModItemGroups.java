package net.asteria.kimetsunoyaiba.item;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> MAIN_MOD_GROUP = register("main_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(KimetsunoyaibaMod.MODID, id));
    }

    private static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                MAIN_MOD_GROUP,
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemGroup.kimetsunoyaiba.main_group"))
                        .icon(() -> new ItemStack(ModItems.GROUP_ICON))
                        .build()
        );

    }

    public static void initialize() {
        registerGroups();
    }
}
