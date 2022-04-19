
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.gtihub.xmlsax.mcmods.forge.bronzet.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BronzetModTabs {
	public static CreativeModeTab TAB_BRONZETAB;

	public static void load() {
		TAB_BRONZETAB = new CreativeModeTab("tabbronzetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CUT_COPPER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
