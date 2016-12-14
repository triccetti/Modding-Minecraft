package com.tayloristic.nokamod.items;

import com.tayloristic.nokamod.Refrence.NokaModItems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ModItemSeeds extends ItemSeeds {

	public ModItemSeeds(Block crops, Block soil, NokaModItems seed) {
		super(crops, soil);
		setUnlocalizedName(seed.getUnlocalizedName());
		setRegistryName(seed.getRegistryName());
		
	}

}
