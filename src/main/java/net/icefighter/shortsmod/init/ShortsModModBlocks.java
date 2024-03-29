
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.shortsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.icefighter.shortsmod.block.BridgeTestBlock;
import net.icefighter.shortsmod.block.BridgeBlock;
import net.icefighter.shortsmod.ShortsModMod;

public class ShortsModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShortsModMod.MODID);
	public static final RegistryObject<Block> BRIDGE = REGISTRY.register("bridge", () -> new BridgeBlock());
	public static final RegistryObject<Block> BRIDGE_TEST = REGISTRY.register("bridge_test", () -> new BridgeTestBlock());
}
