
package io.gtihub.xmlsax.mcmods.forge.bronzet.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModTabs;
import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModItems;

public class TintoolsPickaxeItem extends PickaxeItem {
	public TintoolsPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 233;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		}, 1, -3f, new Item.Properties().tab(BronzetModTabs.TAB_BRONZETAB));
	}
}
