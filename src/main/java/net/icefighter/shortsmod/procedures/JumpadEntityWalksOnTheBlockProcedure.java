package net.icefighter.shortsmod.procedures;

import net.icefighter.shortsmod.init.ShortsModModMobEffects;

public class JumpadEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 10, (entity.getDeltaMovement().z())));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.jump")), SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.jump")), SoundSource.BLOCKS, 1, 1, false);
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(ShortsModModMobEffects.JUMPADGRACE.get(), (int) Double.POSITIVE_INFINITY, 0));
	}
}
