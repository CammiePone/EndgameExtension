package com.modmcdl.endgameextension.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TwoTallBlock extends DoublePlantBlock
{
	public TwoTallBlock()
	{
		super(AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).doesNotBlockMovement());
	}
}
