package io.github.itscre3per.block;

import io.github.itscre3per.Universal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block IRONITE_BLOCK = registerBlock("ironite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)
            .sounds(Blocks.IRON_BLOCK.getSoundGroup(Blocks.IRON_BLOCK.getDefaultState()))));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Universal.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Universal.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        Universal.LOGGER.info("Registering mod blocks for " + Universal.MOD_ID);
    }
}
