package com.miciden.heroes.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HeroesItems {
	
	public static Item testItem;
	
    public static void initItems() {

    	GameRegistry.registerItem(testItem = new TestItem("test_item"), "test_item");
    
    }
    
    public static int itemCount() {
    	return HeroesItemList.values().length;
    }
}

enum HeroesItemList {
	
	TestItem1,
	TestItem2,
	TestItem3,
	TestItem4,
	TestItem5,
	TestItem6

}