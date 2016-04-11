package com.miciden.heroes;

import com.miciden.heroes.items.HeroesItems;
import com.miciden.heroes.blocks.HeroesBlocks;
import com.miciden.heroes.crafting.HeroesCrafting;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	HeroesItems.initItems();
        HeroesBlocks.initBlocks();
    }
    
    public void init(FMLInitializationEvent e) {
    	HeroesCrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}