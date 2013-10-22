package com.polegamers.kitchencraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ButcherKnife extends Item{
	
	private String iconPath;
	
	@SideOnly(Side.CLIENT)
	private Icon butcherKnife;
	
	public ButcherKnife(int par1, String par2String){
		super(par1);
		
		this.iconPath = par2String;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.butcherKnife = par1IconRegister.registerIcon("kc/" + this.iconPath);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1){
		return this.butcherKnife;
	}

}
