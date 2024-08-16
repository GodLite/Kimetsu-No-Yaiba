package net.asteria.kimetsunoyaiba.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

import javax.swing.plaf.PanelUI;

public class ModFoodComponents {
    public static final FoodComponent BLOOD = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 2), 0.25f).build();

}
