package com.jigglebean.firstmod;


import com.jigglebean.firstmod.init.ItemInit;

import assets.firstmod.utils.ModSoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("firstmod")
public class firstmod {
	
	public static final String MOD_ID = "firstmod";
	
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
		// literal tab that holds the mod items
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
			//puts the registry of items in the tab
		}
	};
	
	public firstmod() {
		IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(eventbus);
		
		
		MinecraftForge.EVENT_BUS.register(this);
		ModSoundEvents.register(eventbus);
		
	}
	
	

}
