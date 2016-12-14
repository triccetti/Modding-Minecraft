package com.tayloristic.nokamod.blocks.customBlocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;
import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockSquash extends Block
{
    public BlockSquash(Material material, MapColor color, NokaModBlocks block )
    {
        super(material, color);
        setUnlocalizedName(block.getUnlocalizedName());
        setRegistryName(block.getRegistryName());
        
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.squash;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 1;
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return Math.min(9, this.quantityDropped(random) + random.nextInt(1 + fortune));
    }
}