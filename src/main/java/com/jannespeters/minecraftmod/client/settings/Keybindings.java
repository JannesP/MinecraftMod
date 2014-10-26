package com.jannespeters.minecraftmod.client.settings;

import com.jannespeters.minecraftmod.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Jannes Peters on 10/26/2014.
 */
public class Keybindings {

    public static KeyBinding jump = new KeyBinding(Names.Keys.JUMP, Keyboard.KEY_H, Names.Keys.CATEGORY);

}
