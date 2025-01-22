package com.win10mc.moreweapons.block;

import com.win10mc.moreweapons.ModInformation;
import com.win10mc.moreweapons.MoreWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

	public static final Block RED_BLOCK = registerBlock("red_block", new Block(AbstractBlock.Settings.create()
			.strength(3f)
			.requiresTool()
			.sounds(BlockSoundGroup.AMETHYST_BLOCK)
	));

	public static final Block RED_ORE = registerBlock("red_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
			AbstractBlock.Settings.create()
				.strength(3f)
				.requiresTool()
	));

	public static final Block RED_DEEPSLATE_ORE = registerBlock("red_deepslate_ore",
			new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
			AbstractBlock.Settings.create()
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)
	));

	public static final Block ORANGE_BLOCK = registerBlock("orange_block", new Block(AbstractBlock.Settings.create()
			.strength(3f)
			.requiresTool()
			.sounds(BlockSoundGroup.AMETHYST_BLOCK)
	));

	public static final Block ORANGE_ORE = registerBlock("orange_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
			AbstractBlock.Settings.create()
				.strength(3f)
				.requiresTool()
	));

	public static final Block ORANGE_DEEPSLATE_ORE = registerBlock("orange_deepslate_ore",
			new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
			AbstractBlock.Settings.create()
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)
	));

	public static final Block YELLOW_BLOCK = registerBlock("yellow_block", new Block(AbstractBlock.Settings.create()
			.strength(3f)
			.requiresTool()
			.sounds(BlockSoundGroup.AMETHYST_BLOCK)
	));

	public static final Block YELLOW_ORE = registerBlock("yellow_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
			AbstractBlock.Settings.create()
				.strength(3f)
				.requiresTool()
	));

	public static final Block YELLOW_DEEPSLATE_ORE = registerBlock("yellow_deepslate_ore",
			new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
			AbstractBlock.Settings.create()
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)
	));

	public static final Block GREEN_BLOCK = registerBlock("green_block", new Block(AbstractBlock.Settings.create()
			.strength(3f)
			.requiresTool()
			.sounds(BlockSoundGroup.AMETHYST_BLOCK)
	));

	public static final Block GREEN_ORE = registerBlock("green_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
			AbstractBlock.Settings.create()
				.strength(3f)
				.requiresTool()
	));

	public static final Block GREEN_DEEPSLATE_ORE = registerBlock("green_deepslate_ore",
			new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
			AbstractBlock.Settings.create()
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)
	));

	public static final Block BLUE_BLOCK = registerBlock("blue_block", new Block(AbstractBlock.Settings.create()
			.strength(3f)
			.requiresTool()
			.sounds(BlockSoundGroup.AMETHYST_BLOCK)
	));

	public static final Block BLUE_ORE = registerBlock("blue_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
			AbstractBlock.Settings.create()
				.strength(3f)
				.requiresTool()
	));

	public static final Block BLUE_DEEPSLATE_ORE = registerBlock("blue_deepslate_ore",
			new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
			AbstractBlock.Settings.create()
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)
	));

	public static final Block PURPLE_BLOCK = registerBlock("purple_block", new Block(AbstractBlock.Settings.create()
			.strength(3f)
			.requiresTool()
			.sounds(BlockSoundGroup.AMETHYST_BLOCK)
	));

	public static final Block PURPLE_ORE = registerBlock("purple_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
			AbstractBlock.Settings.create()
				.strength(3f)
				.requiresTool()
	));

	public static final Block PURPLE_DEEPSLATE_ORE = registerBlock("purple_deepslate_ore",
			new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
			AbstractBlock.Settings.create()
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)
	));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(ModInformation.Id, name), block);
	}

	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(ModInformation.Id, name),
				new BlockItem(block, new Item.Settings()));
	}

	public static void register() {
		MoreWeapons.LOGGER.info("Registering mod blocks for " + ModInformation.Id);
	}

}
