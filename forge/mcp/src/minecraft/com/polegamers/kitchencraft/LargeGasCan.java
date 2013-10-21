package com.polegamers.kitchencraft;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LargeGasCan extends Item {

	private String iconPath;
	
	@SideOnly(Side.CLIENT)
	private Icon largeGasCan;
	
	public LargeGasCan(int par1, String par2String) {
		super(par1);
		
		this.iconPath = par2String;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.largeGasCan = par1IconRegister.registerIcon("mod/" + this.iconPath);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1){
		return this.largeGasCan; 
	}

}
