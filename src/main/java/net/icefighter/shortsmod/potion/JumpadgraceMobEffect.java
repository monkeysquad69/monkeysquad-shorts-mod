
package net.icefighter.shortsmod.potion;

import net.icefighter.shortsmod.procedures.JumpadgraceOnEffectActiveTickProcedure;

public class JumpadgraceMobEffect extends MobEffect {
	public JumpadgraceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shorts_mod.jumpadgrace";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		JumpadgraceOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
