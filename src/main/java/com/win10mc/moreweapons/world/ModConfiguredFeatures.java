package com.win10mc.moreweapons.world;

import com.win10mc.moreweapons.ModInformation;
import com.win10mc.moreweapons.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

	public static final RegistryKey<ConfiguredFeature<?, ?>> NEON_ORE_KEY = registerKey("neon_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ORE_KEY = registerKey("red_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_ORE_KEY = registerKey("orange_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ORE_KEY = registerKey("yellow_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_ORE_KEY = registerKey("green_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_ORE_KEY = registerKey("blue_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_ORE_KEY = registerKey("purple_ore");

	public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
		RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

		List<OreFeatureConfig.Target> overWorldRedOres =
				List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RED_ORE.getDefaultState()),
						OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RED_DEEPSLATE_ORE.getDefaultState()));

		List<OreFeatureConfig.Target> overWorldOrangeOres =
				List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ORANGE_ORE.getDefaultState()),
						OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ORANGE_DEEPSLATE_ORE.getDefaultState()));

		List<OreFeatureConfig.Target> overWorldYellowOres =
				List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.YELLOW_ORE.getDefaultState()),
						OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.YELLOW_DEEPSLATE_ORE.getDefaultState()));

		List<OreFeatureConfig.Target> overWorldGreenOres =
				List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.GREEN_ORE.getDefaultState()),
						OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.GREEN_DEEPSLATE_ORE.getDefaultState()));

		List<OreFeatureConfig.Target> overWorldBlueOres =
				List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BLUE_ORE.getDefaultState()),
						OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.BLUE_DEEPSLATE_ORE.getDefaultState()));

		List<OreFeatureConfig.Target> overWorldPurpleOres =
				List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PURPLE_ORE.getDefaultState()),
						OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.PURPLE_DEEPSLATE_ORE.getDefaultState()));

		register(context, RED_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldRedOres, 5));
		register(context, ORANGE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldOrangeOres, 5));
		register(context, YELLOW_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldYellowOres, 5));
		register(context, GREEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldGreenOres, 5));
		register(context, BLUE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldBlueOres, 5));
		register(context, PURPLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldPurpleOres, 5));
	}

	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ModInformation.Id, name));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
																				   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}

}
