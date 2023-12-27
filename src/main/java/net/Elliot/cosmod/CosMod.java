package net.Elliot.cosmod;

import net.Elliot.cosmod.block.ModBlocks;
import net.Elliot.cosmod.item.ModItemGroups;
import net.Elliot.cosmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CosMod implements ModInitializer {
	public static final String MOD_ID = "cosmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}