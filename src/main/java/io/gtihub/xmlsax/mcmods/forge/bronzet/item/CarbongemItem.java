
package io.gtihub.xmlsax.mcmods.forge.bronzet.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModTabs;

public class CarbongemItem extends Item {
	public CarbongemItem() {
		super(new Item.Properties().tab(BronzetModTabs.TAB_BRONZETAB).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(Items.COAL);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
