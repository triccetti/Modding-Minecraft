package com.tayloristic.nokamod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cheese_block), new Object[]{"AAA",
																		    	  "AAA",
																		       	  "AAA", 'A', ModItems.cheese});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.squash_seeds, 1), ModItems.squash);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bell_pepper_seeds, 1), ModItems.green_bell_pepper);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bell_pepper_seeds, 1), ModItems.red_bell_pepper);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bell_pepper_seeds, 1), ModItems.yellow_bell_pepper);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bell_pepper_seeds, 1), ModItems.orange_bell_pepper);

	}
}
