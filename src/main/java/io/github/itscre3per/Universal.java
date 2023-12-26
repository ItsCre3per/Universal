package io.github.itscre3per;

import io.github.itscre3per.block.ModBlocks;
import io.github.itscre3per.item.ModItemGroups;
import io.github.itscre3per.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Universal implements ModInitializer {
	public static final String MOD_ID = "universal";
    public static final Logger LOGGER = LoggerFactory.getLogger("Universal");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}

	public static void formatTooltips(String key, List<Text> tooltip) {
		for(String lines : Text.translatable(key).getString().split("\n")) {
			tooltip.add(Text.literal(lines));
		}
	}
}