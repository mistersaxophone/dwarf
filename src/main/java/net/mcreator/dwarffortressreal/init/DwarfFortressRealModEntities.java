
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dwarffortressreal.entity.StoneSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.SLIVERFISHEEntity;
import net.mcreator.dwarffortressreal.entity.RedstoneSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.QuartzSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.LapisSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.IronSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.GoldSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.EmeraldSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.DiamondSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.CopperSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.CoalSilverfishEntity;
import net.mcreator.dwarffortressreal.entity.AncientSilverfishEntity;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DwarfFortressRealModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DwarfFortressRealMod.MODID);
	public static final RegistryObject<EntityType<SLIVERFISHEEntity>> SLIVERFISHE = register("sliverfishe",
			EntityType.Builder.<SLIVERFISHEEntity>of(SLIVERFISHEEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SLIVERFISHEEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<LapisSilverfishEntity>> LAPIS_SILVERFISH = register("lapis_silverfish",
			EntityType.Builder.<LapisSilverfishEntity>of(LapisSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LapisSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<DiamondSilverfishEntity>> DIAMOND_SILVERFISH = register("diamond_silverfish",
			EntityType.Builder.<DiamondSilverfishEntity>of(DiamondSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DiamondSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<RedstoneSilverfishEntity>> REDSTONE_SILVERFISH = register("redstone_silverfish",
			EntityType.Builder.<RedstoneSilverfishEntity>of(RedstoneSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedstoneSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<StoneSilverfishEntity>> STONE_SILVERFISH = register("stone_silverfish",
			EntityType.Builder.<StoneSilverfishEntity>of(StoneSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StoneSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<QuartzSilverfishEntity>> QUARTZ_SILVERFISH = register("quartz_silverfish",
			EntityType.Builder.<QuartzSilverfishEntity>of(QuartzSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuartzSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<AncientSilverfishEntity>> ANCIENT_SILVERFISH = register("ancient_silverfish",
			EntityType.Builder.<AncientSilverfishEntity>of(AncientSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AncientSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<GoldSilverfishEntity>> GOLD_SILVERFISH = register("gold_silverfish",
			EntityType.Builder.<GoldSilverfishEntity>of(GoldSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<IronSilverfishEntity>> IRON_SILVERFISH = register("iron_silverfish",
			EntityType.Builder.<IronSilverfishEntity>of(IronSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IronSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<EmeraldSilverfishEntity>> EMERALD_SILVERFISH = register("emerald_silverfish",
			EntityType.Builder.<EmeraldSilverfishEntity>of(EmeraldSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmeraldSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<CopperSilverfishEntity>> COPPER_SILVERFISH = register("copper_silverfish",
			EntityType.Builder.<CopperSilverfishEntity>of(CopperSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CopperSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<CoalSilverfishEntity>> COAL_SILVERFISH = register("coal_silverfish",
			EntityType.Builder.<CoalSilverfishEntity>of(CoalSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoalSilverfishEntity::new)

					.sized(0.4f, 0.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SLIVERFISHEEntity.init();
			LapisSilverfishEntity.init();
			DiamondSilverfishEntity.init();
			RedstoneSilverfishEntity.init();
			StoneSilverfishEntity.init();
			QuartzSilverfishEntity.init();
			AncientSilverfishEntity.init();
			GoldSilverfishEntity.init();
			IronSilverfishEntity.init();
			EmeraldSilverfishEntity.init();
			CopperSilverfishEntity.init();
			CoalSilverfishEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SLIVERFISHE.get(), SLIVERFISHEEntity.createAttributes().build());
		event.put(LAPIS_SILVERFISH.get(), LapisSilverfishEntity.createAttributes().build());
		event.put(DIAMOND_SILVERFISH.get(), DiamondSilverfishEntity.createAttributes().build());
		event.put(REDSTONE_SILVERFISH.get(), RedstoneSilverfishEntity.createAttributes().build());
		event.put(STONE_SILVERFISH.get(), StoneSilverfishEntity.createAttributes().build());
		event.put(QUARTZ_SILVERFISH.get(), QuartzSilverfishEntity.createAttributes().build());
		event.put(ANCIENT_SILVERFISH.get(), AncientSilverfishEntity.createAttributes().build());
		event.put(GOLD_SILVERFISH.get(), GoldSilverfishEntity.createAttributes().build());
		event.put(IRON_SILVERFISH.get(), IronSilverfishEntity.createAttributes().build());
		event.put(EMERALD_SILVERFISH.get(), EmeraldSilverfishEntity.createAttributes().build());
		event.put(COPPER_SILVERFISH.get(), CopperSilverfishEntity.createAttributes().build());
		event.put(COAL_SILVERFISH.get(), CoalSilverfishEntity.createAttributes().build());
	}
}
