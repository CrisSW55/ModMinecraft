package net.crissw55.mymod.item;

import net.crissw55.mymod.MyMod;
import net.crissw55.mymod.item.custom.RedstoneSword;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    public static final RegistryObject<Item> SQUIRTLE_TOY = ITEMS.register("squirtletoy",
            () -> new Item(new Item.Properties().group(ModItemGroup.MyModGroup)));
    public static final RegistryObject<Item> Redstone_Sword = ITEMS.register("redstone_sword",
            () -> new RedstoneSword(new IItemTierClass(),2,1,new Item.Properties().group(ModItemGroup.MyModGroup)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
