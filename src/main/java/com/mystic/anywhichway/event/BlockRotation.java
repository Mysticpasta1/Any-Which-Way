package com.mystic.anywhichway.event;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockRotation
{
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    List<ResourceLocation> blocks = new ArrayList<ResourceLocation>();
    List<EnumFacing> directions = new ArrayList<>();


    public BlockRotation(){
        directions.addAll(Arrays.asList(EnumFacing.VALUES));
        blocks.addAll(Block.REGISTRY.getKeys());
    }
}
