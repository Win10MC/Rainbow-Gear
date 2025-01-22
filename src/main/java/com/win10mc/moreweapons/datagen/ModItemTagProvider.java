package com.win10mc.moreweapons.datagen;

import com.win10mc.moreweapons.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		getOrCreateTagBuilder(ItemTags.SWORDS)
			.add(ModItems.RED_SWORD)
			.add(ModItems.ORANGE_SWORD)
			.add(ModItems.YELLOW_SWORD)
			.add(ModItems.GREEN_SWORD)
			.add(ModItems.BLUE_SWORD)
			.add(ModItems.PURPLE_SWORD);

		getOrCreateTagBuilder(ItemTags.PICKAXES)
				.add(ModItems.RED_PICKAXE)
				.add(ModItems.ORANGE_PICKAXE)
				.add(ModItems.YELLOW_PICKAXE)
				.add(ModItems.GREEN_PICKAXE)
				.add(ModItems.BLUE_PICKAXE)
				.add(ModItems.PURPLE_PICKAXE);

		getOrCreateTagBuilder(ItemTags.AXES)
				.add(ModItems.RED_AXE)
				.add(ModItems.ORANGE_AXE)
				.add(ModItems.YELLOW_AXE)
				.add(ModItems.GREEN_AXE)
				.add(ModItems.BLUE_AXE)
				.add(ModItems.PURPLE_AXE);

		getOrCreateTagBuilder(ItemTags.SHOVELS)
				.add(ModItems.RED_SHOVEL)
				.add(ModItems.ORANGE_SHOVEL)
				.add(ModItems.YELLOW_SHOVEL)
				.add(ModItems.GREEN_SHOVEL)
				.add(ModItems.BLUE_SHOVEL)
				.add(ModItems.PURPLE_SHOVEL);

		getOrCreateTagBuilder(ItemTags.HOES)
				.add(ModItems.RED_HOE)
				.add(ModItems.ORANGE_HOE)
				.add(ModItems.YELLOW_HOE)
				.add(ModItems.GREEN_HOE)
				.add(ModItems.BLUE_HOE)
				.add(ModItems.PURPLE_HOE);

		getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ModItems.RED_HELMET)
				.add(ModItems.RED_CHESTPLATE)
				.add(ModItems.RED_LEGGINGS)
				.add(ModItems.RED_BOOTS)

				.add(ModItems.ORANGE_HELMET)
				.add(ModItems.ORANGE_CHESTPLATE)
				.add(ModItems.ORANGE_LEGGINGS)
				.add(ModItems.ORANGE_BOOTS)

				.add(ModItems.YELLOW_HELMET)
				.add(ModItems.YELLOW_CHESTPLATE)
				.add(ModItems.YELLOW_LEGGINGS)
				.add(ModItems.YELLOW_BOOTS)

				.add(ModItems.GREEN_HELMET)
				.add(ModItems.GREEN_CHESTPLATE)
				.add(ModItems.GREEN_LEGGINGS)
				.add(ModItems.GREEN_BOOTS)

				.add(ModItems.BLUE_HELMET)
				.add(ModItems.BLUE_CHESTPLATE)
				.add(ModItems.BLUE_LEGGINGS)
				.add(ModItems.BLUE_BOOTS)

				.add(ModItems.PURPLE_HELMET)
				.add(ModItems.PURPLE_CHESTPLATE)
				.add(ModItems.PURPLE_LEGGINGS)
				.add(ModItems.PURPLE_BOOTS);
	}
}
