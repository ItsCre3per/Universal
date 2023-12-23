package io.github.itscre3per;

import io.github.itscre3per.item.ModItemGroups;
import io.github.itscre3per.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Universal implements ModInitializer {
	public static final String MOD_ID = "universal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}