package com.tayloristic.nokamod.blocks.customBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlockPlanks extends Block {
	public static final PropertyEnum<ModBlockPlanks.EnumType> VARIANT = PropertyEnum.<ModBlockPlanks.EnumType>create(
			"variant", ModBlockPlanks.EnumType.class);

	public ModBlockPlanks() {
		super(Material.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, ModBlockPlanks.EnumType.ALMOND));
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	/**
	 * Gets the metadata of the item this Block can drop. This method is called
	 * when the block gets destroyed. It returns the metadata of the dropped
	 * item based on the old metadata of the block.
	 */
	public int damageDropped(IBlockState state) {
		return ((ModBlockPlanks.EnumType) state.getValue(VARIANT)).getMetadata();
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood
	 * returns 4 blocks)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
		for (ModBlockPlanks.EnumType modblockplanks$enumtype : ModBlockPlanks.EnumType.values()) {
			list.add(new ItemStack(itemIn, 1, modblockplanks$enumtype.getMetadata()));
		}
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, ModBlockPlanks.EnumType.byMetadata(meta));
	}

	/**
	 * Get the MapColor for this Block and the given BlockState
	 */
	public MapColor getMapColor(IBlockState state) {
		return ((ModBlockPlanks.EnumType) state.getValue(VARIANT)).getMapColor();
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	public int getMetaFromState(IBlockState state) {
		return ((ModBlockPlanks.EnumType) state.getValue(VARIANT)).getMetadata();
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { VARIANT });
	}

	public static enum EnumType implements IStringSerializable {
		ALMOND(0, "almond", MapColor.WOOD), CHERRY(1, "cherry", MapColor.OBSIDIAN);

		private static final ModBlockPlanks.EnumType[] META_LOOKUP = new ModBlockPlanks.EnumType[values().length];
		private final int meta;
		private final String name;
		private final String unlocalizedName;
		/** The color that represents this entry on a map. */
		private final MapColor mapColor;

		private EnumType(int metaIn, String nameIn, MapColor mapColorIn) {
			this(metaIn, nameIn, nameIn, mapColorIn);
		}

		private EnumType(int metaIn, String nameIn, String unlocalizedNameIn, MapColor mapColorIn) {
			this.meta = metaIn;
			this.name = nameIn;
			this.unlocalizedName = unlocalizedNameIn;
			this.mapColor = mapColorIn;
		}

		public int getMetadata() {
			return this.meta;
		}

		/**
		 * The color which represents this entry on a map.
		 */
		public MapColor getMapColor() {
			return this.mapColor;
		}

		public String toString() {
			return this.name;
		}

		public static ModBlockPlanks.EnumType byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length) {
				meta = 0;
			}

			return META_LOOKUP[meta];
		}

		public String getName() {
			return this.name;
		}

		public String getUnlocalizedName() {
			return this.unlocalizedName;
		}

		static {
			for (ModBlockPlanks.EnumType modblockplanks$enumtype : values()) {
				META_LOOKUP[modblockplanks$enumtype.getMetadata()] = modblockplanks$enumtype;
			}
		}
	}
}
