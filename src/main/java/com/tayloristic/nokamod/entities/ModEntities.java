package com.tayloristic.nokamod.entities;

import com.tayloristic.nokamod.NokaMod;
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

    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(EntityGoat.GOAT_TEXTURE, EntityGoat.class, "Goat", id++, NokaMod.instance, 64, 3, true, 0x808080, 0xe6ffcc);
        
        //where our goat spawns
        EntityRegistry.addSpawn(EntityGoat.class, 100, 3, 5, EnumCreatureType.CREATURE, Biomes.COLD_TAIGA_HILLS, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.TAIGA_HILLS, Biomes.TAIGA, Biomes.REDWOOD_TAIGA_HILLS);
        
        LootTableList.register(EntityGoat.GOAT_TEXTURE);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, RenderGoat.FACTORY);
    }
}
