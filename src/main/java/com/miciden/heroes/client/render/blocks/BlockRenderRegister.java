package com.miciden.heroes.client.render.blocks;

import com.miciden.heroes.Main;
import com.miciden.heroes.blocks.HeroesBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
    
    public static String modid = Main.MODID;
    
	public static void registerBlockRenderer() {
		reg(HeroesBlocks.testBlock);
    }
	
    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}