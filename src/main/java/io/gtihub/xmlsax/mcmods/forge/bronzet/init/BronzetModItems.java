
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.gtihub.xmlsax.mcmods.forge.bronzet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TintoolsSwordItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TintoolsShovelItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TintoolsPickaxeItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TintoolsHoeItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TintoolsAxeItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TinnuggetItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.TiningotItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.RawtinItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.RawcarbongemItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.NickelIngotItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.MeltedinvarItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.MeltedbronzeItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.CarbongemItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.item.BronzeingotItem;
import io.gtihub.xmlsax.mcmods.forge.bronzet.BronzetMod;

public class BronzetModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BronzetMod.MODID);
	public static final RegistryObject<Item> TIN_ORE = block(BronzetModBlocks.TIN_ORE, BronzetModTabs.TAB_BRONZETAB);
	public static final RegistryObject<Item> RAWTIN = REGISTRY.register("rawtin", () -> new RawtinItem());
	public static final RegistryObject<Item> TININGOT = REGISTRY.register("tiningot", () -> new TiningotItem());
	public static final RegistryObject<Item> TINBLOCK = block(BronzetModBlocks.TINBLOCK, BronzetModTabs.TAB_BRONZETAB);
	public static final RegistryObject<Item> BRONZEBLOCK = block(BronzetModBlocks.BRONZEBLOCK, BronzetModTabs.TAB_BRONZETAB);
	public static final RegistryObject<Item> TIN_PICKAXE = REGISTRY.register("tin_pickaxe", () -> new TintoolsPickaxeItem());
	public static final RegistryObject<Item> TIN_AXE = REGISTRY.register("tin_axe", () -> new TintoolsAxeItem());
	public static final RegistryObject<Item> TIN_SWORD = REGISTRY.register("tin_sword", () -> new TintoolsSwordItem());
	public static final RegistryObject<Item> TIN_SHOVEL = REGISTRY.register("tin_shovel", () -> new TintoolsShovelItem());
	public static final RegistryObject<Item> TIN_HOE = REGISTRY.register("tin_hoe", () -> new TintoolsHoeItem());
	public static final RegistryObject<Item> TINNUGGET = REGISTRY.register("tinnugget", () -> new TinnuggetItem());
	public static final RegistryObject<Item> MELTEDBRONZE_BUCKET = REGISTRY.register("meltedbronze_bucket", () -> new MeltedbronzeItem());
	public static final RegistryObject<Item> ALLOYER = block(BronzetModBlocks.ALLOYER, BronzetModTabs.TAB_BRONZETAB);
	public static final RegistryObject<Item> CARBONGEM = REGISTRY.register("carbongem", () -> new CarbongemItem());
	public static final RegistryObject<Item> RAWCARBONGEM = REGISTRY.register("rawcarbongem", () -> new RawcarbongemItem());
	public static final RegistryObject<Item> BRONZEINGOT = REGISTRY.register("bronzeingot", () -> new BronzeingotItem());
	public static final RegistryObject<Item> NICKEL_INGOT = REGISTRY.register("nickel_ingot", () -> new NickelIngotItem());
	public static final RegistryObject<Item> NICKEL_ORE = block(BronzetModBlocks.NICKEL_ORE, BronzetModTabs.TAB_BRONZETAB);
	public static final RegistryObject<Item> NICKEL_BLOCK = block(BronzetModBlocks.NICKEL_BLOCK, BronzetModTabs.TAB_BRONZETAB);
	public static final RegistryObject<Item> MELTEDINVAR_BUCKET = REGISTRY.register("meltedinvar_bucket", () -> new MeltedinvarItem());
	public static final RegistryObject<Item> INVARBLOCK = block(BronzetModBlocks.INVARBLOCK, BronzetModTabs.TAB_BRONZETAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
