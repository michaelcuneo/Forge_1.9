package com.miciden.heroes.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HeroesBlocks {
	
	public static Block testBlock;
    
	public static void initBlocks() {
	    GameRegistry.registerBlock(testBlock = new BasicBlock("test_block"), "test_block");
    }
}