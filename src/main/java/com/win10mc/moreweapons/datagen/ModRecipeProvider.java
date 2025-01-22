package com.win10mc.moreweapons.datagen;

import com.win10mc.moreweapons.block.ModBlocks;
import com.win10mc.moreweapons.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.concurrent.CompletableFuture;
import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	private void pickaxeRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, item)
				.pattern("MMM")
				.pattern(" S ")
				.pattern(" S ")
				.input('M', material)
				.input('S', Items.STICK)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void axeRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, item)
				.pattern("MM ")
				.pattern("MS ")
				.pattern(" S ")
				.input('M', material)
				.input('S', Items.STICK)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void shovelRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, item)
				.pattern(" M ")
				.pattern(" S ")
				.pattern(" S ")
				.input('M', material)
				.input('S', Items.STICK)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void hoeRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, item)
				.pattern("MM ")
				.pattern(" S ")
				.pattern(" S ")
				.input('M', material)
				.input('S', Items.STICK)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void swordRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, item)
				.pattern(" M ")
				.pattern(" M ")
				.pattern(" S ")
				.input('M', material)
				.input('S', Items.STICK)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void helmetRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, item)
				.pattern("MMM")
				.pattern("M M")
				.pattern("   ")
				.input('M', material)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void chestplateRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, item)
				.pattern("M M")
				.pattern("MMM")
				.pattern("MMM")
				.input('M', material)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void leggingsRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, item)
				.pattern("MMM")
				.pattern("M M")
				.pattern("M M")
				.input('M', material)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	private void bootsRecipe(RecipeExporter exporter, ItemConvertible item, ItemConvertible material) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, item)
				.pattern("   ")
				.pattern("M M")
				.pattern("M M")
				.input('M', material)
				.criterion("has_material", conditionsFromItem(material))
				.offerTo(exporter);
	}

	@Override
	public void generate(RecipeExporter exporter) {
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_GEM, RecipeCategory.DECORATIONS, ModBlocks.RED_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORANGE_GEM, RecipeCategory.DECORATIONS, ModBlocks.ORANGE_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.YELLOW_GEM, RecipeCategory.DECORATIONS, ModBlocks.YELLOW_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GREEN_GEM, RecipeCategory.DECORATIONS, ModBlocks.GREEN_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_GEM, RecipeCategory.DECORATIONS, ModBlocks.BLUE_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPLE_GEM, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_BLOCK);
		swordRecipe(exporter, ModItems.RED_SWORD, ModItems.RED_GEM);
		pickaxeRecipe(exporter, ModItems.RED_PICKAXE, ModItems.RED_GEM);
		axeRecipe(exporter, ModItems.RED_AXE, ModItems.RED_GEM);
		shovelRecipe(exporter, ModItems.RED_SHOVEL, ModItems.RED_GEM);
		hoeRecipe(exporter, ModItems.RED_HOE, ModItems.RED_GEM);

		swordRecipe(exporter, ModItems.ORANGE_SWORD, ModItems.ORANGE_GEM);
		pickaxeRecipe(exporter, ModItems.ORANGE_PICKAXE, ModItems.ORANGE_GEM);
		axeRecipe(exporter, ModItems.ORANGE_AXE, ModItems.ORANGE_GEM);
		shovelRecipe(exporter, ModItems.ORANGE_SHOVEL, ModItems.ORANGE_GEM);
		hoeRecipe(exporter, ModItems.ORANGE_HOE, ModItems.ORANGE_GEM);

		swordRecipe(exporter, ModItems.YELLOW_SWORD, ModItems.YELLOW_GEM);
		pickaxeRecipe(exporter, ModItems.YELLOW_PICKAXE, ModItems.YELLOW_GEM);
		axeRecipe(exporter, ModItems.YELLOW_AXE, ModItems.YELLOW_GEM);
		shovelRecipe(exporter, ModItems.YELLOW_SHOVEL, ModItems.YELLOW_GEM);
		hoeRecipe(exporter, ModItems.YELLOW_HOE, ModItems.YELLOW_GEM);

		swordRecipe(exporter, ModItems.GREEN_SWORD, ModItems.GREEN_GEM);
		pickaxeRecipe(exporter, ModItems.GREEN_PICKAXE, ModItems.GREEN_GEM);
		axeRecipe(exporter, ModItems.GREEN_AXE, ModItems.GREEN_GEM);
		shovelRecipe(exporter, ModItems.GREEN_SHOVEL, ModItems.GREEN_GEM);
		hoeRecipe(exporter, ModItems.GREEN_HOE, ModItems.GREEN_GEM);

		swordRecipe(exporter, ModItems.BLUE_SWORD, ModItems.BLUE_GEM);
		pickaxeRecipe(exporter, ModItems.BLUE_PICKAXE, ModItems.BLUE_GEM);
		axeRecipe(exporter, ModItems.BLUE_AXE, ModItems.BLUE_GEM);
		shovelRecipe(exporter, ModItems.BLUE_SHOVEL, ModItems.BLUE_GEM);
		hoeRecipe(exporter, ModItems.BLUE_HOE, ModItems.BLUE_GEM);

		swordRecipe(exporter, ModItems.PURPLE_SWORD, ModItems.PURPLE_GEM);
		pickaxeRecipe(exporter, ModItems.PURPLE_PICKAXE, ModItems.PURPLE_GEM);
		axeRecipe(exporter, ModItems.PURPLE_AXE, ModItems.PURPLE_GEM);
		shovelRecipe(exporter, ModItems.PURPLE_SHOVEL, ModItems.PURPLE_GEM);
		hoeRecipe(exporter, ModItems.PURPLE_HOE, ModItems.PURPLE_GEM);

		helmetRecipe(exporter, ModItems.RED_HELMET, ModItems.RED_GEM);
		chestplateRecipe(exporter, ModItems.RED_CHESTPLATE, ModItems.RED_GEM);
		leggingsRecipe(exporter, ModItems.RED_LEGGINGS, ModItems.RED_GEM);
		bootsRecipe(exporter, ModItems.RED_BOOTS, ModItems.RED_GEM);

		helmetRecipe(exporter, ModItems.ORANGE_HELMET, ModItems.ORANGE_GEM);
		chestplateRecipe(exporter, ModItems.ORANGE_CHESTPLATE, ModItems.ORANGE_GEM);
		leggingsRecipe(exporter, ModItems.ORANGE_LEGGINGS, ModItems.ORANGE_GEM);
		bootsRecipe(exporter, ModItems.ORANGE_BOOTS, ModItems.ORANGE_GEM);

		helmetRecipe(exporter, ModItems.YELLOW_HELMET, ModItems.YELLOW_GEM);
		chestplateRecipe(exporter, ModItems.YELLOW_CHESTPLATE, ModItems.YELLOW_GEM);
		leggingsRecipe(exporter, ModItems.YELLOW_LEGGINGS, ModItems.YELLOW_GEM);
		bootsRecipe(exporter, ModItems.YELLOW_BOOTS, ModItems.YELLOW_GEM);

		helmetRecipe(exporter, ModItems.GREEN_HELMET, ModItems.GREEN_GEM);
		chestplateRecipe(exporter, ModItems.GREEN_CHESTPLATE, ModItems.GREEN_GEM);
		leggingsRecipe(exporter, ModItems.GREEN_LEGGINGS, ModItems.GREEN_GEM);
		bootsRecipe(exporter, ModItems.GREEN_BOOTS, ModItems.GREEN_GEM);

		helmetRecipe(exporter, ModItems.BLUE_HELMET, ModItems.BLUE_GEM);
		chestplateRecipe(exporter, ModItems.BLUE_CHESTPLATE, ModItems.BLUE_GEM);
		leggingsRecipe(exporter, ModItems.BLUE_LEGGINGS, ModItems.BLUE_GEM);
		bootsRecipe(exporter, ModItems.BLUE_BOOTS, ModItems.BLUE_GEM);

		helmetRecipe(exporter, ModItems.PURPLE_HELMET, ModItems.PURPLE_GEM);
		chestplateRecipe(exporter, ModItems.PURPLE_CHESTPLATE, ModItems.PURPLE_GEM);
		leggingsRecipe(exporter, ModItems.PURPLE_LEGGINGS, ModItems.PURPLE_GEM);
		bootsRecipe(exporter, ModItems.PURPLE_BOOTS, ModItems.PURPLE_GEM);
	}
}