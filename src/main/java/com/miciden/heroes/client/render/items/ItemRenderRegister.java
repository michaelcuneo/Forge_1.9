package com.miciden.heroes.client.render.items;

import com.miciden.heroes.Main;
import com.miciden.heroes.items.HeroesItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static String modid = Main.MODID;
	
	public static void registerItemRenderer() {
	    reg(HeroesItems.testItem);
	}
	
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}	
}
