package net.crissw55.mymod.block.custom;

import net.crissw55.mymod.item.custom.Firestone;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class FirestoneBlock extends Block {
    public FirestoneBlock(Properties properties) {
        super(AbstractBlock.Properties.create(Material.ROCK));
    }

    @SuppressWarnings("deprecation")

    @Override
    public ActionResultType onBlockActivated(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerEntity, Hand handIn, BlockRayTraceResult blockRayTraceResult) {
        if(!worldIn.isRemote){
            if(handIn == Hand.MAIN_HAND){
                System.out.println("Right clicked main handIn!");


            }
            if(handIn == Hand.OFF_HAND){
                System.out.println("Left clicked off hand!");


            }

        }


        return super.onBlockActivated(blockState, worldIn, pos, playerEntity, handIn, blockRayTraceResult);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        Firestone.lightEntityOnFire(entityIn,5);
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}
