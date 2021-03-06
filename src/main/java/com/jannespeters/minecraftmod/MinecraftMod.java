package com.jannespeters.minecraftmod;

import com.jannespeters.minecraftmod.client.handler.KeyInputEventHandler;
import com.jannespeters.minecraftmod.handler.ConfigurationHandler;
import com.jannespeters.minecraftmod.init.ModBlocks;
import com.jannespeters.minecraftmod.init.ModItems;
import com.jannespeters.minecraftmod.init.ModRecipes;
import com.jannespeters.minecraftmod.proxy.IProxy;
import com.jannespeters.minecraftmod.reference.Reference;
import com.jannespeters.minecraftmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Jannes Peters on 10/25/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MinecraftMod {

    @Mod.Instance(Reference.MOD_ID)
    public static MinecraftMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler()); //register Event Handler for Configuration changes

        proxy.registerKeyBindings();

        ModItems.init();    //init Items
        ModBlocks.init();   //init Blocks
        ModRecipes.init();  //init Recipes

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler()); //register Key Events

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete!");
    }
}
