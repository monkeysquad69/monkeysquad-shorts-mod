package net.icefighter.shortsmod.procedures;

import net.icefighter.shortsmod.init.ShortsModModMobEffects;

public class JumpadgraceOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
		if (entity.onGround()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(ShortsModModMobEffects.JUMPADGRACE.get());
		}
	}
}
