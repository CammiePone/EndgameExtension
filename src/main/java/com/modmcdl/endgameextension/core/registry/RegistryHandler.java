package com.modmcdl.endgameextension.core.registry;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.common.block.BasicBlock;
import com.modmcdl.endgameextension.common.block.TwoTallBlock;
import com.modmcdl.endgameextension.common.item.BasicBlockItem;
import com.modmcdl.endgameextension.common.item.BasicItem;
import com.modmcdl.endgameextension.common.item.tools.EndgameExtensionItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
	//-----Lists-----//
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndgameExtension.MODID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EndgameExtension.MODID);

	//-----Materials-----//


	//-----Items-----//
	public static final RegistryObject<Item> QUENCHED_STAR = ITEMS.register("quenched_nether_star", BasicItem::new);
	public static final RegistryObject<Item> QUENCHED_SHARD = ITEMS.register("quenched_nether_star_shard", BasicItem::new);
	public static final RegistryObject<Item> LAVENDER_PETAL = ITEMS.register("lavender_petal", BasicItem::new);
	public static final RegistryObject<Item> LAVENDER_BUSHEL = ITEMS.register("lavender_bushel", BasicItem::new);

	//-----Blocks-----//
	public static final RegistryObject<Block> CHISELED_PURPUR = BLOCKS.register("chiseled_purpur", BasicBlock::new);
	public static final RegistryObject<Block> CHISELED_SOUL_BRICKS = BLOCKS.register("chiseled_soul_bricks", BasicBlock::new);
	public static final RegistryObject<Block> SOUL_BRICKS = BLOCKS.register("soul_bricks", BasicBlock::new);
	public static final RegistryObject<Block> NETHER_STAR_BLOCK = BLOCKS.register("nether_star_block", BasicBlock::new);
	public static final RegistryObject<Block> ASPHODEL_BLOCK = BLOCKS.register("asphodel", TwoTallBlock::new);

	//-----Block Items-----//
	public static final RegistryObject<Item> CHISELED_PURPUR_ITEM = ITEMS.register("chiseled_purpur", () -> new BasicBlockItem(CHISELED_PURPUR.get()));
	public static final RegistryObject<Item> CHISELED_SOUL_BRICKS_ITEM = ITEMS.register("chiseled_soul_bricks", () -> new BasicBlockItem(CHISELED_SOUL_BRICKS.get()));
	public static final RegistryObject<Item> SOUL_BRICKS_ITEM = ITEMS.register("soul_bricks", () -> new BasicBlockItem(SOUL_BRICKS.get()));
	public static final RegistryObject<Item> NETHER_STAR_BLOCK_ITEM = ITEMS.register("nether_star_block", () -> new BasicBlockItem(NETHER_STAR_BLOCK.get()));
	public static final RegistryObject<Item> ASPHODEL_ITEM = ITEMS.register("asphodel", () -> new BasicBlockItem(ASPHODEL_BLOCK.get()));

	//-----Tools-----//
	public static final RegistryObject<SwordItem> WITHER_SWORD = ITEMS.register("wither_sword", () ->
			new SwordItem(EndgameExtensionItemTier.WITHER_TOOLS, 3, -2.4f, new Item.Properties().group(EndgameExtension.ENDGAME_EXTENSION)));
	public static final RegistryObject<PickaxeItem> WITHER_PICKAXE = ITEMS.register("wither_pickaxe", () ->
			new PickaxeItem(EndgameExtensionItemTier.WITHER_TOOLS, 1, -2.8f, new Item.Properties().group(EndgameExtension.ENDGAME_EXTENSION)));
	public static final RegistryObject<AxeItem> WITHER_AXE = ITEMS.register("wither_axe", () ->
			new AxeItem(EndgameExtensionItemTier.WITHER_TOOLS, 6, -3.2f, new Item.Properties().group(EndgameExtension.ENDGAME_EXTENSION)));
	public static final RegistryObject<ShovelItem> WITHER_SHOVEL = ITEMS.register("wither_shovel", () ->
			new ShovelItem(EndgameExtensionItemTier.WITHER_TOOLS, 1.5F, -3f, new Item.Properties().group(EndgameExtension.ENDGAME_EXTENSION)));
	public static final RegistryObject<HoeItem> WITHER_HOE = ITEMS.register("wither_hoe", () ->
			new HoeItem(EndgameExtensionItemTier.WITHER_TOOLS, -8, 0f, new Item.Properties().group(EndgameExtension.ENDGAME_EXTENSION)));

	//-----Registry-----//
	public static void init()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
