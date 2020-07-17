package com.modmcdl.endgameextension.core.handlers;

import com.modmcdl.endgameextension.core.registry.RegistryHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler
{
	private Entity entity;
	private int timer = 10 * 20;

	@SubscribeEvent
	public void onItemThrown(ItemTossEvent event)
	{
		entity = event.getEntity();
	}

	@SubscribeEvent
	public void onItemEntityTick(TickEvent.WorldTickEvent event)
	{
		World world = event.world;

		if(entity != null)
		{
			for(Entity entities : world.getEntitiesWithinAABB(Entity.class, entity.getBoundingBox().expand(5d, 5d, 5d)))
			{
				if(entities instanceof ItemEntity)
				{
					ItemEntity item = (ItemEntity) entities;

					if(item.getItem().getItem() == Items.NETHER_STAR)
					{
						if(world.getBlockState(new BlockPos(item.getPosX(), item.getPosY(), item.getPosZ())).getMaterial() == Material.WATER)
						{
							int count = item.getItem().getCount();

							if(timer > 0)
							{
								timer--;
							}
							else
							{
								item.setItem(new ItemStack(RegistryHandler.QUENCHED_STAR.get(), count));
								timer = 10 * 20;
							}
						}
					}
				}
			}
		}
	}
}
