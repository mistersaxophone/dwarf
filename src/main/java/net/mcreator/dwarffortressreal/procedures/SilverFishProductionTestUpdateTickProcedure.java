package net.mcreator.dwarffortressreal.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class SilverFishProductionTestUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, new BlockPos(x, y, z)) >= 20) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 20;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				int _value = (int) (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty(
						"silverfishCount") instanceof IntegerProperty _getip3 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip3) : -1)
						+ 1);
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("silverfishCount") instanceof IntegerProperty _integerProp
						&& _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty(
				"silverfishCount") instanceof IntegerProperty _getip6 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip6) : -1) >= 100) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Silverfish(EntityType.SILVERFISH, _level);
				entityToSpawn.moveTo((x + 0.5), (y + 1), (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			{
				int _value = (int) (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty(
						"silverfishCount") instanceof IntegerProperty _getip9 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip9) : -1)
						- 100);
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("silverfishCount") instanceof IntegerProperty _integerProp
						&& _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
