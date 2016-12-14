package com.tayloristic.nokamod.proxy;

import com.tayloristic.nokamod.init.ModBlocks;
import com.tayloristic.nokamod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}	
	
}
