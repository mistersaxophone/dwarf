
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dwarffortressreal.item.CancerItem;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

public class DwarfFortressRealModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DwarfFortressRealMod.MODID);
	public static final RegistryObject<Item> CANCER = REGISTRY.register("cancer", () -> new CancerItem());
}
