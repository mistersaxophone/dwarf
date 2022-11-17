package net.mcreator.dwarffortressreal.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SilverFishProductionTestBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			int _value = 0;
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("silverfishCount") instanceof IntegerProperty _integerProp
					&& _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
	}
}
