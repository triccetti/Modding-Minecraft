package com.tayloristic.nokamod.blocks.customBlocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;

public class ModBlockLog {

	public static enum EnumWoodType implements IStringSerializable {
		ALMOND		(0, "log_almond", MapColor.WOOD), 
		CHERRY	(1, "log_cherry", MapColor.WOOD);
		
		
		private static final ModBlockLog.EnumWoodType[]	META_LOOKUP	= new ModBlockLog.EnumWoodType[values().length];
		private final int meta;
		private final String registryName;
		private final String unlocalizedName;
		private final MapColor field_181071_k;

		private EnumWoodType(int meta, String registryName, MapColor color) {
			this(meta, registryName, registryName, color);
		}

		private EnumWoodType(int meta, String registryName, String unlocalizedName, MapColor color)
		{
			this.meta = meta;
			this.registryName = registryName;
			this.unlocalizedName = unlocalizedName;
			this.field_181071_k = color;
		}

		public int getMetadata()
		{
			return this.meta;
		}

		public MapColor func_181070_c()
		{
			return this.field_181071_k;
		}

		public String toString()
		{
			return this.registryName;
		}

		public static ModBlockLog.EnumWoodType byMetadata(int meta)
		{
			if (meta < 0 || meta >= META_LOOKUP.length)
			{
				meta = 0;
			}

			return META_LOOKUP[meta];
		}

		public String getName()
		{
			return this.registryName;
		}

		public String getUnlocalizedName()
		{
			return this.unlocalizedName;
		}

		static
		{
			for (ModBlockLog.EnumWoodType PrimalBlockPlanks$enumtype : values())
			{
				META_LOOKUP[PrimalBlockPlanks$enumtype.getMetadata()] = PrimalBlockPlanks$enumtype;
			}
		}
	}
}
