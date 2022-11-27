
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.dwarffortressreal.block.entity.SilverFishProductionTestBlockEntity;
import net.mcreator.dwarffortressreal.block.entity.ElectricConduitBlockEntity;
import net.mcreator.dwarffortressreal.block.entity.ElectricConduit4BlockEntity;
import net.mcreator.dwarffortressreal.block.entity.ElectricConduit3BlockEntity;
import net.mcreator.dwarffortressreal.block.entity.ElectricConduit2BlockEntity;
import net.mcreator.dwarffortressreal.block.entity.CreativeElectricConduitBlockEntity;
import net.mcreator.dwarffortressreal.block.entity.CreativeBatteryBlockEntity;
import net.mcreator.dwarffortressreal.block.entity.BatteryTier1BlockEntity;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			DwarfFortressRealMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BATTERY_TIER_1 = register("battery_tier_1", DwarfFortressRealModBlocks.BATTERY_TIER_1,
			BatteryTier1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_BATTERY = register("creative_battery",
			DwarfFortressRealModBlocks.CREATIVE_BATTERY, CreativeBatteryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_CONDUIT = register("electric_conduit",
			DwarfFortressRealModBlocks.ELECTRIC_CONDUIT, ElectricConduitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_CONDUIT_2 = register("electric_conduit_2",
			DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_2, ElectricConduit2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_CONDUIT_3 = register("electric_conduit_3",
			DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_3, ElectricConduit3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_CONDUIT_4 = register("electric_conduit_4",
			DwarfFortressRealModBlocks.ELECTRIC_CONDUIT_4, ElectricConduit4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_ELECTRIC_CONDUIT = register("creative_electric_conduit",
			DwarfFortressRealModBlocks.CREATIVE_ELECTRIC_CONDUIT, CreativeElectricConduitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SILVER_FISH_PRODUCTION_TEST = register("silver_fish_production_test",
			DwarfFortressRealModBlocks.SILVER_FISH_PRODUCTION_TEST, SilverFishProductionTestBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
