package com.jannespeters.minecraftmod.handler;

import com.jannespeters.minecraftmod.reference.Reference;
import com.jannespeters.minecraftmod.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jannes Peters on 10/25/2014.
 */
public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        //Create config object from file
        if (configuration != null) {
            configuration = new Configuration(configFile);
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        LogHelper.info("Configuration changed!");
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync configs
            loadConfiguration();
        }
    }

    public void loadConfiguration() {
        //load properties
        LogHelper.info("Configuration loaded!");
        if (configuration.hasChanged()) {
            configuration.save();
            LogHelper.info("Configuration Saved!");
        }
    }

}
