package net.asteria.kimetsunoyaiba.item.custom;

import net.asteria.kimetsunoyaiba.material.NichirinToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class Katana extends SwordItem {

    public Katana(int attackDamage, Settings settings) {
        super(new NichirinToolMaterial(), attackDamage, 1.6F, settings);

    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}
