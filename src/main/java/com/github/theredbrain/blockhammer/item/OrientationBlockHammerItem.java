package com.github.theredbrain.blockhammer.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
//import net.minecraft.block.entity.PistonBlockEntity;
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

//import java.util.List;

public class OrientationBlockHammerItem extends Item{
    public OrientationBlockHammerItem(FabricItemSettings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        PlayerEntity playerEntity = context.getPlayer();

        if(playerEntity != null) {
            // cardinal directions
            if(block.getClass() == AnvilBlock.class) {
                if(blockState.get(AnvilBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(AnvilBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(AnvilBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(AnvilBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(AnvilBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(AnvilBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(AnvilBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(AnvilBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == BeehiveBlock.class) {
                if(blockState.get(BeehiveBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BeehiveBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(BeehiveBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BeehiveBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(BeehiveBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BeehiveBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(BeehiveBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BeehiveBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == BellBlock.class) {
                if(blockState.get(BellBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BellBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(BellBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BellBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(BellBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BellBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(BellBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BellBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == BlastFurnaceBlock.class) {
                if(blockState.get(BlastFurnaceBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BlastFurnaceBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(BlastFurnaceBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BlastFurnaceBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(BlastFurnaceBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BlastFurnaceBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(BlastFurnaceBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BlastFurnaceBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == CampfireBlock.class) {
                if(blockState.get(CampfireBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CampfireBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(CampfireBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CampfireBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(CampfireBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CampfireBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(CampfireBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CampfireBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == CarvedPumpkinBlock.class) {
                if(blockState.get(CarvedPumpkinBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CarvedPumpkinBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(CarvedPumpkinBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CarvedPumpkinBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(CarvedPumpkinBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CarvedPumpkinBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(CarvedPumpkinBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(CarvedPumpkinBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == DoorBlock.class) {
                if(blockState.get(DoorBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DoorBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(DoorBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DoorBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(DoorBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DoorBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(DoorBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DoorBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == EnderChestBlock.class) {
                if(blockState.get(EnderChestBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EnderChestBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(EnderChestBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EnderChestBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(EnderChestBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EnderChestBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(EnderChestBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EnderChestBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == FenceGateBlock.class) {
                if(blockState.get(FenceGateBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FenceGateBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(FenceGateBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FenceGateBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(FenceGateBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FenceGateBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(FenceGateBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FenceGateBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == FurnaceBlock.class) {
                if(blockState.get(FurnaceBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FurnaceBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(FurnaceBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FurnaceBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(FurnaceBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FurnaceBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(FurnaceBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(FurnaceBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == GlazedTerracottaBlock.class) {
                if(blockState.get(GlazedTerracottaBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GlazedTerracottaBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(GlazedTerracottaBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GlazedTerracottaBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(GlazedTerracottaBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GlazedTerracottaBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(GlazedTerracottaBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GlazedTerracottaBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == GrindstoneBlock.class) {
                if(blockState.get(GrindstoneBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(GrindstoneBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(GrindstoneBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(GrindstoneBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(GrindstoneBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == LecternBlock.class) {
                if(blockState.get(LecternBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LecternBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(LecternBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LecternBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(LecternBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LecternBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(LecternBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LecternBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == LoomBlock.class) {
                if(blockState.get(LoomBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LoomBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(LoomBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LoomBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(LoomBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LoomBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(LoomBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(LoomBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == SmokerBlock.class) {
                if(blockState.get(SmokerBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SmokerBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(SmokerBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SmokerBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(SmokerBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SmokerBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(SmokerBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SmokerBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == StonecutterBlock.class) {
                if(blockState.get(StonecutterBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StonecutterBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(StonecutterBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StonecutterBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(StonecutterBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StonecutterBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(StonecutterBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StonecutterBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == StairsBlock.class) {
                if(blockState.get(StairsBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StairsBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(StairsBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StairsBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(StairsBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StairsBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(StairsBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StairsBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == StoneButtonBlock.class) {
                if(blockState.get(StoneButtonBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StoneButtonBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(StoneButtonBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StoneButtonBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(StoneButtonBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StoneButtonBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(StoneButtonBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(StoneButtonBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == TrapdoorBlock.class) {
                if(blockState.get(TrapdoorBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(TrapdoorBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(TrapdoorBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(TrapdoorBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(TrapdoorBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(TrapdoorBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(TrapdoorBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(TrapdoorBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            if(block.getClass() == WoodenButtonBlock.class) {
                if(blockState.get(WoodenButtonBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(WoodenButtonBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(WoodenButtonBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(WoodenButtonBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(WoodenButtonBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(WoodenButtonBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(WoodenButtonBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(WoodenButtonBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            // lever
            if(block.getClass() == LeverBlock.class) {
                if(!(blockState.get(LeverBlock.FACE) == WallMountLocation.WALL)) {
                    if (blockState.get(LeverBlock.FACING) == Direction.EAST) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(LeverBlock.FACING, Direction.SOUTH));
                        }
                    } else if (blockState.get(LeverBlock.FACING) == Direction.SOUTH) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(LeverBlock.FACING, Direction.WEST));
                        }
                    } else if (blockState.get(LeverBlock.FACING) == Direction.WEST) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(LeverBlock.FACING, Direction.NORTH));
                        }
                    } else if (blockState.get(LeverBlock.FACING) == Direction.NORTH) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(LeverBlock.FACING, Direction.EAST));
                        }
                    } else {
                        return ActionResult.PASS;
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.PASS;
                }
            }
            // up and down + cardinal directions
            else if(block.getClass() == BarrelBlock.class) {
                if(blockState.get(BarrelBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BarrelBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(BarrelBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BarrelBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(BarrelBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BarrelBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(BarrelBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BarrelBlock.FACING, Direction.UP));
                    }
                } else if(blockState.get(BarrelBlock.FACING) == Direction.UP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BarrelBlock.FACING, Direction.DOWN));
                    }
                } else if(blockState.get(BarrelBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BarrelBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == EndRodBlock.class) {
                if(blockState.get(EndRodBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EndRodBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(EndRodBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EndRodBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(EndRodBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EndRodBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(EndRodBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EndRodBlock.FACING, Direction.UP));
                    }
                } else if(blockState.get(EndRodBlock.FACING) == Direction.UP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EndRodBlock.FACING, Direction.DOWN));
                    }
                } else if(blockState.get(EndRodBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(EndRodBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == DispenserBlock.class) {
                if(blockState.get(DispenserBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DispenserBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(DispenserBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DispenserBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(DispenserBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DispenserBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(DispenserBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DispenserBlock.FACING, Direction.UP));
                    }
                } else if(blockState.get(DispenserBlock.FACING) == Direction.UP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DispenserBlock.FACING, Direction.DOWN));
                    }
                } else if(blockState.get(DispenserBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DispenserBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == DropperBlock.class) {
                if(blockState.get(DropperBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DropperBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(DropperBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DropperBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(DropperBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DropperBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(DropperBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DropperBlock.FACING, Direction.UP));
                    }
                } else if(blockState.get(DropperBlock.FACING) == Direction.UP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DropperBlock.FACING, Direction.DOWN));
                    }
                } else if(blockState.get(DropperBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(DropperBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == ObserverBlock.class) {
                if(blockState.get(ObserverBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ObserverBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(ObserverBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ObserverBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(ObserverBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ObserverBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(ObserverBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ObserverBlock.FACING, Direction.UP));
                    }
                } else if(blockState.get(ObserverBlock.FACING) == Direction.UP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ObserverBlock.FACING, Direction.DOWN));
                    }
                } else if(blockState.get(ObserverBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ObserverBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == ShulkerBoxBlock.class) {
                if(blockState.get(ShulkerBoxBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ShulkerBoxBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(ShulkerBoxBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ShulkerBoxBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(ShulkerBoxBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ShulkerBoxBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(ShulkerBoxBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ShulkerBoxBlock.FACING, Direction.UP));
                    }
                } else if(blockState.get(ShulkerBoxBlock.FACING) == Direction.UP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ShulkerBoxBlock.FACING, Direction.DOWN));
                    }
                } else if(blockState.get(ShulkerBoxBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(ShulkerBoxBlock.FACING, Direction.EAST));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            // piston TODO
            else if(block.getClass() == PistonBlock.class) {
                if(!blockState.get(PistonBlock.EXTENDED)) {
                    if(blockState.get(PistonBlock.FACING) == Direction.DOWN) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(PistonBlock.FACING, Direction.EAST));
                        }
                    } else if(blockState.get(PistonBlock.FACING) == Direction.EAST) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(PistonBlock.FACING, Direction.SOUTH));
                        }
                    } else if(blockState.get(PistonBlock.FACING) == Direction.SOUTH) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(PistonBlock.FACING, Direction.WEST));
                        }
                    } else if(blockState.get(PistonBlock.FACING) == Direction.WEST) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(PistonBlock.FACING, Direction.NORTH));
                        }
                    } else if(blockState.get(PistonBlock.FACING) == Direction.NORTH) {
                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(PistonBlock.FACING, Direction.DOWN));
                        }
                    } else {
                        return ActionResult.PASS;
                    }
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.PASS;
                }
            }
            // hopper
            else if(block.getClass() == HopperBlock.class) {
                if(blockState.get(HopperBlock.FACING) == Direction.DOWN) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HopperBlock.FACING, Direction.EAST));
                    }
                } else if(blockState.get(HopperBlock.FACING) == Direction.EAST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HopperBlock.FACING, Direction.SOUTH));
                    }
                } else if(blockState.get(HopperBlock.FACING) == Direction.SOUTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HopperBlock.FACING, Direction.WEST));
                    }
                } else if(blockState.get(HopperBlock.FACING) == Direction.WEST) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HopperBlock.FACING, Direction.NORTH));
                    }
                } else if(blockState.get(HopperBlock.FACING) == Direction.NORTH) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(HopperBlock.FACING, Direction.DOWN));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            // 16 cardinal directions
            else if(block.getClass() == BannerBlock.class) {
                if(blockState.get(BannerBlock.ROTATION) == 0) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 1));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 1) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 2));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 2) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 3));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 3) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 4));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 4) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 5));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 5) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 6));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 6) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 7));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 7) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 8));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 8) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 9));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 9) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 10));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 10) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 11));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 11) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 12));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 12) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 13));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 13) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 14));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 14) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 15));
                    }
                } else if(blockState.get(BannerBlock.ROTATION) == 15) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(BannerBlock.ROTATION, 0));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == SignBlock.class) {
                if(blockState.get(SignBlock.ROTATION) == 0) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 1));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 1) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 2));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 2) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 3));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 3) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 4));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 4) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 5));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 5) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 6));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 6) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 7));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 7) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 8));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 8) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 9));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 9) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 10));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 10) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 11));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 11) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 12));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 12) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 13));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 13) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 14));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 14) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 15));
                    }
                } else if(blockState.get(SignBlock.ROTATION) == 15) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SignBlock.ROTATION, 0));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == SkullBlock.class) {
                if(blockState.get(SkullBlock.ROTATION) == 0) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 1));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 1) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 2));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 2) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 3));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 3) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 4));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 4) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 5));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 5) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 6));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 6) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 7));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 7) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 8));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 8) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 9));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 9) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 10));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 10) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 11));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 11) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 12));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 12) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 13));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 13) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 14));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 14) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 15));
                    }
                } else if(blockState.get(SkullBlock.ROTATION) == 15) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SkullBlock.ROTATION, 0));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else {
                playerEntity.sendMessage(new TranslatableText("item.block-hammer.orientation_block_hammer.no_orientation"), true);
                return ActionResult.PASS;
            }
        } else {
            return ActionResult.PASS;
        }
    }
}