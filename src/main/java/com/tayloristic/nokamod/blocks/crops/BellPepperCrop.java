package com.tayloristic.nokamod.blocks.crops;

import java.util.Random;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;
import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BellPepperCrop extends BlockCrops {
			
	public BellPepperCrop(NokaModBlocks block) {
		super();
		setUnlocalizedName(block.getUnlocalizedName());
		setRegistryName(block.getRegistryName());
	}
	
			
    @Override	
    protected Item getSeed() {
        return ModItems.bell_pepper_seeds;
    }

    @Override
    protected Item getCrop() {
    	Random rand = new Random();
    	int value = rand.nextInt(8);
    	
    	if(value % 2 == 0) {
    		return ModItems.yellow_bell_pepper;
    	} else if(value == 7) {
    		return ModItems.red_bell_pepper;
    	} else if(value == 5 || value == 3) {
    		return ModItems.orange_bell_pepper;
    	} else {
    		return ModItems.green_bell_pepper;
    	}
    }

}