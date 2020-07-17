package com.modmcdl.endgameextension.common.item;

import com.modmcdl.endgameextension.EndgameExtension;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BasicBlockItem extends BlockItem
{
	public BasicBlockItem(Block block)
	{
		super(block, new Item.Properties().group(EndgameExtension.ENDGAME_EXTENSION));
	}
}
