package net.crissw55.mymod.item.custom;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.RedstoneParticle;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.state.properties.RedstoneSide;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import net.minecraft.block.RedstoneOreBlock;

import java.util.Random;

public class RedstoneSword extends SwordItem{


    public RedstoneSword(IItemTier iItemTier, int attackDamageIn, float attackSpeedIn, Properties properties) {
        super(iItemTier, attackDamageIn, attackSpeedIn, properties);
    }


    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        return super.onItemUseFirst(stack, context);
    }

    @Override
    public boolean canHarvestBlock(BlockState blockState) {
        if(blockState.getMaterial() == Material.CACTUS){
            blockState.matchesBlock(Blocks.CACTUS);

        }
        if(blockState.getMaterial() == Material.PLANTS){
            blockState.matchesBlock(Blocks.VINE);

        }

        if(blockState.getMaterial() == Material.GLASS){
            blockState.matchesBlock(Blocks.GLASS);

        }

        return blockState.matchesBlock(Blocks.COBWEB);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        if(world.isRemote){


        }
        System.out.println("Right clicked!");


        return super.onItemRightClick(world, player, hand);
    }





}
