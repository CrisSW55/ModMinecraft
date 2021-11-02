package net.crissw55.mymod.item.custom;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResultType;

public class RedstoneSword extends SwordItem{


    public RedstoneSword(IItemTier iItemTier, int num1, float num2, Properties properties) {
        super(iItemTier, num1, num2, properties);
    }


    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        return super.onItemUseFirst(stack, context);
    }


}
