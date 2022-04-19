
package io.gtihub.xmlsax.mcmods.forge.bronzet.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModTabs;
import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModItems;

public class TintoolsSwordItem extends SwordItem {
	public TintoolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 233;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BronzetModItems.TININGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(BronzetModTabs.TAB_BRONZETAB));
	}
}
