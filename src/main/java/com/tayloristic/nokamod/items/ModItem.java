package com.tayloristic.nokamod.items;

import com.tayloristic.nokamod.Refrence.NokaModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item {
	
	public ModItem(CreativeTabs tab, NokaModItems item) {
		setUnlocalizedName(item.getUnlocalizedName());
		setRegistryName(item.getRegistryName());
		setCreativeTab(tab);
	}
}
