package com.tayloristic.nokamod.blocks.customBlocks;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class AlmondLog extends BlockRotatedPillar {

	protected AlmondLog() {
		super(Material.WOOD, MapColor.BROWN);
		this.setRegistryName("AlmondLog");
	}

}
