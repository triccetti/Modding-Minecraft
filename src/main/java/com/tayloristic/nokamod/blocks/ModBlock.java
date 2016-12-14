package com.tayloristic.nokamod.blocks;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {

	
	public ModBlock(Material blockMaterialIn, MapColor blockMapColorIn, NokaModBlocks block) {
		super(blockMaterialIn, blockMapColorIn);
		setRegistryName(block.getRegistryName());
		setUnlocalizedName(block.getUnlocalizedName());
	}

	
}
