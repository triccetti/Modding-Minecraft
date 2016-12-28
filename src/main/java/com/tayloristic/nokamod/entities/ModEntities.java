package com.tayloristic.nokamod.entities;

import com.tayloristic.nokamod.NokaMod;
import com.tayloristic.nokamod.entities.Buffalo.EntityBuffalo;
import com.tayloristic.nokamod.entities.Buffalo.RenderBuffalo;
import com.tayloristic.nokamod.entities.Goat.EntityGoat;
import com.tayloristic.nokamod.entities.Goat.RenderGoat;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

	private static int ID = 1;
	
    public static void init() {
        register();
        addSpawns();
        registerLootTables();
    }
    
    /** 
     * Registers all entities.
     */
    private static void register() {
    	EntityRegistry.registerModEntity(EntityGoat.GOAT_TEXTURE, EntityGoat.class, "Goat", ID++, NokaMod.instance, 64, 3, true, 0x808080, 0xe6ffcc);    
    	EntityRegistry.registerModEntity(EntityBuffalo.BUFFALO_TEXTURE, EntityBuffalo.class, "Buffalo", ID++, NokaMod.instance, 64, 3, true, 0xf4a442, 0x630b0b);    
	}

    /**
     * Adds the spawns for all entities.
     */
	private static void addSpawns() {
    	EntityRegistry.addSpawn(EntityGoat.class, 100, 3, 5, EnumCreatureType.CREATURE, Biomes.COLD_TAIGA_HILLS, 
																						Biomes.EXTREME_HILLS, 
																						Biomes.EXTREME_HILLS_EDGE, 
																						Biomes.EXTREME_HILLS_WITH_TREES, 
																						Biomes.TAIGA_HILLS, 
																						Biomes.TAIGA, 
																						Biomes.REDWOOD_TAIGA_HILLS);
    	EntityRegistry.addSpawn(EntityBuffalo.class, 100, 6, 10, EnumCreatureType.CREATURE, Biomes.ICE_PLAINS,
    																					    Biomes.PLAINS,
    																					    Biomes.SAVANNA,
    																					    Biomes.SAVANNA_PLATEAU,
    																					    Biomes.MUTATED_PLAINS);
	}

	/**
	 * Registers the loot tables for the entities.
	 */
	private static void registerLootTables() {
        LootTableList.register(EntityGoat.GOAT_TEXTURE);		
        LootTableList.register(EntityBuffalo.BUFFALO_TEXTURE);		
	}

	@SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, RenderGoat.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityBuffalo.class, RenderBuffalo.FACTORY);
    }
}
