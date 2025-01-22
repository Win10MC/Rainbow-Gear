package com.win10mc.rainbowgear.item;

import com.win10mc.rainbowgear.ModInformation;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
	public static final RegistryEntry<ArmorMaterial> RED_ARMOR_MATERIAL = registerArmorMaterial("red",
			() -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 4);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 4);
			}), 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RED_GEM),
					List.of(new ArmorMaterial.Layer(Identifier.of(ModInformation.Id, "red"))), 0, 0));

	public static final RegistryEntry<ArmorMaterial> ORANGE_ARMOR_MATERIAL = registerArmorMaterial("orange",
			() -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 4);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 4);
			}), 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.ORANGE_GEM),
					List.of(new ArmorMaterial.Layer(Identifier.of(ModInformation.Id, "orange"))), 0, 0));

	public static final RegistryEntry<ArmorMaterial> YELLOW_ARMOR_MATERIAL = registerArmorMaterial("yellow",
			() -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 4);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 4);
			}), 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.YELLOW_GEM),
					List.of(new ArmorMaterial.Layer(Identifier.of(ModInformation.Id, "yellow"))), 0, 0));

	public static final RegistryEntry<ArmorMaterial> GREEN_ARMOR_MATERIAL = registerArmorMaterial("green",
			() -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 4);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 4);
			}), 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.GREEN_GEM),
					List.of(new ArmorMaterial.Layer(Identifier.of(ModInformation.Id, "green"))), 0, 0));

	public static final RegistryEntry<ArmorMaterial> BLUE_ARMOR_MATERIAL = registerArmorMaterial("blue",
			() -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 4);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 4);
			}), 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.BLUE_GEM),
					List.of(new ArmorMaterial.Layer(Identifier.of(ModInformation.Id, "blue"))), 0, 0));

	public static final RegistryEntry<ArmorMaterial> PURPLE_ARMOR_MATERIAL = registerArmorMaterial("purple",
			() -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 4);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 4);
			}), 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.PURPLE_GEM),
					List.of(new ArmorMaterial.Layer(Identifier.of(ModInformation.Id, "purple"))), 0, 0));


	public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
		return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ModInformation.Id, name), material.get());
	}

}
