package com.win10mc.moreweapons.datagen;

import com.win10mc.moreweapons.block.ModBlocks;
import com.win10mc.moreweapons.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
	public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generate() {

		addDrop(ModBlocks.RED_BLOCK);
		addDrop(ModBlocks.RED_ORE, oreDrops(ModBlocks.RED_ORE, ModItems.RED_GEM));
		addDrop(ModBlocks.RED_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.RED_DEEPSLATE_ORE, ModItems.RED_GEM, 1, 2));

		addDrop(ModBlocks.ORANGE_BLOCK);
		addDrop(ModBlocks.ORANGE_ORE, oreDrops(ModBlocks.ORANGE_ORE, ModItems.ORANGE_GEM));
		addDrop(ModBlocks.ORANGE_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.ORANGE_DEEPSLATE_ORE, ModItems.ORANGE_GEM, 1, 2));

		addDrop(ModBlocks.YELLOW_BLOCK);
		addDrop(ModBlocks.YELLOW_ORE, oreDrops(ModBlocks.YELLOW_ORE, ModItems.YELLOW_GEM));
		addDrop(ModBlocks.YELLOW_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.YELLOW_DEEPSLATE_ORE, ModItems.YELLOW_GEM, 1, 2));

		addDrop(ModBlocks.GREEN_BLOCK);
		addDrop(ModBlocks.GREEN_ORE, oreDrops(ModBlocks.GREEN_ORE, ModItems.GREEN_GEM));
		addDrop(ModBlocks.GREEN_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.GREEN_DEEPSLATE_ORE, ModItems.GREEN_GEM, 1, 2));

		addDrop(ModBlocks.BLUE_BLOCK);
		addDrop(ModBlocks.BLUE_ORE, oreDrops(ModBlocks.BLUE_ORE, ModItems.BLUE_GEM));
		addDrop(ModBlocks.BLUE_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.BLUE_DEEPSLATE_ORE, ModItems.BLUE_GEM, 1, 2));

		addDrop(ModBlocks.PURPLE_BLOCK);
		addDrop(ModBlocks.PURPLE_ORE, oreDrops(ModBlocks.PURPLE_ORE, ModItems.PURPLE_GEM));
		addDrop(ModBlocks.PURPLE_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.PURPLE_DEEPSLATE_ORE, ModItems.PURPLE_GEM, 1, 2));
	}

	public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
		RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
		return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
				ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
				.apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
	}

}
