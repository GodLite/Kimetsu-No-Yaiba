package net.asteria.kimetsunoyaiba.item.custom;

import net.asteria.kimetsunoyaiba.material.NichirinToolMaterial;
import net.minecraft.item.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import org.jetbrains.annotations.NotNull;

public class Katana extends SwordItem {

    public Katana(int attackDamage, Settings settings) {
        super(NichirinToolMaterial.INSTANCE, attackDamage, -2.4F, settings);

    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, @NotNull BlockState state) {
        if (state.isOf(Blocks.COBWEB)) {
            return 15.0F;
        } else {
            return state.isIn(BlockTags.SWORD_EFFICIENT) ? 1.5F : 1.0F;
        }
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}
