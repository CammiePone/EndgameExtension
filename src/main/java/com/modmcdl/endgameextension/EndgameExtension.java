package com.modmcdl.endgameextension;

import com.modmcdl.endgameextension.core.handlers.EventHandler;
import com.modmcdl.endgameextension.core.registry.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EndgameExtension.MODID)
public class EndgameExtension
{
    public static final String MODID = "endgameextension";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup ENDGAME_EXTENSION = new ItemGroup(MODID)
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryHandler.QUENCHED_STAR.get());
        }
    };

    public EndgameExtension()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }
}
