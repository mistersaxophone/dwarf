
package net.mcreator.dwarffortressreal.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.dwarffortressreal.entity.AncientSilverfishEntity;

public class AncientSilverfishRenderer extends MobRenderer<AncientSilverfishEntity, SilverfishModel<AncientSilverfishEntity>> {
	public AncientSilverfishRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AncientSilverfishEntity entity) {
		return new ResourceLocation("dwarf_fortress_real:textures/entities/g.png");
	}
}
