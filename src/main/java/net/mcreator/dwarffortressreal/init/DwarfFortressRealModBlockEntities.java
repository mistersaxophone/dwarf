
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
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			DwarfFortressRealMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SILVER_FISH_PRODUCTION_TEST = register("silver_fish_production_test",
			DwarfFortressRealModBlocks.SILVER_FISH_PRODUCTION_TEST, SilverFishProductionTestBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
