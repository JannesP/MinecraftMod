package com.jannespeters.minecraftmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Jannes Peters on 10/26/2014.
 */
public class ModRecipes {

    public static void init() {
        GameRegistry.addShapedRecipe(new ItemStack(Items.blaze_rod), "rr ", "rrr", " rr", 'r', new ItemStack(Items.blaze_powder));
    }

}
