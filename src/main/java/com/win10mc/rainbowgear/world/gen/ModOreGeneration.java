package com.win10mc.rainbowgear.world.gen;

import com.win10mc.rainbowgear.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
	public static void generateOres() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				ModPlacedFeatures.RED_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				ModPlacedFeatures.ORANGE_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				ModPlacedFeatures.YELLOW_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				ModPlacedFeatures.GREEN_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				ModPlacedFeatures.BLUE_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				ModPlacedFeatures.PURPLE_ORE_PLACED_KEY);
	}
}
