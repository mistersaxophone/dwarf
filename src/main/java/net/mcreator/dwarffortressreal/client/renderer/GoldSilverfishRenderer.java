
package net.mcreator.dwarffortressreal.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.dwarffortressreal.entity.GoldSilverfishEntity;

public class GoldSilverfishRenderer extends MobRenderer<GoldSilverfishEntity, SilverfishModel<GoldSilverfishEntity>> {
	public GoldSilverfishRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldSilverfishEntity entity) {
		return new ResourceLocation("dwarf_fortress_real:textures/entities/goldsilverfish.png");
	}
}
