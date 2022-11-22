
package net.mcreator.dwarffortressreal.client.gui;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.dwarffortressreal.world.inventory.RefineryGUIMenu;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevelProcedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel9Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel8Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel7Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel6Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel5Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel4Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel3Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel2Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel16Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel15Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel14Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel13Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel12Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel11Procedure;
import net.mcreator.dwarffortressreal.procedures.IfPowerLevel10Procedure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RefineryGUIScreen extends AbstractContainerScreen<RefineryGUIMenu> {
	private final static HashMap<String, Object> guistate = RefineryGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RefineryGUIScreen(RefineryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dwarf_fortress_real:textures/screens/refinery_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/emptybarfull.png"));
		this.blit(ms, this.leftPos + 152, this.topPos + 14, 0, 0, 16, 64, 16, 64);

		if (IfPowerLevelProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 74, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 70, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 66, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 62, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 58, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 54, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 50, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 46, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 42, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 38, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 34, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 30, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 26, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 22, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 18, 0, 0, 16, 4, 16, 4);
		}
		if (IfPowerLevel16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/filledbar.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 14, 0, 0, 16, 4, 16, 4);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("dwarf_fortress_real:textures/screens/updated-pernis-refinery-rotterda2.png"));
		this.blit(ms, this.leftPos + 51, this.topPos + 21, 0, 0, 50, 50, 50, 50);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "INPUT", 15, 25, -12829636);
		this.font.draw(poseStack, "OUTPUT", 111, 24, -12829636);
		this.font.draw(poseStack, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 128, 3, -65536);
		this.font.draw(poseStack, "" + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "PercentageCompleteText")) + "", 65, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
