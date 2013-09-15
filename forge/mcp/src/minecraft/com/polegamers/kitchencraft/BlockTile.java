package com.polegamers.kitchencraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockTile extends Block {

	public BlockTile(int par1, String par2) {
		super(par1, Material.rock);
		this.setResistance(1F);
		this.setHardness(1F);
		this.setUnlocalizedName(par2 + " Tiles");
		this.setCreativeTab(kcbasemod.kcTab);
		this.blockIcon = this.black;
	}
	
	public Icon black;
	public Icon red;
	public Icon green;
	public Icon blue;
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("kc/" + this.getUnlocalizedName());
        this.black = par1IconRegister.registerIcon("kc/black");
        this.red = par1IconRegister.registerIcon("kc/red");
        this.green = par1IconRegister.registerIcon("kc/green");
        this.blue = par1IconRegister.registerIcon("kc/blue");
    }

}
