package com.jannespeters.minecraftmod;

import com.jannespeters.minecraftmod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Jannes Peters on 10/25/2014.
 */

@Mod(modid="MinecraftMod", name="Minecraft Sample Mod", version="0.1")
public class MinecraftMod {

    @Mod.Instance
    public static MinecraftMod instance;

    @SidedProxy(clientSide = "com.jannespeters.minecraft.proxy.ClientProxy", serverSide = "com.jannespeters.minecraft.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
