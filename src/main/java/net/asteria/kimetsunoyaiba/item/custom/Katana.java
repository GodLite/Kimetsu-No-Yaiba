package net.asteria.kimetsunoyaiba.item.custom;

import net.asteria.kimetsunoyaiba.material.NichirinToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class Katana extends SwordItem {

    public Katana(int attackDamage, Settings settings) {
        super(NichirinToolMaterial.INSTANCE, attackDamage, 1.6F, settings);

    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}
