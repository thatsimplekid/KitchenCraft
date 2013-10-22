package com.polegamers.kitchencraft;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ChromeOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		}

	}

	private void generateSurface(World world, Random random, int i, int j){
		for(int k = 0; k < 25; k++){
			int chromeOreX = i + random.nextInt(16);
			int chromeOreY = random.nextInt(50);
			int chromeOreZ = j + random.nextInt(16);
			
			(new WorldGenMinable(kcbasemod.chromeOre.blockID, 10)).generate(world, random, chromeOreX, chromeOreY, chromeOreZ);
		}
	}
	
}
