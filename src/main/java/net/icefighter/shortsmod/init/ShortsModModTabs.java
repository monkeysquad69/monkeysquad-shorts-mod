
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.shortsmod.init;

import net.icefighter.shortsmod.ShortsModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShortsModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShortsModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ShortsModModBlocks.BRIDGE.get().asItem());
			tabData.accept(ShortsModModBlocks.JUMPAD.get().asItem());
			tabData.accept(ShortsModModBlocks.EXTRA_JUMPAD.get().asItem());
		}
	}
}
