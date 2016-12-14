package com.tayloristic.nokamod.items;

import com.tayloristic.nokamod.Refrence.NokaModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ModItemFood extends ItemFood {
	
	// Basic food
	public ModItemFood(int amount, float saturation, boolean isWolfFood, CreativeTabs tab, NokaModItems item) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(item.getUnlocalizedName());
		setRegistryName(item.getRegistryName());
		setCreativeTab(tab);	
	}
}
