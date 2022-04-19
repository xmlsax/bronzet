
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.gtihub.xmlsax.mcmods.forge.bronzet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import io.gtihub.xmlsax.mcmods.forge.bronzet.block.entity.AlloyerBlockEntity;
import io.gtihub.xmlsax.mcmods.forge.bronzet.BronzetMod;

public class BronzetModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BronzetMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ALLOYER = register("alloyer", BronzetModBlocks.ALLOYER, AlloyerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
