package com.win10mc.rainbowgear.item;

import com.win10mc.rainbowgear.ModInformation;
import com.win10mc.rainbowgear.RainbowGear;
import com.win10mc.rainbowgear.config.Configurations;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	public static final Item RED_GEM = registerItem("red_gem", new Item(new Item.Settings()));
	public static final Item ORANGE_GEM = registerItem("orange_gem", new Item(new Item.Settings()));
	public static final Item YELLOW_GEM = registerItem("yellow_gem", new Item(new Item.Settings()));
	public static final Item GREEN_GEM = registerItem("green_gem", new Item(new Item.Settings()));
	public static final Item BLUE_GEM = registerItem("blue_gem", new Item(new Item.Settings()));
	public static final Item PURPLE_GEM = registerItem("purple_gem", new Item(new Item.Settings()));

	public static final Item RED_SWORD = registerItem("red_sword", new SwordItem(
			ModToolMaterials.RED_GEM, new Item.Settings()
			.attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RED_GEM,
					Configurations.RED_SWORD.baseAttackDamage, Configurations.RED_SWORD.attackSpeed))));

	public static final Item ORANGE_SWORD = registerItem("orange_sword", new SwordItem(
			ModToolMaterials.ORANGE_GEM, new Item.Settings()
			.attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ORANGE_GEM,
					Configurations.ORANGE_SWORD.baseAttackDamage, Configurations.ORANGE_SWORD.attackSpeed))));

	public static final Item YELLOW_SWORD = registerItem("yellow_sword", new SwordItem(
			ModToolMaterials.YELLOW_GEM, new Item.Settings()
			.attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.YELLOW_GEM,
					Configurations.YELLOW_SWORD.baseAttackDamage, Configurations.YELLOW_SWORD.attackSpeed))));

	public static final Item GREEN_SWORD = registerItem("green_sword", new SwordItem(
			ModToolMaterials.GREEN_GEM, new Item.Settings()
			.attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GREEN_GEM,
					Configurations.GREEN_SWORD.baseAttackDamage, Configurations.GREEN_SWORD.attackSpeed))));

	public static final Item BLUE_SWORD = registerItem("blue_sword", new SwordItem(
			ModToolMaterials.BLUE_GEM, new Item.Settings()
			.attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLUE_GEM,
					Configurations.BLUE_SWORD.baseAttackDamage, Configurations.BLUE_SWORD.attackSpeed))));

	public static final Item PURPLE_SWORD = registerItem("purple_sword", new SwordItem(
			ModToolMaterials.PURPLE_GEM, new Item.Settings()
			.attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURPLE_GEM,
					Configurations.PURPLE_SWORD.baseAttackDamage, Configurations.PURPLE_SWORD.attackSpeed))));

	public static final Item RED_PICKAXE = registerItem("red_pickaxe", new PickaxeItem(
			ModToolMaterials.RED_GEM, new Item.Settings()
			.attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RED_GEM,
					Configurations.RED_PICKAXE.baseAttackDamage, Configurations.RED_PICKAXE.attackSpeed))));

	public static final Item ORANGE_PICKAXE = registerItem("orange_pickaxe", new PickaxeItem(
			ModToolMaterials.ORANGE_GEM, new Item.Settings()
			.attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ORANGE_GEM,
					Configurations.ORANGE_PICKAXE.baseAttackDamage, Configurations.ORANGE_PICKAXE.attackSpeed))));

	public static final Item YELLOW_PICKAXE = registerItem("yellow_pickaxe", new PickaxeItem(
			ModToolMaterials.YELLOW_GEM, new Item.Settings()
			.attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.YELLOW_GEM,
					Configurations.YELLOW_PICKAXE.baseAttackDamage, Configurations.YELLOW_PICKAXE.attackSpeed))));

	public static final Item GREEN_PICKAXE = registerItem("green_pickaxe", new PickaxeItem(
			ModToolMaterials.GREEN_GEM, new Item.Settings()
			.attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GREEN_GEM,
					Configurations.GREEN_PICKAXE.baseAttackDamage, Configurations.GREEN_PICKAXE.attackSpeed))));

	public static final Item BLUE_PICKAXE = registerItem("blue_pickaxe", new PickaxeItem(
			ModToolMaterials.BLUE_GEM, new Item.Settings()
			.attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLUE_GEM,
					Configurations.BLUE_PICKAXE.baseAttackDamage, Configurations.BLUE_PICKAXE.attackSpeed))));

	public static final Item PURPLE_PICKAXE = registerItem("purple_pickaxe", new PickaxeItem(
			ModToolMaterials.PURPLE_GEM, new Item.Settings()
			.attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURPLE_GEM,
					Configurations.PURPLE_PICKAXE.baseAttackDamage, Configurations.PURPLE_PICKAXE.attackSpeed))));

	public static final Item RED_AXE = registerItem("red_axe", new AxeItem(
			ModToolMaterials.RED_GEM, new Item.Settings()
			.attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RED_GEM,
					Configurations.RED_AXE.baseAttackDamage, Configurations.RED_AXE.attackSpeed))));

	public static final Item ORANGE_AXE = registerItem("orange_axe", new AxeItem(
			ModToolMaterials.ORANGE_GEM, new Item.Settings()
			.attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ORANGE_GEM,
					Configurations.ORANGE_AXE.baseAttackDamage, Configurations.ORANGE_AXE.attackSpeed))));

	public static final Item YELLOW_AXE = registerItem("yellow_axe", new AxeItem(
			ModToolMaterials.YELLOW_GEM, new Item.Settings()
			.attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.YELLOW_GEM,
					Configurations.YELLOW_AXE.baseAttackDamage, Configurations.YELLOW_AXE.attackSpeed))));

	public static final Item GREEN_AXE = registerItem("green_axe", new AxeItem(
			ModToolMaterials.GREEN_GEM, new Item.Settings()
			.attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GREEN_GEM,
					Configurations.GREEN_AXE.baseAttackDamage, Configurations.GREEN_AXE.attackSpeed))));

	public static final Item BLUE_AXE = registerItem("blue_axe", new AxeItem(
			ModToolMaterials.BLUE_GEM, new Item.Settings()
			.attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLUE_GEM,
					Configurations.BLUE_AXE.baseAttackDamage, Configurations.BLUE_AXE.attackSpeed))));

	public static final Item PURPLE_AXE = registerItem("purple_axe", new AxeItem(
			ModToolMaterials.PURPLE_GEM, new Item.Settings()
			.attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURPLE_GEM,
					Configurations.PURPLE_AXE.baseAttackDamage, Configurations.PURPLE_AXE.attackSpeed))));

	public static final Item RED_SHOVEL = registerItem("red_shovel", new ShovelItem(
			ModToolMaterials.RED_GEM, new Item.Settings()
			.attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RED_GEM,
					Configurations.RED_SHOVEL.baseAttackDamage, Configurations.RED_SHOVEL.attackSpeed))));

	public static final Item ORANGE_SHOVEL = registerItem("orange_shovel", new ShovelItem(
			ModToolMaterials.ORANGE_GEM, new Item.Settings()
			.attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ORANGE_GEM,
					Configurations.ORANGE_SHOVEL.baseAttackDamage, Configurations.ORANGE_SHOVEL.attackSpeed))));

	public static final Item YELLOW_SHOVEL = registerItem("yellow_shovel", new ShovelItem(
			ModToolMaterials.YELLOW_GEM, new Item.Settings()
			.attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.YELLOW_GEM,
					Configurations.YELLOW_SHOVEL.baseAttackDamage, Configurations.YELLOW_SHOVEL.attackSpeed))));

	public static final Item GREEN_SHOVEL = registerItem("green_shovel", new ShovelItem(
			ModToolMaterials.GREEN_GEM, new Item.Settings()
			.attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GREEN_GEM,
					Configurations.GREEN_SHOVEL.baseAttackDamage, Configurations.GREEN_SHOVEL.attackSpeed))));

	public static final Item BLUE_SHOVEL = registerItem("blue_shovel", new ShovelItem(
			ModToolMaterials.BLUE_GEM, new Item.Settings()
			.attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLUE_GEM,
					Configurations.BLUE_SHOVEL.baseAttackDamage, Configurations.BLUE_SHOVEL.attackSpeed))));

	public static final Item PURPLE_SHOVEL = registerItem("purple_shovel", new ShovelItem(
			ModToolMaterials.PURPLE_GEM, new Item.Settings()
			.attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURPLE_GEM,
					Configurations.PURPLE_SHOVEL.baseAttackDamage, Configurations.PURPLE_SHOVEL.attackSpeed))));

	public static final Item RED_HOE = registerItem("red_hoe", new HoeItem(
			ModToolMaterials.RED_GEM, new Item.Settings()
			.attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RED_GEM,
					Configurations.RED_HOE.baseAttackDamage, Configurations.RED_HOE.attackSpeed))));

	public static final Item ORANGE_HOE = registerItem("orange_hoe", new HoeItem(
			ModToolMaterials.ORANGE_GEM, new Item.Settings()
			.attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ORANGE_GEM,
					Configurations.ORANGE_HOE.baseAttackDamage, Configurations.ORANGE_HOE.attackSpeed))));

	public static final Item YELLOW_HOE = registerItem("yellow_hoe", new HoeItem(
			ModToolMaterials.YELLOW_GEM, new Item.Settings()
			.attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.YELLOW_GEM,
					Configurations.YELLOW_HOE.baseAttackDamage, Configurations.YELLOW_HOE.attackSpeed))));

	public static final Item GREEN_HOE = registerItem("green_hoe", new HoeItem(
			ModToolMaterials.GREEN_GEM, new Item.Settings()
			.attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GREEN_GEM,
					Configurations.GREEN_HOE.baseAttackDamage, Configurations.GREEN_HOE.attackSpeed))));

	public static final Item BLUE_HOE = registerItem("blue_hoe", new HoeItem(
			ModToolMaterials.BLUE_GEM, new Item.Settings()
			.attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLUE_GEM,
					Configurations.BLUE_HOE.baseAttackDamage, Configurations.BLUE_HOE.attackSpeed))));

	public static final Item PURPLE_HOE = registerItem("purple_hoe", new HoeItem(
			ModToolMaterials.PURPLE_GEM, new Item.Settings()
			.attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURPLE_GEM,
					Configurations.PURPLE_HOE.baseAttackDamage, Configurations.PURPLE_HOE.attackSpeed))));

	public static final Item RED_HELMET = registerItem("red_helmet", new ArmorItem(
			ModArmorMaterials.RED_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
			.maxDamage(ArmorItem.Type.HELMET.getMaxDamage(Configurations.RED_HELMET.durabilityMultiplier))));

	public static final Item ORANGE_HELMET = registerItem("orange_helmet", new ArmorItem(
			ModArmorMaterials.ORANGE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
			.maxDamage(ArmorItem.Type.HELMET.getMaxDamage(Configurations.ORANGE_HELMET.durabilityMultiplier))));

	public static final Item YELLOW_HELMET = registerItem("yellow_helmet", new ArmorItem(
			ModArmorMaterials.YELLOW_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
			.maxDamage(ArmorItem.Type.HELMET.getMaxDamage(Configurations.YELLOW_HELMET.durabilityMultiplier))));

	public static final Item GREEN_HELMET = registerItem("green_helmet", new ArmorItem(
			ModArmorMaterials.GREEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
			.maxDamage(ArmorItem.Type.HELMET.getMaxDamage(Configurations.GREEN_HELMET.durabilityMultiplier))));

	public static final Item BLUE_HELMET = registerItem("blue_helmet", new ArmorItem(
			ModArmorMaterials.BLUE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
			.maxDamage(ArmorItem.Type.HELMET.getMaxDamage(Configurations.BLUE_HELMET.durabilityMultiplier))));

	public static final Item PURPLE_HELMET = registerItem("purple_helmet", new ArmorItem(
			ModArmorMaterials.PURPLE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
			.maxDamage(ArmorItem.Type.HELMET.getMaxDamage(Configurations.PURPLE_HELMET.durabilityMultiplier))));

	public static final Item RED_CHESTPLATE = registerItem("red_chestplate", new ArmorItem(
			ModArmorMaterials.RED_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
			.maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(Configurations.RED_CHESTPLATE.durabilityMultiplier))));

	public static final Item ORANGE_CHESTPLATE = registerItem("orange_chestplate", new ArmorItem(
			ModArmorMaterials.ORANGE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
			.maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(Configurations.ORANGE_CHESTPLATE.durabilityMultiplier))));

	public static final Item YELLOW_CHESTPLATE = registerItem("yellow_chestplate", new ArmorItem(
			ModArmorMaterials.YELLOW_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
			.maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(Configurations.YELLOW_CHESTPLATE.durabilityMultiplier))));

	public static final Item GREEN_CHESTPLATE = registerItem("green_chestplate", new ArmorItem(
			ModArmorMaterials.GREEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
			.maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(Configurations.GREEN_CHESTPLATE.durabilityMultiplier))));

	public static final Item BLUE_CHESTPLATE = registerItem("blue_chestplate", new ArmorItem(
			ModArmorMaterials.BLUE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
			.maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(Configurations.BLUE_CHESTPLATE.durabilityMultiplier))));

	public static final Item PURPLE_CHESTPLATE = registerItem("purple_chestplate", new ArmorItem(
			ModArmorMaterials.PURPLE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
			.maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(Configurations.PURPLE_CHESTPLATE.durabilityMultiplier))));

	public static final Item RED_LEGGINGS = registerItem("red_leggings", new ArmorItem(
			ModArmorMaterials.RED_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
			.maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(Configurations.RED_LEGGINGS.durabilityMultiplier))));

	public static final Item ORANGE_LEGGINGS = registerItem("orange_leggings", new ArmorItem(
			ModArmorMaterials.ORANGE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
			.maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(Configurations.ORANGE_LEGGINGS.durabilityMultiplier))));

	public static final Item YELLOW_LEGGINGS = registerItem("yellow_leggings", new ArmorItem(
			ModArmorMaterials.YELLOW_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
			.maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(Configurations.YELLOW_LEGGINGS.durabilityMultiplier))));

	public static final Item GREEN_LEGGINGS = registerItem("green_leggings", new ArmorItem(
			ModArmorMaterials.GREEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
			.maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(Configurations.GREEN_LEGGINGS.durabilityMultiplier))));

	public static final Item BLUE_LEGGINGS = registerItem("blue_leggings", new ArmorItem(
			ModArmorMaterials.BLUE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
			.maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(Configurations.BLUE_LEGGINGS.durabilityMultiplier))));

	public static final Item PURPLE_LEGGINGS = registerItem("purple_leggings", new ArmorItem(
			ModArmorMaterials.PURPLE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
			.maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(Configurations.PURPLE_LEGGINGS.durabilityMultiplier))));

	public static final Item RED_BOOTS = registerItem("red_boots", new ArmorItem(
			ModArmorMaterials.RED_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
			.maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(Configurations.RED_BOOTS.durabilityMultiplier))));

	public static final Item ORANGE_BOOTS = registerItem("orange_boots", new ArmorItem(
			ModArmorMaterials.ORANGE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
			.maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(Configurations.ORANGE_BOOTS.durabilityMultiplier))));

	public static final Item YELLOW_BOOTS = registerItem("yellow_boots", new ArmorItem(
			ModArmorMaterials.YELLOW_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
			.maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(Configurations.YELLOW_BOOTS.durabilityMultiplier))));

	public static final Item GREEN_BOOTS = registerItem("green_boots", new ArmorItem(
			ModArmorMaterials.GREEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
			.maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(Configurations.GREEN_BOOTS.durabilityMultiplier))));

	public static final Item BLUE_BOOTS = registerItem("blue_boots", new ArmorItem(
			ModArmorMaterials.BLUE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
			.maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(Configurations.BLUE_BOOTS.durabilityMultiplier))));

	public static final Item PURPLE_BOOTS = registerItem("purple_boots", new ArmorItem(
			ModArmorMaterials.PURPLE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
			.maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(Configurations.PURPLE_BOOTS.durabilityMultiplier))));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(ModInformation.Id, name), item);
	}

	public static void register() {
		RainbowGear.LOGGER.info("Registering mod items for " + ModInformation.Id);
	}

}
