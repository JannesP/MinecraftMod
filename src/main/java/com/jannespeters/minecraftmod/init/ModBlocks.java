package com.jannespeters.minecraftmod.init;

import com.jannespeters.minecraftmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Jannes Peters on 10/26/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //example: public static final ExampleBlock exampleBlock = new ExampleBlock();

    public static void init() {
        //example: GameRegistry.registerBlock(exampleBlock, "exampleBlockName");
    }

}
