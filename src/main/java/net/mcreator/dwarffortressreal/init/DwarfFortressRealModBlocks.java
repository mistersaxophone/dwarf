
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.dwarffortressreal.block.TROLLINGBlock;
import net.mcreator.dwarffortressreal.block.SilverFishProductionTestBlock;
import net.mcreator.dwarffortressreal.block.POWERRANGINGBlock;
import net.mcreator.dwarffortressreal.block.ElectricConduitBlock;
import net.mcreator.dwarffortressreal.block.CreativeBatteryBlock;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DwarfFortressRealMod.MODID);
	public static final RegistryObject<Block> POWERRANGING = REGISTRY.register("powerranging", () -> new POWERRANGINGBlock());
	public static final RegistryObject<Block> TROLLING = REGISTRY.register("trolling", () -> new TROLLINGBlock());
	public static final RegistryObject<Block> SILVER_FISH_PRODUCTION_TEST = REGISTRY.register("silver_fish_production_test",
			() -> new SilverFishProductionTestBlock());
	public static final RegistryObject<Block> ELECTRIC_CONDUIT = REGISTRY.register("electric_conduit", () -> new ElectricConduitBlock());
	public static final RegistryObject<Block> CREATIVE_BATTERY = REGISTRY.register("creative_battery", () -> new CreativeBatteryBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ElectricConduitBlock.registerRenderLayer();
		}
	}
}
