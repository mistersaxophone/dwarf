
package net.mcreator.dwarffortressreal.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.dwarffortressreal.init.DwarfFortressRealModTabs;

import java.util.List;

public class IronDustItem extends Item {
	public IronDustItem() {
		super(new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("These could probably make iron with use of a compressor."));
	}
}
