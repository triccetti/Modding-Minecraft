package com.tayloristic.nokamod.blocks.customBlocks;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.tayloristic.nokamod.Refrence.NokaModBlocks;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModOldLog extends BlockLog {
	public static final PropertyEnum<ModBlockPlanks.EnumType> VARIANT = PropertyEnum.<ModBlockPlanks.EnumType>create(
			"variant", ModBlockPlanks.EnumType.class, new Predicate<ModBlockPlanks.EnumType>() {
				public boolean apply(@Nullable ModBlockPlanks.EnumType p_apply_1_) {
					return p_apply_1_.getMetadata() < 4;
				}
			});

	public ModOldLog(NokaModBlocks block) {
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, ModBlockPlanks.EnumType.ALMOND)
				.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
		this.setRegistryName(block.getRegistryName());
		this.setUnlocalizedName(getRegistryName().toString());
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

	}

	/**
	 * Get the MapColor for this Block and the given BlockState
	 */
	public MapColor getMapColor(IBlockState state) {
		ModBlockPlanks.EnumType modblockplanks$enumtype = (ModBlockPlanks.EnumType) state.getValue(VARIANT);

		switch ((BlockLog.EnumAxis) state.getValue(LOG_AXIS)) {
		case X:
		case Z:
		case NONE:
		default:

			switch (modblockplanks$enumtype) {
			case ALMOND:
			default:
				return ModBlockPlanks.EnumType.CHERRY.getMapColor();
			case CHERRY:
				return ModBlockPlanks.EnumType.ALMOND.getMapColor();
			// case BIRCH:
			// return MapColor.QUARTZ;
			// case JUNGLE:
			// return ModBlockPlanks.EnumType.SPRUCE.getMapColor();
			}

		case Y:
			return modblockplanks$enumtype.getMapColor();
		}
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood
	 * returns 4 blocks)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
		list.add(new ItemStack(itemIn, 1, ModBlockPlanks.EnumType.ALMOND.getMetadata()));
		list.add(new ItemStack(itemIn, 1, ModBlockPlanks.EnumType.CHERRY.getMetadata()));
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta) {
		IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT,
				ModBlockPlanks.EnumType.byMetadata((meta & 3) % 4));

		switch (meta & 12) {
		case 0:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
			break;
		case 4:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
			break;
		case 8:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
			break;
		default:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
		}

		return iblockstate;
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	@SuppressWarnings("incomplete-switch")
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i | ((ModBlockPlanks.EnumType) state.getValue(VARIANT)).getMetadata();

		switch ((BlockLog.EnumAxis) state.getValue(LOG_AXIS)) {
		case X:
			i |= 4;
			break;
		case Z:
			i |= 8;
			break;
		case NONE:
			i |= 12;
		}

		return i;
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { VARIANT, LOG_AXIS });
	}

	protected ItemStack createStackedBlock(IBlockState state) {
		return new ItemStack(Item.getItemFromBlock(this), 1,
				((ModBlockPlanks.EnumType) state.getValue(VARIANT)).getMetadata());
	}

	/**
	 * Gets the metadata of the item this Block can drop. This method is called
	 * when the block gets destroyed. It returns the metadata of the dropped
	 * item based on the old metadata of the block.
	 */
	public int damageDropped(IBlockState state) {
		return ((ModBlockPlanks.EnumType) state.getValue(VARIANT)).getMetadata();
	}
}
