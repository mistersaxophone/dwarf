
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dwarffortressreal.item.StoneDustItem;
import net.mcreator.dwarffortressreal.item.SilverfishProgressProbeItem;
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
	public static final RegistryObject<Item> SILVERFISH_PROGRESS_PROBE = REGISTRY.register("silverfish_progress_probe",
			() -> new SilverfishProgressProbeItem());
	public static final RegistryObject<Item> CREATIVE_ELECTRIC_CONDUIT = block(DwarfFortressRealModBlocks.CREATIVE_ELECTRIC_CONDUIT,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> STONE_DUST = REGISTRY.register("stone_dust", () -> new StoneDustItem());
	public static final RegistryObject<Item> SLIVERFISHE = REGISTRY.register("sliverfishe_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.SLIVERFISHE, -1, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> ELECTRIC_CONDUIT_2 = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_2,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ELECTRIC_CONDUIT_3 = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_3,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ELECTRIC_CONDUIT_4 = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_4,
			DwarfFortressRealModTabs.TAB_OOPS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
