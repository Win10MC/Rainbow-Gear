package com.win10mc.rainbowgear.world;

import com.win10mc.rainbowgear.ModInformation;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
	public static final RegistryKey<PlacedFeature> RED_ORE_PLACED_KEY = registerKey("red_ore_placed");
	public static final RegistryKey<PlacedFeature> ORANGE_ORE_PLACED_KEY = registerKey("orange_ore_placed");
	public static final RegistryKey<PlacedFeature> YELLOW_ORE_PLACED_KEY = registerKey("yellow_ore_placed");
	public static final RegistryKey<PlacedFeature> GREEN_ORE_PLACED_KEY = registerKey("green_ore_placed");
	public static final RegistryKey<PlacedFeature> BLUE_ORE_PLACED_KEY = registerKey("blue_ore_placed");
	public static final RegistryKey<PlacedFeature> PURPLE_ORE_PLACED_KEY = registerKey("purple_ore_placed");

	public static void bootstrap(Registerable<PlacedFeature> context) {
		var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, RED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_ORE_KEY),
				ModOrePlacement.modifiersWithCount(28,
						HeightRangePlacementModifier.uniform(YOffset.fixed(40), YOffset.fixed(60))));

		register(context, ORANGE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_ORE_KEY),
				ModOrePlacement.modifiersWithCount(24,
						HeightRangePlacementModifier.uniform(YOffset.fixed(35), YOffset.fixed(55))));

		register(context, YELLOW_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_ORE_KEY),
				ModOrePlacement.modifiersWithCount(20,
						HeightRangePlacementModifier.uniform(YOffset.fixed(25), YOffset.fixed(40))));

		register(context, GREEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_ORE_KEY),
				ModOrePlacement.modifiersWithCount(16,
						HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(35))));

		register(context, BLUE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_ORE_KEY),
				ModOrePlacement.modifiersWithCount(12,
						HeightRangePlacementModifier.uniform(YOffset.fixed(-10), YOffset.fixed(20))));

		register(context, PURPLE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_ORE_KEY),
				ModOrePlacement.modifiersWithCount(8,
						HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(5))));
	}

	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ModInformation.Id, name));
	}

	private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
								 List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
																				   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
																				   PlacementModifier... modifiers) {
		register(context, key, configuration, List.of(modifiers));
	}
}