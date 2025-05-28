package com.provafinale;

import com.provafinale.block.ModBlocks;
import com.provafinale.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProvaFinale implements ModInitializer {

	public static final String MOD_ID = "provafinale";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.SGORBIO, 8700);

	}
}