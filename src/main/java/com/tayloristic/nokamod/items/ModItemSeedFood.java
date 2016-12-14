package com.tayloristic.nokamod.items;

import com.tayloristic.nokamod.Refrence.NokaModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;

public class ModItemSeedFood extends ItemSeedFood {

	public ModItemSeedFood(int healAmount, float saturation, CreativeTabs tab, Block crops, Block soil, NokaModItems item) {
		super(healAmount, saturation, crops, soil);
		setCreativeTab(tab);	
		setRegistryName(item.getRegistryName());
		setUnlocalizedName(item.getUnlocalizedName());
	}

}
