package net.asteria.kimetsunoyaiba.api.breathing;

import net.asteria.kimetsunoyaiba.api.breathing.skill.SkillRunnable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class SkillBuilder {

    public static Breathing.Skill build(String skillName,
                                        String iconTextureRL,
                                        SkillRunnable runnable,
                                        Text skillVisibleName, Text skillDescription) {
        return new Breathing.Skill() {

            @Override
            public String getIconTextureRL() {
                return iconTextureRL;
            }

            @Override
            public @Nullable Text getVisibleName() {
                return skillVisibleName;
            }

            @Override
            public @Nullable Text getDescription() {
                return skillDescription;
            }

            @Override
            public String getName() {
                return skillName;
            }

            @Override
            public void init(PlayerEntity player) {
                runnable.run(player);
            }
        };
    }

    public static Breathing.Skill build(String skillName,
                                        String iconTextureRL,
                                        SkillRunnable runnable) {
        return build(
                skillName, iconTextureRL, runnable, Text.empty(), Text.empty()
        );
    }
}
