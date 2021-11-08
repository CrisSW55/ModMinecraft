package net.crissw55.mymod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup  {

    String resourcePath = "resources/assets/mymod/textures/item/redstone_sword.png";

    public static final ItemGroup MyModGroup = new ItemGroup("myModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SQUIRTLE_TOY.get());
        }
    };

}
