package com.jigglebean.firstmod.init.custom_items;

import java.awt.event.ActionEvent;


import net.minecraft.server.level.ServerPlayer;
import assets.firstmod.utils.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraft.sounds.SoundSource;

public class DowsingRodItem extends Item{

	public DowsingRodItem(Properties p_41383_) {
		super(p_41383_);
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public EnumAction getItemUseAction(ItemStack stack) {
//		return EnumAction.BONK;
//	}
	
	@Override
	public InteractionResult useOn(UseOnContext pContext) {
		
		LivingEntity player1 = (LivingEntity)pContext.getPlayer();
		
		
		
		if(!player1.level.isClientSide()) {
			BlockPos positionClicked = pContext.getClickedPos();
			ServerLevel world = (ServerLevel) player1.level;
			if (positionClicked.getZ() != player1.getOnPos().getZ()) {
				System.out.println("clicked here: " + positionClicked);
				System.out.println("Player is here: " + player1.getOnPos());
				System.out.println("Is clicked pos and player pos same? " + (positionClicked == player1.getOnPos()));
				EntityType.SNOWBALL.spawn\(world, null, (Player) player1, positionClicked, MobSpawnType.TRIGGERED, true, true);
			}		
			
			
			world.playSound(null, positionClicked, ModSoundEvents.BONK.get(), null, MAX_BAR_WIDTH, MAX_BAR_WIDTH);
		

		}
		
		//damages item when used
		//pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));
		
		return super.useOn(pContext);
	}
	

}
