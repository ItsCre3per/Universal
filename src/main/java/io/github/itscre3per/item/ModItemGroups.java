package io.github.itscre3per.item;

import io.github.itscre3per.Universal;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MATERIALS_GROUP =
            Registry.register(Registries.ITEM_GROUP, new Identifier(Universal.MOD_ID, "ironite_ingot"),
                    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod_materials")).icon(() ->
                            new ItemStack(ModItems.IRONITE_INGOT)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.IRONITE_INGOT);
                        entries.add(Items.DIAMOND);
                    })).build());
    public static void registerItemGroups() {
        Universal.LOGGER.info("Registering mod item groups for " + Universal.MOD_ID);
    }
}
