package com.polegamers.kitchencraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ChromeOre extends Block{

	public ChromeOre(int par1) {
		super(par1, Material.rock);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1){
		this.blockIcon = par1.registerIcon("chromeOre");
	}

}
