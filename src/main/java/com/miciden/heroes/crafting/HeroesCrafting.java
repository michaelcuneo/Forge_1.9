package com.miciden.heroes.crafting;

import com.miciden.heroes.blocks.HeroesBlocks;
import com.miciden.heroes.items.HeroesItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HeroesCrafting {
	
	public static void initCrafting() {
		
		// Add recipes here dependent on character selection.
		
		// Add Recipes.
		GameRegistry.addRecipe(new ItemStack(HeroesBlocks.testBlock), new Object[] {"##", "##", '#', HeroesItems.testItem});
		// Add Shapeless Recipes.
		GameRegistry.addShapelessRecipe(new ItemStack(HeroesItems.testItem), new Object[] {Items.redstone, new ItemStack(Items.dye, 1, 4)});
		// Add Smelting Recipes. 
		GameRegistry.addSmelting(Items.diamond, new ItemStack(HeroesItems.testItem), 1.0F);
	}
}
