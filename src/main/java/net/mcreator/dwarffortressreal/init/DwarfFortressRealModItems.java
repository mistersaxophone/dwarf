
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

import net.mcreator.dwarffortressreal.item.TheCrumblerItem;
import net.mcreator.dwarffortressreal.item.StoneDustItem;
import net.mcreator.dwarffortressreal.item.SilverfishProgressProbeItem;
import net.mcreator.dwarffortressreal.item.RedstoneCrumblesItem;
import net.mcreator.dwarffortressreal.item.QuartzDustItem;
import net.mcreator.dwarffortressreal.item.LapisDustItem;
import net.mcreator.dwarffortressreal.item.IronDustItem;
import net.mcreator.dwarffortressreal.item.GoldDustItem;
import net.mcreator.dwarffortressreal.item.EnergyProbeItem;
import net.mcreator.dwarffortressreal.item.EmeraldDustItem;
import net.mcreator.dwarffortressreal.item.DiamondDustItem;
import net.mcreator.dwarffortressreal.item.CopperDustItem;
import net.mcreator.dwarffortressreal.item.CoalDustItem;
import net.mcreator.dwarffortressreal.item.CancerItem;
import net.mcreator.dwarffortressreal.item.AncientScrapItem;
import net.mcreator.dwarffortressreal.item.AncientDustItem;
import net.mcreator.dwarffortressreal.item.AncientDustCrumblesItem;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DwarfFortressRealMod.MODID);
	public static final RegistryObject<Item> CANCER = REGISTRY.register("cancer", () -> new CancerItem());
	public static final RegistryObject<Item> POWERRANGING = block(DwarfFortressRealModBlocks.POWERRANGING, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> TROLLING = block(DwarfFortressRealModBlocks.TROLLING, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> BATTERY_TIER_1 = block(DwarfFortressRealModBlocks.BATTERY_TIER_1, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> CREATIVE_BATTERY = block(DwarfFortressRealModBlocks.CREATIVE_BATTERY, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ELECTRIC_CONDUIT = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ELECTRIC_CONDUIT_2 = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_2,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ELECTRIC_CONDUIT_3 = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_3,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ELECTRIC_CONDUIT_4 = block(DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_4,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> CREATIVE_ELECTRIC_CONDUIT = block(DwarfFortressRealModBlocks.CREATIVE_ELECTRIC_CONDUIT,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> ENERGY_PROBE = REGISTRY.register("energy_probe", () -> new EnergyProbeItem());
	public static final RegistryObject<Item> SILVERFISH_PROGRESS_PROBE = REGISTRY.register("silverfish_progress_probe",
			() -> new SilverfishProgressProbeItem());
	public static final RegistryObject<Item> SILVER_FISH_PRODUCTION_TEST = block(DwarfFortressRealModBlocks.SILVER_FISH_PRODUCTION_TEST,
			DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> STONE_DUST = REGISTRY.register("stone_dust", () -> new StoneDustItem());
	public static final RegistryObject<Item> SLIVERFISHE = REGISTRY.register("sliverfishe_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.SLIVERFISHE, -6710887, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> LAPIS_DUST = REGISTRY.register("lapis_dust", () -> new LapisDustItem());
	public static final RegistryObject<Item> IRON_DUST = REGISTRY.register("iron_dust", () -> new IronDustItem());
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	public static final RegistryObject<Item> DIAMOND_DUST = REGISTRY.register("diamond_dust", () -> new DiamondDustItem());
	public static final RegistryObject<Item> REDSTONE_CRUMBLES = REGISTRY.register("redstone_crumbles", () -> new RedstoneCrumblesItem());
	public static final RegistryObject<Item> COPPER_DUST = REGISTRY.register("copper_dust", () -> new CopperDustItem());
	public static final RegistryObject<Item> COAL_DUST = REGISTRY.register("coal_dust", () -> new CoalDustItem());
	public static final RegistryObject<Item> EMERALD_DUST = REGISTRY.register("emerald_dust", () -> new EmeraldDustItem());
	public static final RegistryObject<Item> QUARTZ_DUST = REGISTRY.register("quartz_dust", () -> new QuartzDustItem());
	public static final RegistryObject<Item> ANCIENT_DUST_CRUMBLES = REGISTRY.register("ancient_dust_crumbles", () -> new AncientDustCrumblesItem());
	public static final RegistryObject<Item> ANCIENT_DUST = REGISTRY.register("ancient_dust", () -> new AncientDustItem());
	public static final RegistryObject<Item> ANCIENT_SCRAP = REGISTRY.register("ancient_scrap", () -> new AncientScrapItem());
	public static final RegistryObject<Item> THE_CRUMBLER = REGISTRY.register("the_crumbler", () -> new TheCrumblerItem());
	public static final RegistryObject<Item> COMPRESSOR = block(DwarfFortressRealModBlocks.COMPRESSOR, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> REFINERY = block(DwarfFortressRealModBlocks.REFINERY, DwarfFortressRealModTabs.TAB_OOPS);
	public static final RegistryObject<Item> LAPIS_SILVERFISH = REGISTRY.register("lapis_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.LAPIS_SILVERFISH, -16776961, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> DIAMOND_SILVERFISH = REGISTRY.register("diamond_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.DIAMOND_SILVERFISH, -13369345, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> REDSTONE_SILVERFISH = REGISTRY.register("redstone_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.REDSTONE_SILVERFISH, -65536, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> STONE_SILVERFISH = REGISTRY.register("stone_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.STONE_SILVERFISH, -10066330, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> QUARTZ_SILVERFISH = REGISTRY.register("quartz_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.QUARTZ_SILVERFISH, -1, -3355444,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> ANCIENT_SILVERFISH = REGISTRY.register("ancient_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.ANCIENT_SILVERFISH, -10079488, -6724096,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> GOLD_SILVERFISH = REGISTRY.register("gold_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.GOLD_SILVERFISH, -256, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> IRON_SILVERFISH = REGISTRY.register("iron_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.IRON_SILVERFISH, -1, -6710887,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> EMERALD_SILVERFISH = REGISTRY.register("emerald_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.EMERALD_SILVERFISH, -13369549, -1,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> COPPER_SILVERFISH = REGISTRY.register("copper_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.COPPER_SILVERFISH, -26368, -16737844,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));
	public static final RegistryObject<Item> COAL_SILVERFISH = REGISTRY.register("coal_silverfish_spawn_egg",
			() -> new ForgeSpawnEggItem(DwarfFortressRealModEntities.COAL_SILVERFISH, -16777216, -10066330,
					new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
