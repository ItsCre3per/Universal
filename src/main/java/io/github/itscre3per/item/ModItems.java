package io.github.itscre3per.item;

import io.github.itscre3per.Universal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_IRONITE = registerItem("raw_ironite", new RawIroniteItem(new FabricItemSettings()));
    public static final Item IRONITE_INGOT = registerItem("ironite_ingot", new IroniteIngotItem(new FabricItemSettings()));

    // Used to register an item ^^
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Universal.MOD_ID, name), item);
    }

    // Used to register all items in this class, called in Universal.java
    public static void registerModItems() {
        Universal.LOGGER.info("Registering mod items for " + Universal.MOD_ID);
    }
}
