
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.gtihub.xmlsax.mcmods.forge.bronzet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.gtihub.xmlsax.mcmods.forge.bronzet.block.TinoreBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.TinblockBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.NickelOreBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.NickelBlockBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.MeltedinvarBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.MeltedbronzeBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.InvarblockBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.BronzeblockBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.block.AlloyerBlock;
import io.gtihub.xmlsax.mcmods.forge.bronzet.BronzetMod;

public class BronzetModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BronzetMod.MODID);
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinoreBlock());
	public static final RegistryObject<Block> TINBLOCK = REGISTRY.register("tinblock", () -> new TinblockBlock());
	public static final RegistryObject<Block> BRONZEBLOCK = REGISTRY.register("bronzeblock", () -> new BronzeblockBlock());
	public static final RegistryObject<Block> MELTEDBRONZE = REGISTRY.register("meltedbronze", () -> new MeltedbronzeBlock());
	public static final RegistryObject<Block> ALLOYER = REGISTRY.register("alloyer", () -> new AlloyerBlock());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOreBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> MELTEDINVAR = REGISTRY.register("meltedinvar", () -> new MeltedinvarBlock());
	public static final RegistryObject<Block> INVARBLOCK = REGISTRY.register("invarblock", () -> new InvarblockBlock());
}
