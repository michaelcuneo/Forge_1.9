package com.miciden.heroes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.*;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.jcraft.jorbis.Block;
import com.sun.security.ntlm.Client;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main
{
    public static final String MODID = "heroes";
    public static final String MODNAME = "Heroes Mod";
    public static final String VERSION = "0.1";
    
    @Instance(value = Main.MODID) //Tell Forge what instance to use.
    public static Main instance;
    
    @SidedProxy(clientSide="com.miciden.heroes.ClientProxy", serverSide="com.miciden.heroes.ServerProxy")
    public static CommonProxy proxy;

    // Access external classes.
    public static com.miciden.heroes.items.HeroesItems heroesItems;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	this.proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }        
}