
package io.gtihub.xmlsax.mcmods.forge.bronzet.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModTabs;

public class NickelIngotItem extends Item {
	public NickelIngotItem() {
		super(new Item.Properties().tab(BronzetModTabs.TAB_BRONZETAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
