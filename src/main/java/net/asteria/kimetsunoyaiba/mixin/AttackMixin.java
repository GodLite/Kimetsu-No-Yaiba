package net.asteria.kimetsunoyaiba.mixin;

import net.asteria.kimetsunoyaiba.api.breathing.Breathing;
import net.asteria.kimetsunoyaiba.api.breathing.skills.SweepAttackSkillImpl;
import net.asteria.kimetsunoyaiba.item.custom.Katana;
import net.asteria.kimetsunoyaiba.api.breathing.BreathingManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class AttackMixin {
    public PlayerEntity originalInstance = (PlayerEntity) (Object) this;


    @Inject(
            at = @At("HEAD"),
            method = "spawnSweepAttackParticles",
            cancellable = true
    )
    public void customSweepAttackParticles(CallbackInfo info) {

        if (this.originalInstance.getMainHandStack().getItem() instanceof Katana) {
            double d = (double)(-MathHelper.sin(this.originalInstance.getYaw() * 0.017453292F));
            double e = (double)MathHelper.cos(this.originalInstance.getYaw() * 0.017453292F);
            Breathing breathing = BreathingManager.getBreathing(
                    BreathingManager.getPlayerBreathing(this.originalInstance)
            );
            SweepAttackSkillImpl sweepAttack = breathing.getSweepAttackSkill();

            if (this.originalInstance.getWorld() instanceof ServerWorld) {
                this.originalInstance.getWorld().playSound((PlayerEntity)null,
                        this.originalInstance.getX(), this.originalInstance.getY(), this.originalInstance.getZ(),
                        sweepAttack.getSoundEvent(), this.originalInstance.getSoundCategory(), 1.0F, 1.0F);

                ((ServerWorld)this.originalInstance.getWorld()).spawnParticles((DefaultParticleType) sweepAttack.getParticleType(),
                        this.originalInstance.getX() + d, this.originalInstance.getBodyY(0.5), this.originalInstance.getZ() + e,
                        0, d, 0.0, e, 0.0);
            }

            info.cancel();
        }
    }
}

