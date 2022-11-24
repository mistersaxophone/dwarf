
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dwarffortressreal.client.renderer.StoneSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.SLIVERFISHERenderer;
import net.mcreator.dwarffortressreal.client.renderer.RedstoneSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.QuartzSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.LapisSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.IronSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.GoldSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.EmeraldSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.DiamondSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.CopperSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.CoalSilverfishRenderer;
import net.mcreator.dwarffortressreal.client.renderer.AncientSilverfishRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DwarfFortressRealModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DwarfFortressRealModEntities.SLIVERFISHE.get(), SLIVERFISHERenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.LAPIS_SILVERFISH.get(), LapisSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.DIAMOND_SILVERFISH.get(), DiamondSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.REDSTONE_SILVERFISH.get(), RedstoneSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.STONE_SILVERFISH.get(), StoneSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.QUARTZ_SILVERFISH.get(), QuartzSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.ANCIENT_SILVERFISH.get(), AncientSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.GOLD_SILVERFISH.get(), GoldSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.IRON_SILVERFISH.get(), IronSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.EMERALD_SILVERFISH.get(), EmeraldSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.COPPER_SILVERFISH.get(), CopperSilverfishRenderer::new);
		event.registerEntityRenderer(DwarfFortressRealModEntities.COAL_SILVERFISH.get(), CoalSilverfishRenderer::new);
	}
}
