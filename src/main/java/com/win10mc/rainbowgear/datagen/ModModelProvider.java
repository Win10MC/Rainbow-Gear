package com.win10mc.rainbowgear.datagen;

import com.win10mc.rainbowgear.block.ModBlocks;
import com.win10mc.rainbowgear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_DEEPSLATE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_DEEPSLATE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_DEEPSLATE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_DEEPSLATE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_DEEPSLATE_ORE);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.RED_GEM, Models.GENERATED);
		itemModelGenerator.register(ModItems.ORANGE_GEM, Models.GENERATED);
		itemModelGenerator.register(ModItems.YELLOW_GEM, Models.GENERATED);
		itemModelGenerator.register(ModItems.GREEN_GEM, Models.GENERATED);
		itemModelGenerator.register(ModItems.BLUE_GEM, Models.GENERATED);
		itemModelGenerator.register(ModItems.PURPLE_GEM, Models.GENERATED);

		itemModelGenerator.register(ModItems.RED_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.RED_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.RED_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.RED_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.RED_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.ORANGE_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ORANGE_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ORANGE_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ORANGE_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ORANGE_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.YELLOW_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.YELLOW_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.YELLOW_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.YELLOW_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.YELLOW_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.GREEN_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.GREEN_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.GREEN_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.GREEN_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.GREEN_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.BLUE_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BLUE_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BLUE_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BLUE_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.BLUE_HOE, Models.HANDHELD);

		itemModelGenerator.register(ModItems.PURPLE_SWORD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.PURPLE_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.PURPLE_AXE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.PURPLE_SHOVEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.PURPLE_HOE, Models.HANDHELD);

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORANGE_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORANGE_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORANGE_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORANGE_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_BOOTS));

		itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURPLE_HELMET));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURPLE_CHESTPLATE));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURPLE_LEGGINGS));
		itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURPLE_BOOTS));
	}
}
