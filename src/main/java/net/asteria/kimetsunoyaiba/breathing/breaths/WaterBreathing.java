package net.asteria.kimetsunoyaiba.breathing.breaths;

import net.asteria.kimetsunoyaiba.api.breathing.Breathing;
import net.asteria.kimetsunoyaiba.api.breathing.SkillBuilder;
import net.asteria.kimetsunoyaiba.api.breathing.skill.SweepAttackSkillImpl;
import net.asteria.kimetsunoyaiba.particle.ModParticles;
import net.asteria.kimetsunoyaiba.sound.ModSounds;
import net.minecraft.particle.ParticleType;
import net.minecraft.sound.SoundEvent;

import java.util.ArrayList;

public class WaterBreathing implements Breathing {
    private ArrayList<Breathing.Skill> skills = new ArrayList<Skill>();

    @Override
    public Skill getSkill(Integer index) {
        return skills.get(index);
    }

    @Override
    public Integer getSkillsCount() {
        return skills.size();
    }

    @Override
    public SweepAttackSkillImpl getSweepAttackSkill() {
        return new SweepAttackSkillImpl() {
            @Override
            public ParticleType getParticleType() {
                return ModParticles.WATER_SWEEP_ATTACK;
            }

            @Override
            public SoundEvent getSoundEvent() {
                return ModSounds.WATER_SWEEP_ATTACK;
            }
        };
    }

    @Override
    public String getName() {
        return "water";
    }

    public WaterBreathing() {
        skills.add(
                SkillBuilder.build(
                        "water_skill_first", // Кодовое имя скилла, оно ни на что не влияет
                        "textures/gui/skill_icon/water/skill_icon.png", // Иконка скилла
                        (player -> {
                            // код скилла
                        })));



    }
}
