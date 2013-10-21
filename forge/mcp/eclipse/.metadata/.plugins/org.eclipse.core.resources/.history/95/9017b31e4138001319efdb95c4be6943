package com.polegamers.kitchencraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabKitchenCraft extends CreativeTabs {

	public CreativeTabKitchenCraft(String par2Str) {
		super(CreativeTabs.getNextID(), par2Str);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconIndex(){
		return Block.bedrock.blockID;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return "KitchenCraft";
	}

}
