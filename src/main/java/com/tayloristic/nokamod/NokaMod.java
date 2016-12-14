package com.tayloristic.nokamod;

import com.tayloristic.nokamod.entities.ModEntities;
import com.tayloristic.nokamod.handler.ModDropHandler;
import com.tayloristic.nokamod.init.ModBlocks;
import com.tayloristic.nokamod.init.ModCrafting;
import com.tayloristic.nokamod.init.ModItems;
import com.tayloristic.nokamod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION, acceptedMinecraftVersions = Refrence.ACCEPTED_VERSIONS)
public class NokaMod {

	@Instance
	public static NokaMod instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY, serverSide = Refrence.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.init();
		ModItems.init();	
		ModEntities.init();

		ModItems.register();	
		ModBlocks.register();	
		ModEntities.initModels();
		
		ModCrafting.register();
		ModDropHandler.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
