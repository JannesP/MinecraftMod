package com.jannespeters.minecraftmod.proxy;

import com.jannespeters.minecraftmod.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Jannes Peters on 10/25/2014.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.jump);
    }
}
