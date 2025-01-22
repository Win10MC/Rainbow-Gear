package com.win10mc.moreweapons.datagen;

import com.win10mc.moreweapons.block.ModBlocks;
import com.win10mc.moreweapons.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		// Define mining tool tiers
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(ModBlocks.RED_BLOCK)
				.add(ModBlocks.RED_ORE)
				.add(ModBlocks.RED_DEEPSLATE_ORE)
				.add(ModBlocks.ORANGE_BLOCK)
				.add(ModBlocks.ORANGE_ORE)
				.add(ModBlocks.ORANGE_DEEPSLATE_ORE)
				.add(ModBlocks.YELLOW_BLOCK)
				.add(ModBlocks.YELLOW_ORE)
				.add(ModBlocks.YELLOW_DEEPSLATE_ORE)
				.add(ModBlocks.GREEN_BLOCK)
				.add(ModBlocks.GREEN_ORE)
				.add(ModBlocks.GREEN_DEEPSLATE_ORE)
				.add(ModBlocks.BLUE_BLOCK)
				.add(ModBlocks.BLUE_ORE)
				.add(ModBlocks.BLUE_DEEPSLATE_ORE)
				.add(ModBlocks.PURPLE_BLOCK)
				.add(ModBlocks.PURPLE_ORE)
				.add(ModBlocks.PURPLE_DEEPSLATE_ORE);

		// Iron tools can only mine up to red
		getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
				.add(ModBlocks.RED_BLOCK)
				.add(ModBlocks.RED_ORE)
				.add(ModBlocks.RED_DEEPSLATE_ORE);

		// Red tool tier
		getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RED_TOOL)
				.add(ModBlocks.RED_BLOCK)
				.add(ModBlocks.RED_ORE)
				.add(ModBlocks.RED_DEEPSLATE_ORE);

		// Orange tool tier (cannot mine red)
		getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ORANGE_TOOL)
				.add(ModBlocks.ORANGE_BLOCK)
				.add(ModBlocks.ORANGE_ORE)
				.add(ModBlocks.ORANGE_DEEPSLATE_ORE);

		// Yellow tool tier (cannot mine orange or red)
		getOrCreateTagBuilder(ModTags.Blocks.NEEDS_YELLOW_TOOL)
				.add(ModBlocks.YELLOW_BLOCK)
				.add(ModBlocks.YELLOW_ORE)
				.add(ModBlocks.YELLOW_DEEPSLATE_ORE);

		// Green tool tier (cannot mine yellow, orange, or red)
		getOrCreateTagBuilder(ModTags.Blocks.NEEDS_GREEN_TOOL)
				.add(ModBlocks.GREEN_BLOCK)
				.add(ModBlocks.GREEN_ORE)
				.add(ModBlocks.GREEN_DEEPSLATE_ORE);

		// Blue tool tier (cannot mine green, yellow, orange, or red)
		getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BLUE_TOOL)
				.add(ModBlocks.BLUE_BLOCK)
				.add(ModBlocks.BLUE_ORE)
				.add(ModBlocks.BLUE_DEEPSLATE_ORE);

		// Purple tool tier (cannot mine blue, green, yellow, orange, or red)
		getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PURPLE_TOOL)
				.add(ModBlocks.PURPLE_BLOCK)
				.add(ModBlocks.PURPLE_ORE)
				.add(ModBlocks.PURPLE_DEEPSLATE_ORE);
	}
}
