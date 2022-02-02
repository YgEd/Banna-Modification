package com.jigglebean.firstmod.init.events;

import com.jigglebean.firstmod.firstmod;
import com.jigglebean.firstmod.init.ItemInit;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = firstmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
	
	@SubscribeEvent
	public static void onUse( event) {
		LivingEntity player = event.getEntityLiving();
		PlayerEntity player1 = event.getPlayer();
		
		if (player.getMainHandItem().getItem() == Items.WOODEN_AXE) {
			player.teleportTo(0, 0, 0);
		}
	}
}
