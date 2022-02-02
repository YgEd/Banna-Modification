package com.jigglebean.firstmod.init;

import com.google.common.base.Supplier;
import com.jigglebean.firstmod.firstmod;
import com.jigglebean.firstmod.init.custom_items.DowsingRodItem;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, firstmod.MOD_ID);
	//creates the items 
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(firstmod.TUTORIAL_TAB).food(new FoodProperties.Builder().saturationMod(0.2f).nutrition(4).build())));
	//example of a specific number
	
	public static final RegistryObject<Item> DOWSING_ROD = register("dowsing_rod", () -> new DowsingRodItem(new Item.Properties().tab(firstmod.TUTORIAL_TAB).food(new FoodProperties.Builder().saturationMod(0.2f).nutrition(4).build())));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name,  item);
	}

}
