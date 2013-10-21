package com.polegamers.kitchencraft;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class gasFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == kcbasemod.smallGasCan.itemID){
			return 500;
			
		}else if(fuel.itemID == kcbasemod.medGasCan.itemID){
			return 1200;
		}else if(fuel.itemID == kcbasemod.largeGasCan.itemID){
			return 2600;
		
		}else{
			return 0;
		
		}
	}

}
