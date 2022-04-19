
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.gtihub.xmlsax.mcmods.forge.bronzet.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import io.gtihub.xmlsax.mcmods.forge.bronzet.client.gui.AlloyingScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BronzetModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BronzetModMenus.ALLOYING, AlloyingScreen::new);
		});
	}
}
