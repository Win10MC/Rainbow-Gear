package com.win10mc.moreweapons.item;

import com.win10mc.moreweapons.ModInformation;
import com.win10mc.moreweapons.MoreWeapons;
import com.win10mc.moreweapons.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

	public static final ItemGroup ITEMS_GROUP = Registry.register(
		Registries.ITEM_GROUP, Identifier.of(ModInformation.Id, "items"),
		FabricItemGroup.builder()
		    .icon(() -> new ItemStack(ModItems.RED_GEM))
		    .displayName(Text.translatable("itemgroup.moreweapons.items"))
		    .entries((displayContext, entries) -> {
				entries.add(ModItems.RED_GEM);
				entries.add(ModItems.ORANGE_GEM);
				entries.add(ModItems.YELLOW_GEM);
				entries.add(ModItems.GREEN_GEM);
				entries.add(ModItems.BLUE_GEM);
				entries.add(ModItems.PURPLE_GEM);

				entries.add(ModItems.RED_SWORD);
				entries.add(ModItems.RED_PICKAXE);
				entries.add(ModItems.RED_AXE);
				entries.add(ModItems.RED_SHOVEL);
				entries.add(ModItems.RED_HOE);

				entries.add(ModItems.ORANGE_SWORD);
				entries.add(ModItems.ORANGE_PICKAXE);
				entries.add(ModItems.ORANGE_AXE);
				entries.add(ModItems.ORANGE_SHOVEL);
				entries.add(ModItems.ORANGE_HOE);

				entries.add(ModItems.YELLOW_SWORD);
				entries.add(ModItems.YELLOW_PICKAXE);
				entries.add(ModItems.YELLOW_AXE);
				entries.add(ModItems.YELLOW_SHOVEL);
				entries.add(ModItems.YELLOW_HOE);

				entries.add(ModItems.GREEN_SWORD);
				entries.add(ModItems.GREEN_PICKAXE);
				entries.add(ModItems.GREEN_AXE);
				entries.add(ModItems.GREEN_SHOVEL);
				entries.add(ModItems.GREEN_HOE);

				entries.add(ModItems.BLUE_SWORD);
				entries.add(ModItems.BLUE_PICKAXE);
				entries.add(ModItems.BLUE_AXE);
				entries.add(ModItems.BLUE_SHOVEL);
				entries.add(ModItems.BLUE_HOE);

				entries.add(ModItems.PURPLE_SWORD);
				entries.add(ModItems.PURPLE_PICKAXE);
				entries.add(ModItems.PURPLE_AXE);
				entries.add(ModItems.PURPLE_SHOVEL);
				entries.add(ModItems.PURPLE_HOE);

				entries.add(ModItems.RED_HELMET);
				entries.add(ModItems.RED_CHESTPLATE);
				entries.add(ModItems.RED_LEGGINGS);
				entries.add(ModItems.RED_BOOTS);

				entries.add(ModItems.ORANGE_HELMET);
				entries.add(ModItems.ORANGE_CHESTPLATE);
				entries.add(ModItems.ORANGE_LEGGINGS);
				entries.add(ModItems.ORANGE_BOOTS);

				entries.add(ModItems.YELLOW_HELMET);
				entries.add(ModItems.YELLOW_CHESTPLATE);
				entries.add(ModItems.YELLOW_LEGGINGS);
				entries.add(ModItems.YELLOW_BOOTS);

				entries.add(ModItems.GREEN_HELMET);
				entries.add(ModItems.GREEN_CHESTPLATE);
				entries.add(ModItems.GREEN_LEGGINGS);
				entries.add(ModItems.GREEN_BOOTS);

				entries.add(ModItems.BLUE_HELMET);
				entries.add(ModItems.BLUE_CHESTPLATE);
				entries.add(ModItems.BLUE_LEGGINGS);
				entries.add(ModItems.BLUE_BOOTS);

				entries.add(ModItems.PURPLE_HELMET);
				entries.add(ModItems.PURPLE_CHESTPLATE);
				entries.add(ModItems.PURPLE_LEGGINGS);
				entries.add(ModItems.PURPLE_BOOTS);
		    })
		    .build()
	);

    public static final ItemGroup BLOCKS_GROUP = Registry.register(
	    Registries.ITEM_GROUP, Identifier.of(ModInformation.Id, "blocks"),
	    FabricItemGroup.builder()
				.icon(() -> new ItemStack(ModBlocks.RED_BLOCK))
				.displayName(Text.translatable("itemgroup.moreweapons.blocks"))
				.entries((displayContext, entries) -> {

					entries.add(ModBlocks.RED_BLOCK);
					entries.add(ModBlocks.RED_ORE);
					entries.add(ModBlocks.RED_DEEPSLATE_ORE);

					entries.add(ModBlocks.ORANGE_BLOCK);
					entries.add(ModBlocks.ORANGE_ORE);
					entries.add(ModBlocks.ORANGE_DEEPSLATE_ORE);

					entries.add(ModBlocks.YELLOW_BLOCK);
					entries.add(ModBlocks.YELLOW_ORE);
					entries.add(ModBlocks.YELLOW_DEEPSLATE_ORE);

					entries.add(ModBlocks.GREEN_BLOCK);
					entries.add(ModBlocks.GREEN_ORE);
					entries.add(ModBlocks.GREEN_DEEPSLATE_ORE);

					entries.add(ModBlocks.BLUE_BLOCK);
					entries.add(ModBlocks.BLUE_ORE);
					entries.add(ModBlocks.BLUE_DEEPSLATE_ORE);

					entries.add(ModBlocks.PURPLE_BLOCK);
					entries.add(ModBlocks.PURPLE_ORE);
					entries.add(ModBlocks.PURPLE_DEEPSLATE_ORE);
				})
		    	.build()
    );

	public static void register() {
		MoreWeapons.LOGGER.info("Registering Item Groups for " + ModInformation.Id);
	}

}
