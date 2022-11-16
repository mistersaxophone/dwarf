
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dwarffortressreal.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.dwarffortressreal.network.WinReminder8Message;
import net.mcreator.dwarffortressreal.network.WinReminder7Message;
import net.mcreator.dwarffortressreal.network.WinReminder6Message;
import net.mcreator.dwarffortressreal.network.WinReminder5Message;
import net.mcreator.dwarffortressreal.network.WinReminder4Message;
import net.mcreator.dwarffortressreal.network.WinReminder3Message;
import net.mcreator.dwarffortressreal.network.WinReminder2Message;
import net.mcreator.dwarffortressreal.network.WinReminder1Message;
import net.mcreator.dwarffortressreal.DwarfFortressRealMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DwarfFortressRealModKeyMappings {
	public static final KeyMapping WIN_REMINDER_1 = new KeyMapping("key.dwarf_fortress_real.win_reminder_1", GLFW.GLFW_KEY_W,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_2 = new KeyMapping("key.dwarf_fortress_real.win_reminder_2", GLFW.GLFW_KEY_A,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_3 = new KeyMapping("key.dwarf_fortress_real.win_reminder_3", GLFW.GLFW_KEY_S,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_4 = new KeyMapping("key.dwarf_fortress_real.win_reminder_4", GLFW.GLFW_KEY_D,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_5 = new KeyMapping("key.dwarf_fortress_real.win_reminder_5", GLFW.GLFW_KEY_UP,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_6 = new KeyMapping("key.dwarf_fortress_real.win_reminder_6", GLFW.GLFW_KEY_DOWN,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_7 = new KeyMapping("key.dwarf_fortress_real.win_reminder_7", GLFW.GLFW_KEY_LEFT,
			"key.categories.winreminding");
	public static final KeyMapping WIN_REMINDER_8 = new KeyMapping("key.dwarf_fortress_real.win_reminder_8", GLFW.GLFW_KEY_RIGHT,
			"key.categories.winreminding");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(WIN_REMINDER_1);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_2);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_3);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_4);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_5);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_6);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_7);
		ClientRegistry.registerKeyBinding(WIN_REMINDER_8);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == WIN_REMINDER_1.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder1Message(0, 0));
						WinReminder1Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_2.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder2Message(0, 0));
						WinReminder2Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_3.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder3Message(0, 0));
						WinReminder3Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_4.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder4Message(0, 0));
						WinReminder4Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_5.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder5Message(0, 0));
						WinReminder5Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_6.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder6Message(0, 0));
						WinReminder6Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_7.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder7Message(0, 0));
						WinReminder7Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == WIN_REMINDER_8.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DwarfFortressRealMod.PACKET_HANDLER.sendToServer(new WinReminder8Message(0, 0));
						WinReminder8Message.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
