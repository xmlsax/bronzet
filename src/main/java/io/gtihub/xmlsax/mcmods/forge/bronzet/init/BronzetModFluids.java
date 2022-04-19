
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package io.gtihub.xmlsax.mcmods.forge.bronzet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import io.gtihub.xmlsax.mcmods.forge.bronzet.fluid.MeltedinvarFluid;
import io.gtihub.xmlsax.mcmods.forge.bronzet.fluid.MeltedbronzeFluid;
import io.gtihub.xmlsax.mcmods.forge.bronzet.BronzetMod;

public class BronzetModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BronzetMod.MODID);
	public static final RegistryObject<Fluid> MELTEDBRONZE = REGISTRY.register("meltedbronze", () -> new MeltedbronzeFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MELTEDBRONZE = REGISTRY.register("flowing_meltedbronze", () -> new MeltedbronzeFluid.Flowing());
	public static final RegistryObject<Fluid> MELTEDINVAR = REGISTRY.register("meltedinvar", () -> new MeltedinvarFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MELTEDINVAR = REGISTRY.register("flowing_meltedinvar", () -> new MeltedinvarFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MELTEDBRONZE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MELTEDBRONZE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MELTEDINVAR.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MELTEDINVAR.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
