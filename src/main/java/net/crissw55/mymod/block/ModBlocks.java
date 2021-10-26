package net.crissw55.mymod.block;

import net.crissw55.mymod.MyMod;
import net.crissw55.mymod.block.custom.FirestoneBlock;
import net.crissw55.mymod.item.ModItemGroup;
import net.crissw55.mymod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister <Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MyMod.MOD_ID);

    public static final RegistryObject<Block> CHERRYBLOSSOM_BLOCK
            = registerBlock("cherryblossom_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.WOOD).harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.WOOD)
                    .setRequiresTool()
            ));
    public static final RegistryObject<Block> FIRESTONE_BLOCK
            = registerBlock("firestone_block",
            () -> new FirestoneBlock(AbstractBlock.Properties
                    .create(Material.IRON).harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE))

            );

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.MyModGroup)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}
