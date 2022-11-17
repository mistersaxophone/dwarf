
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dwarffortressreal.item.EnergyProbeItem;
import net.mcreator.dwarffortressreal.item.CancerItem;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DwarfFortressRealMod.MODID);
	public static final RegistryObject<Item> CANCER = REGISTRY.register("cancer", () -> new CancerItem());
	public static final RegistryObject<Item> POWERRANGING = block(DwarfFortressRealModBlocks.POWERRANGING, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> TROLLING = block(DwarfFortressRealModBlocks.TROLLING, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> SILVER_FISH_PRODUCTION_TEST = block(DwarfFortressRealModBlocks.SILVER_FISH_PRODUCTION_TEST,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ENERGY_PROBE = REGISTRY.register("energy_probe", () -> new EnergyProbeItem());
	public static final RegistryObject<Item> ELECTRIC_CONDUIT = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> CREATIVE_BATTERY = block(DwarfFortressRealModBlocks.CREATIVE_BATTERY, DwarfFortressRealModTabs.TAB_OOPS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
