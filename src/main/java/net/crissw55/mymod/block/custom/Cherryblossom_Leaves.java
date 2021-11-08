package net.crissw55.mymod.block.custom;



import com.sun.jmx.snmp.SnmpOpaque;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class Cherryblossom_Leaves extends LeavesBlock {

    Material material;
    public Cherryblossom_Leaves(Material material) {

        super(AbstractBlock.Properties
                .create(material));


    }
}
