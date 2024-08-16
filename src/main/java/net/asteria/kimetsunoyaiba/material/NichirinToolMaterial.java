package net.asteria.kimetsunoyaiba.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NichirinToolMaterial implements ToolMaterial {
    public static final NichirinToolMaterial INSTANCE = new NichirinToolMaterial();

    @Override
    public int getDurability() {
        return -1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 3;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
