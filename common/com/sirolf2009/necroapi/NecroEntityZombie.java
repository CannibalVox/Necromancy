package com.sirolf2009.necroapi;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * An example class
 * 
 * @author sirolf2009
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class NecroEntityZombie extends NecroEntityBiped {

    public NecroEntityZombie() {
        super("ZOMBIE");
        headItem = new ItemStack(Item.skull, 1, 2);
        torsoItem = new ItemStack(Item.rottenFlesh, 1);
        armItem = new ItemStack(Item.rottenFlesh, 1);
        legItem = new ItemStack(Item.rottenFlesh, 1);
        texture = "/mob/zombie.png";
        textureHeight = 64;
    }

    @Override
    public void initRecipes() {
        headRecipe = new Object[] { "SSSS", "SBFS", "SEES", 'S', new ItemStack(organs, 1, 4), // skin
        'E', Item.spiderEye, 'F', Item.rottenFlesh, 'B', new ItemStack(organs, 1, 0) }; // brains
        torsoRecipe = new Object[] { " LL ", "BHUB", "LEEL", "BLLB", 'L', new ItemStack(organs, 1, 4), // skin
        'E', Item.rottenFlesh, 'H', new ItemStack(organs, 1, 1), // heart
        'U', new ItemStack(organs, 1, 3), // lungs
        'B', Item.bone };
        armRecipe = new Object[] { "LLLL", "BMEB", "LLLL", 'L', new ItemStack(organs, 1, 4), // skin
        'E', Item.rottenFlesh, 'M', new ItemStack(organs, 1, 2), // muscle
        'B', Item.bone };
        legRecipe = new Object[] { "LBBL", "LMML", "LEEL", "LBBL", 'L', new ItemStack(organs, 1, 4), // skin
        'E', Item.rottenFlesh, 'M', new ItemStack(organs, 1, 2), // muscle
        'B', Item.bone };
    }
}
