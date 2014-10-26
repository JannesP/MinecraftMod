package com.jannespeters.minecraftmod.client.handler;

import com.jannespeters.minecraftmod.client.settings.Keybindings;
import com.jannespeters.minecraftmod.reference.Key;
import com.jannespeters.minecraftmod.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by Jannes Peters on 10/26/2014.
 */
public class KeyInputEventHandler {

    private static Key getPressedKeybinding() {
        if (Keybindings.jump.isPressed()) {
            return Key.JUMP;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        LogHelper.info(getPressedKeybinding());
        Key key = getPressedKeybinding();
        switch (key) {
            case JUMP:

                break;
            case UNKNOWN:
                break;
            default:
                LogHelper.info(key);
        }
    }

}
