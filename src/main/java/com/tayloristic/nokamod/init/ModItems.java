package com.tayloristic.nokamod.init;

import com.tayloristic.nokamod.Refrence.NokaModItems;
import com.tayloristic.nokamod.items.ModItemFood;
import com.tayloristic.nokamod.items.ModItemSeedFood;
import com.tayloristic.nokamod.items.ModItemSeeds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	public static Item artichoke_seeds;
	public static Item artichoke;

	public static Item arugula;
	public static Item arugula_seeds;
	public static Item asparagus;
	public static Item asparagus_seeds;
	//public static Item bell_pepper;
	public static Item bell_pepper_seeds;
	public static Item bok_choy;
	public static Item bok_choy_seeds;
	public static Item broccoli;
	public static Item broccoli_seeds;
	public static Item broccolini;
	public static Item broccolini_seeds;
	public static Item brussel_sprouts;
	public static Item brussel_sprouts_seeds;
	public static Item cabbage;
	public static Item cabbage_seeds;
	public static Item cauliflower;
	public static Item cauliflower_seeds;
	public static Item celery;
	public static Item celery_seeds;
	public static Item chives;
	public static Item chives_seeds;
	public static Item cucumber;
	public static Item cucumber_seeds;
	public static Item eggplant;
	public static Item eggplant_seeds;
	public static Item garlic;
	public static Item garlic_seeds;
	public static Item green_bell_pepper;
	public static Item kale;
	public static Item kale_seeds;
	public static Item lettuce;
	public static Item lettuce_seeds;
	public static Item mustard;
	public static Item mustard_seeds;
	public static Item onion;
	public static Item onion_seeds;
	public static Item orange_bell_pepper;
	public static Item pea;
	public static Item pea_seeds;
	public static Item radish;
	public static Item radish_seeds;
	public static Item red_bell_pepper;
	public static Item spinach;
	public static Item spinach_seeds;	
	public static Item sweet_potato;
	public static Item tomato;
	public static Item tomato_seeds;
	public static Item turnip;
	public static Item turnip_seeds;
	public static Item yam;
	public static Item yam_seeds;
	public static Item yellow_bell_pepper;
	public static Item zucchini;
	public static Item zucchini_seeds;
	
	
	public static Item squash;
	public static Item squash_seeds;

	
	public static void init() {
		CreativeTabs food = CreativeTabs.FOOD;
		CreativeTabs materials = CreativeTabs.MATERIALS;
		
		// Item foods
		cheese = new ModItemFood(3, 0.3f, false, food, NokaModItems.CHEESE);
		
		artichoke = new ModItemFood(3, 0.3f, false, food, NokaModItems.ARTICHOKE);
		arugula = new ModItemFood(3, 0.3f, false, food, NokaModItems.ARUGULA);
		asparagus =  new ModItemFood(3, 0.3f, false, food, NokaModItems.ASPARAGUS);
		//bell_pepper =  new ModItemFood(3, 0.3f, false, food, NokaModItems.BELL_PEPPER);
		bok_choy = new ModItemFood(3, 0.3f, false, food, NokaModItems.BOK_CHOY);
		broccoli = new ModItemFood(3, 0.3f, false, food, NokaModItems.BROCCOLI);
		broccolini =  new ModItemFood(3, 0.3f, false, food, NokaModItems.BROCCOLINI);
		brussel_sprouts = new ModItemFood(3, 0.3f, false, food, NokaModItems.BRUSSEL_SPROUTS);
		cabbage = new ModItemFood(3, 0.3f, false, food, NokaModItems.CABBAGE);
		celery = new ModItemFood(3, 0.3f, false, food, NokaModItems.CELERY);
		chives =  new ModItemFood(3, 0.3f, false, food, NokaModItems.CHIVES);
		cauliflower = new ModItemFood(3, 0.3f, false, food, NokaModItems.CAULIFLOWER);
		cucumber =  new ModItemFood(3, 0.3f, false, food, NokaModItems.CUCUMBER);
		garlic = new ModItemFood(3, 0.3f, false, food, NokaModItems.GARLIC);
		eggplant = new ModItemFood(3, 0.3f, false, food, NokaModItems.EGGPLANT);
		green_bell_pepper = new ModItemFood(3, 0.3f, false, food, NokaModItems.GREEN_BELL_PEPPER);
		kale = new ModItemFood(3, 0.3f, false, food, NokaModItems.KALE);
		lettuce = new ModItemFood(3, 0.3f, false, food, NokaModItems.LETTUCE);
		mustard = new ModItemFood(3, 0.3f, false, food, NokaModItems.MUSTARD);
		onion = new ModItemFood(3, 0.3f, false, food, NokaModItems.ONION);
		pea = new ModItemFood(3, 0.3f, false, food, NokaModItems.PEA);
		radish = new ModItemFood(3, 0.3f, false, food, NokaModItems.RADISH);
		red_bell_pepper = new ModItemFood(3, 0.3f, false, food, NokaModItems.RED_BELL_PEPPER);
		spinach = new ModItemFood(3, 0.3f, false, food, NokaModItems.SPINACH);
		squash = new ModItemFood(3, 0.3f, false, food, NokaModItems.SQUASH);
		zucchini =  new ModItemFood(3, 0.3f, false, food, NokaModItems.ZUCCHINI);
		yellow_bell_pepper = new ModItemFood(3, 0.3f, false, food, NokaModItems.YELLOW_BELL_PEPPER);
		turnip = new ModItemFood(3, 0.3f, false, food, NokaModItems.TURNIP);
		tomato = new ModItemFood(3, 0.3f, false, food, NokaModItems.TOMATO);
		orange_bell_pepper = new ModItemFood(3, 0.3f, false, food, NokaModItems.ORANGE_BELL_PEPPER);

		// Seeds
		artichoke_seeds = new ModItemSeeds(ModBlocks.artichoke_block, Blocks.FARMLAND, NokaModItems.ARTICHOKE_SEEDS);
		arugula_seeds = new ModItemSeeds(ModBlocks.arugula_block, Blocks.FARMLAND, NokaModItems.ARUGULA_SEEDS);
		asparagus_seeds = new ModItemSeeds(ModBlocks.asparagus_block, Blocks.FARMLAND, NokaModItems.ASPARAGUS_SEEDS);		
		bell_pepper_seeds =  new ModItemSeeds(ModBlocks.bell_pepper_block, Blocks.FARMLAND, NokaModItems.BELL_PEPPER_SEEDS);
		bok_choy_seeds =  new ModItemSeeds(ModBlocks.bok_choy_block, Blocks.FARMLAND, NokaModItems.BOK_CHOY_SEEDS);
		broccoli_seeds =  new ModItemSeeds(ModBlocks.broccoli_block, Blocks.FARMLAND, NokaModItems.BROCCOLI_SEEDS);
		broccolini_seeds = new ModItemSeeds(ModBlocks.broccolini_block, Blocks.FARMLAND, NokaModItems.BROCCOLINI_SEEDS);
		brussel_sprouts_seeds = new ModItemSeeds(ModBlocks.brussel_sprouts_block, Blocks.FARMLAND, NokaModItems.BRUSSEL_SPROUTS_SEEDS);
		cabbage_seeds = new ModItemSeeds(ModBlocks.cabbage_block, Blocks.FARMLAND, NokaModItems.CABBAGE_SEEDS);
		cauliflower_seeds = new ModItemSeeds(ModBlocks.cauliflower_block, Blocks.FARMLAND, NokaModItems.CAULIFLOWER_SEEDS);
		celery_seeds = new ModItemSeeds(ModBlocks.celery_block, Blocks.FARMLAND, NokaModItems.CELERY_SEEDS);
		chives_seeds = new ModItemSeeds(ModBlocks.chives_block, Blocks.FARMLAND, NokaModItems.CHIVES_SEEDS);
		cucumber_seeds =  new ModItemSeeds(ModBlocks.cucumber_block, Blocks.FARMLAND, NokaModItems.CUCUMBER_SEEDS);
		eggplant_seeds =  new ModItemSeeds(ModBlocks.eggplant_block, Blocks.FARMLAND, NokaModItems.EGGPLANT_SEEDS);
		garlic_seeds = new ModItemSeeds(ModBlocks.garlic_block, Blocks.FARMLAND, NokaModItems.GARLIC_SEEDS);
		kale_seeds =  new ModItemSeeds(ModBlocks.kale_block, Blocks.FARMLAND, NokaModItems.KALE_SEEDS);
		lettuce_seeds = new ModItemSeeds(ModBlocks.lettuce_block, Blocks.FARMLAND, NokaModItems.LETTUCE_SEEDS);
		mustard_seeds = new ModItemSeeds(ModBlocks.mustard_block, Blocks.FARMLAND, NokaModItems.MUSTARD_SEEDS);
		onion_seeds = new ModItemSeeds(ModBlocks.onion_block, Blocks.FARMLAND, NokaModItems.ONION_SEEDS);
		pea_seeds = new ModItemSeeds(ModBlocks.pea_block, Blocks.FARMLAND, NokaModItems.PEA_SEEDS);
		radish_seeds =  new ModItemSeeds(ModBlocks.radish_block, Blocks.FARMLAND, NokaModItems.RADISH_SEEDS);
		spinach_seeds = new ModItemSeeds(ModBlocks.spinach_block, Blocks.FARMLAND, NokaModItems.SPINACH_SEEDS);
		tomato_seeds = new ModItemSeeds(ModBlocks.tomato_block, Blocks.FARMLAND, NokaModItems.TOMATO_SEEDS);
		turnip_seeds = new ModItemSeeds(ModBlocks.turnip_block, Blocks.FARMLAND, NokaModItems.TURNIP_SEEDS);
		zucchini_seeds = new ModItemSeeds(ModBlocks.zucchini_block, Blocks.FARMLAND, NokaModItems.ZUCCHINI_SEEDS);
		
		// seed food
		yam =  new ModItemSeedFood(3, 0.3f, food, ModBlocks.yam_block, Blocks.FARMLAND, NokaModItems.YAM);

		
		// Block crop
		squash_seeds = new ModItemSeeds(ModBlocks.squash_stem, Blocks.FARMLAND, NokaModItems.SQUASH_SEEDS);

	}
	
	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(artichoke);
		GameRegistry.register(arugula);
		GameRegistry.register(asparagus);
		//GameRegistry.register(bell_pepper);
		GameRegistry.register(bok_choy);
		GameRegistry.register(broccoli);
		GameRegistry.register(broccolini);
		GameRegistry.register(brussel_sprouts);
		GameRegistry.register(cabbage);
		GameRegistry.register(cauliflower);
		GameRegistry.register(celery);
		GameRegistry.register(chives);
		GameRegistry.register(cucumber);
		GameRegistry.register(eggplant);
		GameRegistry.register(garlic);
		GameRegistry.register(green_bell_pepper);
		GameRegistry.register(kale);
		GameRegistry.register(lettuce);
		GameRegistry.register(mustard);
		GameRegistry.register(onion);
		GameRegistry.register(orange_bell_pepper);
		GameRegistry.register(pea);
		GameRegistry.register(radish);
		GameRegistry.register(red_bell_pepper);
		GameRegistry.register(spinach);
		GameRegistry.register(squash);
		GameRegistry.register(tomato);
		GameRegistry.register(turnip);
		GameRegistry.register(yam);
		GameRegistry.register(yellow_bell_pepper);
		GameRegistry.register(zucchini);
		
		GameRegistry.register(artichoke_seeds);
		GameRegistry.register(arugula_seeds);
		GameRegistry.register(asparagus_seeds);
		GameRegistry.register(bell_pepper_seeds);
		GameRegistry.register(bok_choy_seeds);
		GameRegistry.register(broccoli_seeds);
		GameRegistry.register(broccolini_seeds);
		GameRegistry.register(brussel_sprouts_seeds);
		GameRegistry.register(cabbage_seeds);
		GameRegistry.register(cauliflower_seeds);
		GameRegistry.register(celery_seeds);
		GameRegistry.register(chives_seeds);
		GameRegistry.register(cucumber_seeds);
		GameRegistry.register(eggplant_seeds);
		GameRegistry.register(garlic_seeds);
		GameRegistry.register(kale_seeds);
		GameRegistry.register(lettuce_seeds);
		GameRegistry.register(mustard_seeds);
		GameRegistry.register(onion_seeds);
		GameRegistry.register(pea_seeds);
		GameRegistry.register(radish_seeds);
		GameRegistry.register(spinach_seeds);
		GameRegistry.register(squash_seeds);
		GameRegistry.register(tomato_seeds);
		GameRegistry.register(turnip_seeds);
		GameRegistry.register(zucchini_seeds);
		
	}
	
	public static void registerRenders() {
		//foods 
		registerRender(cheese);
		registerRender(artichoke);
		registerRender(arugula);
		registerRender(asparagus);
		//registerRender(bell_pepper);
		registerRender(bok_choy);
		registerRender(broccoli);
		registerRender(broccolini);
		registerRender(brussel_sprouts);
		registerRender(cabbage);
		registerRender(cauliflower);
		registerRender(celery);
		registerRender(chives);
		registerRender(mustard);
		registerRender(cucumber);
		registerRender(eggplant);
		registerRender(garlic);
		registerRender(green_bell_pepper);
		registerRender(kale);
		registerRender(lettuce);
		registerRender(onion);
		registerRender(orange_bell_pepper);
		registerRender(pea);
		registerRender(radish);
		registerRender(red_bell_pepper);
		registerRender(spinach);
		registerRender(squash);
		registerRender(tomato);
		registerRender(turnip);
		registerRender(yam);
		registerRender(yellow_bell_pepper);
		registerRender(zucchini);
		
		//seeds
		registerRender(artichoke_seeds);
		registerRender(arugula_seeds);
		registerRender(asparagus_seeds);
		registerRender(bell_pepper_seeds);
		registerRender(bok_choy_seeds);
		registerRender(broccoli_seeds);
		registerRender(broccolini_seeds);
		registerRender(brussel_sprouts_seeds);
		registerRender(cabbage_seeds);
		registerRender(cauliflower_seeds);
		registerRender(celery_seeds);
		registerRender(chives_seeds);
		registerRender(cucumber_seeds);
		registerRender(mustard_seeds);
		registerRender(eggplant_seeds);
		registerRender(garlic_seeds);
		registerRender(kale_seeds);
		registerRender(lettuce_seeds);
		registerRender(onion_seeds);
		registerRender(pea_seeds);
		registerRender(radish_seeds);
		registerRender(spinach_seeds);
		registerRender(squash_seeds);
		registerRender(tomato_seeds);
		registerRender(turnip_seeds);
		registerRender(zucchini_seeds);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
