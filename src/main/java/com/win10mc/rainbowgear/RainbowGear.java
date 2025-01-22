package com.win10mc.rainbowgear;

import com.win10mc.rainbowgear.block.ModBlocks;
import com.win10mc.rainbowgear.item.ModItemGroups;
import com.win10mc.rainbowgear.item.ModItems;
import com.win10mc.rainbowgear.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RainbowGear implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(ModInformation.Id);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
	    ModItemGroups.register();
		ModWorldGeneration.generateModWorldGen();
	}
}