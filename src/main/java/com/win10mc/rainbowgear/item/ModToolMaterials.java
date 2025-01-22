package com.win10mc.rainbowgear.item;

import com.google.common.base.Suppliers;
import com.win10mc.rainbowgear.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
	RED_GEM(ModTags.Blocks.INCORRECT_FOR_RED_TOOL, 1500, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.RED_GEM)),
	ORANGE_GEM(ModTags.Blocks.INCORRECT_FOR_ORANGE_TOOL, 2000, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.ORANGE_GEM)),
	YELLOW_GEM(ModTags.Blocks.INCORRECT_FOR_YELLOW_TOOL, 2500, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.YELLOW_GEM)),
	GREEN_GEM(ModTags.Blocks.INCORRECT_FOR_GREEN_TOOL, 3000, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.GREEN_GEM)),
	BLUE_GEM(ModTags.Blocks.INCORRECT_FOR_BLUE_TOOL, 4000, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.BLUE_GEM)),
	PURPLE_GEM(ModTags.Blocks.INCORRECT_FOR_PURPLE_TOOL, 5000, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.PURPLE_GEM));


	private final TagKey<Block> inverseTag;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> repairIngredient;

	ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
					 final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
		this.inverseTag = inverseTag;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = Suppliers.memoize(repairIngredient::get);
	}

	@Override
	public int getDurability() {
		return this.itemDurability;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public TagKey<Block> getInverseTag() {
		return this.inverseTag;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
}