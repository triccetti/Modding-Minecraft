package com.tayloristic.nokamod.blocks.customBlocks;

import java.awt.List;

import javax.annotation.Nullable;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCheese extends Block {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 14, 0.0625 * 4, 0.0625 * 14);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.0625 * 3, 0, 0.0625 * 3, 0.0625 * 13, 0.0625 * 3, 0.0625 * 13);

	
	public BlockCheese(Material blockMaterialIn, MapColor blockMapColorIn, NokaModBlocks block) {
		super(blockMaterialIn, blockMapColorIn);
		setRegistryName(block.getRegistryName());
		setUnlocalizedName(block.getUnlocalizedName());
		setCreativeTab(CreativeTabs.FOOD);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
	

	//@Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return COLLISION_BOX;
    }
}	
