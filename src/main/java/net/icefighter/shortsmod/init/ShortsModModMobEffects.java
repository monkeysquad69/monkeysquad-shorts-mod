
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.shortsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.icefighter.shortsmod.potion.JumpadgraceMobEffect;
import net.icefighter.shortsmod.ShortsModMod;

public class ShortsModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ShortsModMod.MODID);
	public static final RegistryObject<MobEffect> JUMPADGRACE = REGISTRY.register("jumpadgrace", () -> new JumpadgraceMobEffect());
}
