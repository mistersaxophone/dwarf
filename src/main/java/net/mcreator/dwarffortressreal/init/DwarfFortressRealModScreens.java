
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.dwarffortressreal.client.gui.TypeWinScreen;
import net.mcreator.dwarffortressreal.client.gui.SilverfishGUIScreen;
import net.mcreator.dwarffortressreal.client.gui.RefineryGUIScreen;
import net.mcreator.dwarffortressreal.client.gui.GUIMeterScreen;
import net.mcreator.dwarffortressreal.client.gui.CompressorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DwarfFortressRealModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DwarfFortressRealModMenus.TYPE_WIN, TypeWinScreen::new);
			MenuScreens.register(DwarfFortressRealModMenus.GUI_METER, GUIMeterScreen::new);
			MenuScreens.register(DwarfFortressRealModMenus.COMPRESSOR_GUI, CompressorGUIScreen::new);
			MenuScreens.register(DwarfFortressRealModMenus.REFINERY_GUI, RefineryGUIScreen::new);
			MenuScreens.register(DwarfFortressRealModMenus.SILVERFISH_GUI, SilverfishGUIScreen::new);
		});
	}
}
