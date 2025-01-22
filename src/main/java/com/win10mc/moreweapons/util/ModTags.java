package com.win10mc.moreweapons.util;

import com.win10mc.moreweapons.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

	public static class Blocks {

		public static final TagKey<Block> NEEDS_RED_TOOL = createTag("needs_red_tool");
		public static final TagKey<Block> INCORRECT_FOR_RED_TOOL = createTag("incorrect_for_red_tool");

		public static final TagKey<Block> NEEDS_ORANGE_TOOL = createTag("needs_orange_tool");
		public static final TagKey<Block> INCORRECT_FOR_ORANGE_TOOL = createTag("incorrect_for_orange_tool");

		public static final TagKey<Block> NEEDS_YELLOW_TOOL = createTag("needs_yellow_tool");
		public static final TagKey<Block> INCORRECT_FOR_YELLOW_TOOL = createTag("incorrect_for_yellow_tool");

		public static final TagKey<Block> NEEDS_GREEN_TOOL = createTag("needs_green_tool");
		public static final TagKey<Block> INCORRECT_FOR_GREEN_TOOL = createTag("incorrect_for_green_tool");

		public static final TagKey<Block> NEEDS_BLUE_TOOL = createTag("needs_blue_tool");
		public static final TagKey<Block> INCORRECT_FOR_BLUE_TOOL = createTag("incorrect_for_blue_tool");

		public static final TagKey<Block> NEEDS_PURPLE_TOOL = createTag("needs_purple_tool");
		public static final TagKey<Block> INCORRECT_FOR_PURPLE_TOOL = createTag("incorrect_for_purple_tool");

		private static TagKey<Block> createTag(String name) {
			return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ModInformation.Id, name));
		}

	}

	public static class Items {

		private static TagKey<Item> createTag(String name) {
			return TagKey.of(RegistryKeys.ITEM, Identifier.of(ModInformation.Id, name));
		}

	}

}
