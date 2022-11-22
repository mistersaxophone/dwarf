
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.dwarffortressreal.world.inventory.TypeWinMenu;
import net.mcreator.dwarffortressreal.world.inventory.SilverfishGUIMenu;
import net.mcreator.dwarffortressreal.world.inventory.RefineryGUIMenu;
import net.mcreator.dwarffortressreal.world.inventory.GUIMeterMenu;
import net.mcreator.dwarffortressreal.world.inventory.CompressorGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DwarfFortressRealModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<TypeWinMenu> TYPE_WIN = register("type_win", (id, inv, extraData) -> new TypeWinMenu(id, inv, extraData));
	public static final MenuType<GUIMeterMenu> GUI_METER = register("gui_meter", (id, inv, extraData) -> new GUIMeterMenu(id, inv, extraData));
	public static final MenuType<CompressorGUIMenu> COMPRESSOR_GUI = register("compressor_gui",
			(id, inv, extraData) -> new CompressorGUIMenu(id, inv, extraData));
	public static final MenuType<RefineryGUIMenu> REFINERY_GUI = register("refinery_gui",
			(id, inv, extraData) -> new RefineryGUIMenu(id, inv, extraData));
	public static final MenuType<SilverfishGUIMenu> SILVERFISH_GUI = register("silverfish_gui",
			(id, inv, extraData) -> new SilverfishGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
