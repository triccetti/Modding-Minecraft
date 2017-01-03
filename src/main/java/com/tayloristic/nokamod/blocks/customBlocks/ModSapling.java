package com.tayloristic.nokamod.blocks.customBlocks;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.item.ItemStack;

public class ModSapling extends BlockSapling {
	/**
	 * A dummy property to allow for separate item models.
	 */
	public static final IProperty<Boolean> ITEM = PropertyBool.create("item");

	public ModSapling(final NokaModBlocks block) {
	    setUnlocalizedName(block.getUnlocalizedName());
	    setRegistryName(block.getRegistryName());
		setHardness(0);
		setSoundType(SoundType.PLANT);
		setDefaultState(getDefaultState().withProperty(ITEM, false));
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer.Builder(this).add(TYPE, STAGE, ITEM).build();
	}

	/**
	 * Get the unlocalised name suffix for the specified {@link ItemStack}.
	 *
	 * @param stack The ItemStack
	 * @return The unlocalised name suffix
	 */
	public static String getName(ItemStack stack) {
		final int metadata = stack.getMetadata();

		return BlockPlanks.EnumType.byMetadata(metadata).getUnlocalizedName();
	}
}