package com.win10mc.moreweapons;

import com.win10mc.moreweapons.block.ModBlocks;
import com.win10mc.moreweapons.item.ModItemGroups;
import com.win10mc.moreweapons.item.ModItems;
import com.win10mc.moreweapons.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreWeapons implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(ModInformation.Id);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
	    ModItemGroups.register();
		ModWorldGeneration.generateModWorldGen();
	}
}