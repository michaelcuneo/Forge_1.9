package com.miciden.heroes.items;

import com.miciden.heroes.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {

    public TestItem(String unlocalizedName) {
    	super();
    	
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(unlocalizedName);
    }
}