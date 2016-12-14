package com.tayloristic.nokamod.init;

import com.tayloristic.nokamod.Refrence;
import com.tayloristic.nokamod.blocks.crops.ArtichokeCrop;
import com.tayloristic.nokamod.blocks.crops.ArugulaCrop;
import com.tayloristic.nokamod.blocks.crops.AsparagusCrop;
import com.tayloristic.nokamod.blocks.crops.BellPepperCrop;
import com.tayloristic.nokamod.blocks.crops.BokChoyCrop;
import com.tayloristic.nokamod.blocks.crops.BroccoliCrop;
import com.tayloristic.nokamod.blocks.crops.BroccoliniCrop;
import com.tayloristic.nokamod.blocks.crops.BrusselSproutsCrop;
import com.tayloristic.nokamod.blocks.crops.CabbageCrop;
import com.tayloristic.nokamod.blocks.crops.CauliflowerCrop;
import com.tayloristic.nokamod.blocks.crops.CeleryCrop;
import com.tayloristic.nokamod.blocks.crops.ChivesCrop;
import com.tayloristic.nokamod.blocks.crops.CucumberCrop;
import com.tayloristic.nokamod.blocks.crops.EggplantCrop;
import com.tayloristic.nokamod.blocks.crops.GarlicCrop;
import com.tayloristic.nokamod.blocks.crops.KaleCrop;
import com.tayloristic.nokamod.blocks.crops.LettuceCrop;
import com.tayloristic.nokamod.blocks.crops.MustardCrop;
import com.tayloristic.nokamod.blocks.crops.OnionCrop;
import com.tayloristic.nokamod.blocks.crops.PeaCrop;
import com.tayloristic.nokamod.blocks.crops.RadishCrop;
import com.tayloristic.nokamod.blocks.crops.SpinachCrop;
import com.tayloristic.nokamod.blocks.crops.SquashStem;
import com.tayloristic.nokamod.blocks.crops.TomatoCrop;
import com.tayloristic.nokamod.blocks.crops.TurnipCrop;
import com.tayloristic.nokamod.blocks.crops.YamCrop;
import com.tayloristic.nokamod.blocks.crops.ZucchiniCrop;
import com.tayloristic.nokamod.blocks.customBlocks.BlockAlmondLog;
import com.tayloristic.nokamod.blocks.customBlocks.BlockCheese;
import com.tayloristic.nokamod.blocks.customBlocks.BlockSquash;
import com.tayloristic.nokamod.blocks.customBlocks.ModBlockLog;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//logs
	public static BlockLog cherry_log;
	public static BlockLog almond_log;

	// custom blocks
	public static Block cheese_block;
	public static Block squash_block;

	//crops
	public static Block asparagus_block;
	public static Block artichoke_block;
	public static Block bell_pepper_block;
	public static Block bok_choy_block;
	public static Block broccoli_block;
	public static Block broccolini_block;
	public static Block brussel_sprouts_block;
	public static Block cabbage_block;
	public static Block cauliflower_block;
	public static Block celery_block;
	public static Block arugula_block;
	public static Block chives_block;
	public static Block cucumber_block;
	public static Block eggplant_block;
	public static Block garlic_block;
	public static Block kale_block;
	public static Block lettuce_block;
	public static Block mustard_block;
	public static Block onion_block;
	public static Block pea_block;
	public static Block radish_block;
	public static Block spinach_block;
	public static Block tomato_block;
	public static Block turnip_block;
	public static Block yam_block;
	public static Block zucchini_block;
	public static Block squash_stem;
	
	public static void init() {
		
		// logs
		almond_log = new BlockAlmondLog(Refrence.NokaModBlocks.ALMOND_LOG);
		cherry_log = new ModBlockLog(Refrence.NokaModBlocks.CHERRY_LOG);
		
		
		cheese_block = new BlockCheese(Material.CACTUS, MapColor.YELLOW, Refrence.NokaModBlocks.CHEESE_BLOCK);
		squash_block = new  BlockSquash(Material.GOURD, MapColor.GREEN, Refrence.NokaModBlocks.SQUASH_BLOCK);

		//Crops 										crop block 				
		artichoke_block = new  ArtichokeCrop(Refrence.NokaModBlocks.ARTICHOKE_BLOCK);
		arugula_block = new  ArugulaCrop(Refrence.NokaModBlocks.ARUGULA_BLOCK);
		asparagus_block = new AsparagusCrop(Refrence.NokaModBlocks.ASPARAGUS_BLOCK);
		bell_pepper_block = new  BellPepperCrop(Refrence.NokaModBlocks.BELL_PEPPER_BLOCK);
		bok_choy_block = new  BokChoyCrop(Refrence.NokaModBlocks.BOK_CHOY_BLOCK);
		broccoli_block = new  BroccoliCrop(Refrence.NokaModBlocks.BROCCOLI_BLOCK);
		broccolini_block = new  BroccoliniCrop(Refrence.NokaModBlocks.BROCCOLINI_BLOCK);
		brussel_sprouts_block = new  BrusselSproutsCrop(Refrence.NokaModBlocks.BRUSSEL_SPROUTS_BLOCK);
		cabbage_block = new CabbageCrop(Refrence.NokaModBlocks.CABBAGE_BLOCK);
		cauliflower_block = new  CauliflowerCrop(Refrence.NokaModBlocks.CAULIFLOWER_BLOCK);
		celery_block = new  CeleryCrop(Refrence.NokaModBlocks.CELERY_BLOCK);
		chives_block = new  ChivesCrop(Refrence.NokaModBlocks.CHIVES_BLOCK);
		cucumber_block = new CucumberCrop(Refrence.NokaModBlocks.CUCUMBER_BLOCK);
		eggplant_block = new EggplantCrop(Refrence.NokaModBlocks.EGGPLANT_BLOCK);
		garlic_block = new  GarlicCrop(Refrence.NokaModBlocks.GARLIC_BLOCK);
		kale_block = new  KaleCrop(Refrence.NokaModBlocks.KALE_BLOCK);
		lettuce_block = new  LettuceCrop(Refrence.NokaModBlocks.LETTUCE_BLOCK);
		mustard_block = new  MustardCrop(Refrence.NokaModBlocks.MUSTARD_BLOCK);
		onion_block = new  OnionCrop(Refrence.NokaModBlocks.ONION_BLOCK);
		pea_block = new  PeaCrop(Refrence.NokaModBlocks.PEA_BLOCK);
		radish_block = new  RadishCrop(Refrence.NokaModBlocks.RADISH_BLOCK);
		spinach_block = new  SpinachCrop(Refrence.NokaModBlocks.SPINACH_BLOCK);
		tomato_block = new  TomatoCrop(Refrence.NokaModBlocks.TOMATO_BLOCK);
		turnip_block = new  TurnipCrop(Refrence.NokaModBlocks.TURNIP_BLOCK);
		yam_block = new  YamCrop(Refrence.NokaModBlocks.YAM_BLOCK);
		zucchini_block = new  ZucchiniCrop(Refrence.NokaModBlocks.ZUCCHINI_BLOCK);
		squash_stem = new SquashStem(Refrence.NokaModBlocks.SQUASH_STEM);

	}
		
	public static void register() {
		registerBlock(cherry_log);
		registerBlock(cheese_block);
		registerBlock(artichoke_block);
		registerBlock(arugula_block);
		registerBlock(asparagus_block);
		registerBlock(bell_pepper_block);
		registerBlock(bok_choy_block);
		registerBlock(broccoli_block);
		registerBlock(broccolini_block);
		registerBlock(brussel_sprouts_block);
		registerBlock(cabbage_block);
		registerBlock(cauliflower_block);
		registerBlock(celery_block);
		registerBlock(chives_block);
		registerBlock(cucumber_block);
		registerBlock(eggplant_block);
		registerBlock(garlic_block);
		registerBlock(kale_block);
		registerBlock(lettuce_block);
		registerBlock(mustard_block);
		registerBlock(onion_block);
		registerBlock(pea_block);
		registerBlock(radish_block);
		registerBlock(spinach_block);
		registerBlock(squash_block);
		registerBlock(squash_stem);
		registerBlock(tomato_block);
		registerBlock(turnip_block);
		registerBlock(yam_block);
		registerBlock(zucchini_block);
		
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		register(cherry_log);
		register(cheese_block);
		register(asparagus_block);
		register(zucchini_block);
		register(yam_block);
		register(artichoke_block);
		register(bell_pepper_block);
		register(bok_choy_block);
		register(broccoli_block);
		register(broccolini_block);
		register(brussel_sprouts_block);
		register(cabbage_block);
		register(cauliflower_block);
		register(celery_block);
		register(arugula_block);
		register(chives_block);
		register(cucumber_block);
		register(eggplant_block);
		register(garlic_block);
		register(kale_block);
		register(lettuce_block);
		register(mustard_block);
		register(onion_block);
		register(pea_block);
		register(radish_block);
		register(spinach_block);
		register(squash_block);
		register(tomato_block);
		register(turnip_block);
		register(squash_stem);
	}
	
	private static void register(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}

	
}
