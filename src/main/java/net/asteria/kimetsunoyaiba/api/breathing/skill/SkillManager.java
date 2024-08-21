package net.asteria.kimetsunoyaiba.api.breathing.skill;

import net.asteria.kimetsunoyaiba.api.breathing.Breathing;
import net.asteria.kimetsunoyaiba.api.breathing.BreathingManager;
import net.minecraft.entity.player.PlayerEntity;

public class SkillManager {

    public static void useSkill(PlayerEntity entity, int skillIndex) {
        Breathing breathing = BreathingManager.getBreathing(entity);
        Breathing.Skill skill = breathing.getSkill(skillIndex);

        if (skill != null) {
            skill.init(entity);
        }
    }

    public static void useSkill(PlayerEntity entity, String skillName) {
        Breathing breathing = BreathingManager.getBreathing(entity);

        for (int i = 0; i < breathing.getSkillsCount(); i++) {
            Breathing.Skill skill = breathing.getSkill(i);
            if (skill.getName().equals(skillName)) {
                useSkill(entity, i);
                break;
            }
        }
    }
}
