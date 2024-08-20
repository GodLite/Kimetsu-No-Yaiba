package net.asteria.kimetsunoyaiba.api.breathing;

import net.asteria.kimetsunoyaiba.api.breathing.skills.SweepAttackSkillImpl;
import net.minecraft.entity.player.PlayerEntity;

public interface Breathing {

    public Skill getSkill(Integer index); // Получение скилла по индексу из аррей листа

    public Integer getSkillsCount(); // для этого геттера нужно сделать аррей лист из интерфейсов скилл

    public SweepAttackSkillImpl getSweepAttackSkill();

    public String getName(); // имя скилла, допустим "water"

    interface Skill {

        public String getName(); // имя способности

        public void init(PlayerEntity player);
    }
}
