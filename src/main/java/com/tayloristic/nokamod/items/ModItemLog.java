package com.tayloristic.nokamod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ModItemLog extends ItemBlock {

	private final static String[] subNames = {
		"apple", "palm"
	};

	public ModItemLog(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata (int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return "tile.log_" + subNames[itemstack.getItemDamage()] ;
	}
}