package com.tayloristic.nokamod.blocks.crops;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;
import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class ArtichokeCrop extends BlockCrops {
		
	/** 
	 * Constructs the Artichoke Crop.
	 * @param block the block for the crop.
	 */
	public ArtichokeCrop(NokaModBlocks block) {
		super();
		setUnlocalizedName(block.getUnlocalizedName());
		setRegistryName(block.getRegistryName());
	}
    
    @Override	
    protected Item getSeed()
    {
        return ModItems.artichoke_seeds;
    }

    @Override
    protected Item getCrop()
    {
        return ModItems.artichoke;
    }
    
}