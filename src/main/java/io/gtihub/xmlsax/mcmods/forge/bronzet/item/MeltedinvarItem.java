
package io.gtihub.xmlsax.mcmods.forge.bronzet.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModTabs;
import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModFluids;

public class MeltedinvarItem extends BucketItem {
	public MeltedinvarItem() {
		super(BronzetModFluids.MELTEDINVAR,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BronzetModTabs.TAB_BRONZETAB));
	}
}
