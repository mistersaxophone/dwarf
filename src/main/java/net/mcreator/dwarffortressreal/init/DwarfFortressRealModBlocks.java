
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dwarffortressreal.block.TROLLINGBlock;
import net.mcreator.dwarffortressreal.block.POWERRANGINGBlock;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DwarfFortressRealMod.MODID);
	public static final RegistryObject<Block> POWERRANGING = REGISTRY.register("powerranging", () -> new POWERRANGINGBlock());
	public static final RegistryObject<Block> TROLLING = REGISTRY.register("trolling", () -> new TROLLINGBlock());
}
