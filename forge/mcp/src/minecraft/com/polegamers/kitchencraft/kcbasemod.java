package com.polegamers.kitchencraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	public static Item itemKnife = new ItemKnife(1050, "itemKnife").setCreativeTab(kcTab).setUnlocalizedName("itemKnife");
	public static Item emptyCan = new EmptyCan(1051, "emptyCan").setCreativeTab(kcTab).setUnlocalizedName("emptyCan");
	public static Item plasticHandle = new PlasticHandle(1052, "plasticHandle").setCreativeTab(kcTab).setUnlocalizedName("plasticHandle");
	public static Item butcherKnife = new ButcherKnife(1053, "butcherKnife").setCreativeTab(kcTab).setUnlocalizedName("butcherKnife");
	//Fuels
	public static Item smallGasCan = new SmallGasCan(1060, "smallGasCan").setCreativeTab(kcTab).setUnlocalizedName("smallGasCan");
	public static Item medGasCan = new MedGasCan(1061, "medGasCan").setCreativeTab(kcTab).setUnlocalizedName("medGasCan");
	public static Item largeGasCan = new LargeGasCan(1062, "largeGasCan").setCreativeTab(kcTab).setUnlocalizedName("largeGasCan");
	//Plastics & Metals
	public static Item itemPlastic = new ItemPlastic(1080, "itemPlastic").setCreativeTab(kcTab).setUnlocalizedName("itemPlastic");
	public static Item itemChrome = new ItemChrome(1081, "itemChrome").setCreativeTab(kcTab).setUnlocalizedName("itemChrome");
	//Ores
	public static Block chromeOre = new ChromeOre(520).setCreativeTab(kcTab).setUnlocalizedName("chromeOre");

	
@Override
public String getVersion() {
	return "pre-alpha v0.1";
	
}

@Init
public void load(FMLInitializationEvent event){
	//Block Reg
	GameRegistry.registerBlock(blackTiles, "BlackTiles");
	LanguageRegistry.addName(blackTiles, "Black Tiles");
	//Item Reg
	GameRegistry.registerItem(itemKnife, "itemKnife");
	LanguageRegistry.addName(itemKnife, "Knife");
	GameRegistry.registerItem(emptyCan, "emptyCan");
	LanguageRegistry.addName(emptyCan, "Empty Can");
	GameRegistry.registerItem(plasticHandle, "plasticHandle");
	LanguageRegistry.addName(plasticHandle, "Plastic Handle");
	GameRegistry.registerItem(butcherKnife, "butcherKnife");
	LanguageRegistry.addName(butcherKnife, "Butcher Knife");
	//Fuel Reg
	GameRegistry.registerFuelHandler(new gasFuelHandler());
	GameRegistry.registerItem(smallGasCan, "smallGasCan");
	LanguageRegistry.addName(smallGasCan, "Small Gas Can");
	GameRegistry.registerItem(medGasCan, "medGasCan");
	LanguageRegistry.addName(medGasCan, "Gas Can");
	GameRegistry.registerItem(largeGasCan, "largeGasCan");
	LanguageRegistry.addName(largeGasCan, "Large Gas Can");
	//Plastics & Metals Reg
	GameRegistry.registerItem(itemPlastic,"itemPlastic");
	LanguageRegistry.addName(itemPlastic, "Plastic");
	GameRegistry.registerItem(itemChrome, "itemChrome");
	LanguageRegistry.addName(itemChrome, "Raw Chrome");
	//Ore Reg
	GameRegistry.registerBlock(chromeOre, "chromeOre");
	LanguageRegistry.addName(chromeOre, "Chrome Ore");
	//Worldgen
	GameRegistry.registerWorldGenerator(new ChromeOreGen());
	
	//Item Crafting
	GameRegistry.addShapelessRecipe(new ItemStack(this.plasticHandle), new Object[]{
		new ItemStack(this.itemPlastic), new ItemStack(this.itemPlastic), new ItemStack(this.itemPlastic)
	});
	
	//Smelting
	GameRegistry.addSmelting(this.chromeOre.blockID, new ItemStack(this.itemChrome), 2.0F);

}

@Override
public void load() {
	// TODO Auto-generated method stub
	
}



}
	

	

