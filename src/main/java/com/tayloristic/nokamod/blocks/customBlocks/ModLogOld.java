package com.tayloristic.nokamod.blocks.customBlocks;


import java.util.List;

import com.google.common.base.Predicate;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModLogOld extends BlockLog {

	public static final PropertyEnum<ModBlockLog.EnumWoodType> VARIANT = PropertyEnum.<ModBlockLog.EnumWoodType> create(
			"variant", ModBlockLog.EnumWoodType.class, new Predicate<ModBlockLog.EnumWoodType>()
			{
				public boolean apply(ModBlockLog.EnumWoodType p_apply_1_)
				{
					return p_apply_1_.getMetadata() < 4;
				}
			});
	private final String registryName;
	
	
	public ModLogOld(String registryName)
	{
		this.registryName = registryName;
		this.setRegistryName(registryName);
		this.setUnlocalizedName(getRegistryName().toString());
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, ModBlockLog.EnumWoodType.ALMOND)
				.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	public MapColor getMapColor(IBlockState state)
	{
		ModBlockLog.EnumWoodType PrimalBlockPlanks$enumtype = (ModBlockLog.EnumWoodType) state.getValue(VARIANT);

		switch ((BlockLog.EnumAxis) state.getValue(LOG_AXIS))
		{
			case X:
			case Z:
			case NONE:
			default:

				switch (PrimalBlockPlanks$enumtype)
				{
					case ALMOND:
					default:
						return ModBlockLog.EnumWoodType.ALMOND.func_181070_c();
					case CHERRY:
						return ModBlockLog.EnumWoodType.CHERRY.func_181070_c();
				}

			case Y:
				return PrimalBlockPlanks$enumtype.func_181070_c();
		}
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
	{
		list.add(new ItemStack(itemIn, 1, ModBlockLog.EnumWoodType.ALMOND.getMetadata()));
		list.add(new ItemStack(itemIn, 1, ModBlockLog.EnumWoodType.CHERRY.getMetadata()));
	}

	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT,
				ModBlockLog.EnumWoodType.byMetadata((meta & 3) % 4));

		switch (meta & 12)
		{
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

	@SuppressWarnings("incomplete-switch")
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((ModBlockLog.EnumWoodType) state.getValue(VARIANT)).getMetadata();

		switch ((BlockLog.EnumAxis) state.getValue(LOG_AXIS))
		{
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

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { VARIANT, LOG_AXIS });
	}

	protected ItemStack createStackedBlock(IBlockState state)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1,
				((ModBlockLog.EnumWoodType) state.getValue(VARIANT)).getMetadata());
	}

	public int damageDropped(IBlockState state)
	{
		return ((ModBlockLog.EnumWoodType) state.getValue(VARIANT)).getMetadata();
	}

}
