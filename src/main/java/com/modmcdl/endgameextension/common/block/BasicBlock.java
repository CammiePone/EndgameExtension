package com.modmcdl.endgameextension.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasicBlock extends Block
{
	public BasicBlock()
	{
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(5f, 6f)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE));
	}
}
