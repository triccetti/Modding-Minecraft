package com.tayloristic.nokamod.handler;

import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModDropHandler {

	public static void register() {
		forgeHooks();
	}
	
	
	// Adds grass drops
	public static void forgeHooks() {
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.arugula_seeds), 2);
	}

}
