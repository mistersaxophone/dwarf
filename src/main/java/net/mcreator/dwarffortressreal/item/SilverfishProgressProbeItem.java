
package net.mcreator.dwarffortressreal.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.dwarffortressreal.procedures.SilverfishProgressProbeRightclickedOnBlockProcedure;
import net.mcreator.dwarffortressreal.init.DwarfFortressRealModTabs;

import java.util.List;

public class SilverfishProgressProbeItem extends Item {
	public SilverfishProgressProbeItem() {
		super(new Item.Properties().tab(DwarfFortressRealModTabs.TAB_OOPS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Used to determine the current progress of silverfish production."));
		list.add(new TextComponent("Creative only."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		SilverfishProgressProbeRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(),
				context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
