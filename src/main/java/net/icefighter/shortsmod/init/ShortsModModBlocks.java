
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.shortsmod.init;

import net.icefighter.shortsmod.block.JumpadBlock;
import net.icefighter.shortsmod.block.ExtraJumpadBlock;
import net.icefighter.shortsmod.block.BridgeBlock;
import net.icefighter.shortsmod.ShortsModMod;

public class ShortsModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShortsModMod.MODID);
	public static final RegistryObject<Block> BRIDGE = REGISTRY.register("bridge", () -> new BridgeBlock());
	public static final RegistryObject<Block> JUMPAD = REGISTRY.register("jumpad", () -> new JumpadBlock());
	public static final RegistryObject<Block> EXTRA_JUMPAD = REGISTRY.register("extra_jumpad", () -> new ExtraJumpadBlock());
}
