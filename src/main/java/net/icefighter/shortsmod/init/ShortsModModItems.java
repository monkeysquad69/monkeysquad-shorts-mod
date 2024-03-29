
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.shortsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.icefighter.shortsmod.ShortsModMod;

public class ShortsModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShortsModMod.MODID);
	public static final RegistryObject<Item> BRIDGE = block(ShortsModModBlocks.BRIDGE);
	public static final RegistryObject<Item> JUMPAD = block(ShortsModModBlocks.JUMPAD);
	public static final RegistryObject<Item> EXTRA_JUMPAD = block(ShortsModModBlocks.EXTRA_JUMPAD);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
