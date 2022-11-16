
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DwarfFortressRealModTabs {
	public static CreativeModeTab TAB_OOPS;

	public static void load() {
		TAB_OOPS = new CreativeModeTab("taboops") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DwarfFortressRealModItems.CANCER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
