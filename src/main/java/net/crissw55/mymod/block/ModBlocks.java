package net.crissw55.mymod.block;

import net.crissw55.mymod.MyMod;
import net.crissw55.mymod.block.custom.Cherryblossom_Leaves;
import net.crissw55.mymod.block.custom.FirestoneBlock;
import net.crissw55.mymod.item.AbstractTree;
import net.crissw55.mymod.item.ModItemGroup;
import net.crissw55.mymod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister <Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MyMod.MOD_ID);

    public static final RegistryObject<Block> CHERRYBLOSSOM_BLOCK
            = registerBlock("cherryblossom_block",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.WOOD).harvestLevel(1)
                    .harvestTool(ToolType.AXE).sound(SoundType.WOOD)
                    .setRequiresTool()
            ));
    public static final RegistryObject<Block> CHERRYBLOSSOM_LOG
            = registerBlock("cherryblossom_log",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.WOOD).harvestLevel(1)
                    .harvestTool(ToolType.AXE).sound(SoundType.WOOD)
                    .setRequiresTool()
            ));
    public static final RegistryObject<Block> CHERRYBLOSSOM_LEAVES
            = registerBlock("cherryblossom_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties
                    .create(Material.LEAVES).harvestLevel(1)
                    .harvestTool(ToolType.AXE).sound(SoundType.PLANT)
                    .setRequiresTool()
                    .notSolid()
            ));
    public static final RegistryObject<Block> CHERRYBLOSSOM_SAPLING
            = registerBlock("cherryblossom_sapling",
            () -> new SaplingBlock(new AbstractTree(), AbstractBlock.Properties
                    .create(Material.LEAVES).harvestLevel(1)
                    .harvestTool(ToolType.AXE).sound(SoundType.PLANT)
                    .setRequiresTool()
                    .notSolid()
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

        //System.out.println("Does array have specific block " +  BLOCKS.getEntries().contains());
        System.out.println("The size of the array of blocks " + BLOCKS.getEntries().size());

    }
}
