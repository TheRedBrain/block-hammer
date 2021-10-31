package com.github.theredbrain.blockhammer.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class AxisBlockHammerItem extends Item{

    public AxisBlockHammerItem(FabricItemSettings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        PlayerEntity playerEntity = context.getPlayer();

        if(playerEntity != null) {
            // TODO Boneblock
            if(block.getClass() == PillarBlock.class) {
                if (blockState.get(PillarBlock.AXIS) == Direction.Axis.X) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(PillarBlock.AXIS, Direction.Axis.Y));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(PillarBlock.AXIS) == Direction.Axis.Y) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(PillarBlock.AXIS, Direction.Axis.Z));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(PillarBlock.AXIS) == Direction.Axis.Z) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(PillarBlock.AXIS, Direction.Axis.X));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.PASS;
                }
            } else if(block.getClass() == GrindstoneBlock.class) {
                if (blockState.get(GrindstoneBlock.FACE) == WallMountLocation.CEILING) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACE, WallMountLocation.WALL));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(GrindstoneBlock.FACE) == WallMountLocation.WALL) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACE, WallMountLocation.FLOOR));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(GrindstoneBlock.FACE) == WallMountLocation.FLOOR) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACE, WallMountLocation.CEILING));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.PASS;
                }
            } else if(block.getClass() == ChainBlock.class) {
                if (blockState.get(ChainBlock.AXIS) == Direction.Axis.X) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ChainBlock.AXIS, Direction.Axis.Y));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(ChainBlock.AXIS) == Direction.Axis.Y) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ChainBlock.AXIS, Direction.Axis.Z));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(ChainBlock.AXIS) == Direction.Axis.Z) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ChainBlock.AXIS, Direction.Axis.X));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.PASS;
                }
            } else if(block.getClass() == HayBlock.class) {
                if (blockState.get(HayBlock.AXIS) == Direction.Axis.X) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HayBlock.AXIS, Direction.Axis.Y));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(HayBlock.AXIS) == Direction.Axis.Y) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HayBlock.AXIS, Direction.Axis.Z));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else if (blockState.get(HayBlock.AXIS) == Direction.Axis.Z) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HayBlock.AXIS, Direction.Axis.X));
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.PASS;
                }
            }  else {
                playerEntity.sendMessage(new TranslatableText("item.block-hammer.axis_block_hammer.no_axis"), true);
                return ActionResult.PASS;
            }
        } else {
            return ActionResult.PASS;
        }
    }
}