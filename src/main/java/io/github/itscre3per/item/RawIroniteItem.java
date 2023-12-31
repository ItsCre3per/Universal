package io.github.itscre3per.item;

import io.github.itscre3per.Universal;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RawIroniteItem extends Item {
    public RawIroniteItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        Universal.formatTooltips("item.universal.raw_ironite.tooltip", tooltip);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
