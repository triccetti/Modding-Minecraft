package com.tayloristic.nokamod.blocks.crops;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;
import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BrusselSproutsCrop extends BlockCrops {
			
	public BrusselSproutsCrop(NokaModBlocks block) {
		super();
		setUnlocalizedName(block.getUnlocalizedName());
		setRegistryName(block.getRegistryName());
	}
    
    @Override	
    protected Item getSeed()
    {
        return ModItems.brussel_sprouts_seeds;
    }

    @Override
    protected Item getCrop()
    {
        return ModItems.brussel_sprouts;
    }

}