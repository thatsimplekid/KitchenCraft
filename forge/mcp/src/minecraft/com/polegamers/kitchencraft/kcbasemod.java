package com.polegamers.kitchencraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.BaseMod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="kitchencraft", name="KitchenCraft", version="pre-alpha v0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class kcbasemod extends BaseMod{
	
	public static CreativeTabs kcTab = new CreativeTabKitchenCraft("kctab");
	//Blocks
	public static Block blackTiles = new BlockTile(508,"Black");
	//Items
	public static Item itemKnife = new ItemKnife(1050);
	//Fuels
	public static Item smallGasCan = new SmallGasCan(1060, "smallGasCan").setCreativeTab(kcTab).setUnlocalizedName("smallGasCan");

	
@Override
public String getVersion() {
	return "pre-alpha v0.1";
	
}

@Init
public void load(FMLInitializationEvent event){
	//Block Reg
	GameRegistry.registerBlock(blackTiles, "BlackTiles");
	LanguageRegistry.addName(blackTiles, "Black Tiles");
	//Fuel Reg
	GameRegistry.registerItem(smallGasCan, "gasCanSmall");
	LanguageRegistry.addName(smallGasCan, "Small Gas Can");

}

@Override
public void load() {
	// TODO Auto-generated method stub
	
}



}
	

	

