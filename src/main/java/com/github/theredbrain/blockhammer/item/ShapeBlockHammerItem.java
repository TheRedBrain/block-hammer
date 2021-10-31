package com.github.theredbrain.blockhammer.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.block.enums.WallShape;
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

public class ShapeBlockHammerItem extends Item{
    public ShapeBlockHammerItem(FabricItemSettings settings) {
        super(settings);
    }

    //@Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        PlayerEntity playerEntity = context.getPlayer();
        Direction interactedBlockSide = context.getPlayerFacing().getOpposite();

        if(playerEntity != null) {
            if(block.getClass() == FenceBlock.class) {
                if (!world.isClient()) {
                    if (interactedBlockSide == Direction.EAST) {
                        if (blockState.get(FenceBlock.EAST)) {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.EAST, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.EAST, true));
                        }
                    } else if (interactedBlockSide == Direction.SOUTH) {
                        if (blockState.get(FenceBlock.SOUTH)) {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.SOUTH, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.SOUTH, true));
                        }
                    } else if (interactedBlockSide == Direction.WEST) {
                        if (blockState.get(FenceBlock.WEST)) {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.WEST, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.WEST, true));
                        }
                    } else if (interactedBlockSide == Direction.NORTH) {
                        if (blockState.get(FenceBlock.NORTH)) {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.NORTH, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(FenceBlock.NORTH, true));
                        }
                    } else {
                        return ActionResult.PASS;
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == FenceGateBlock.class) {
                if (!world.isClient()) {
                    if (blockState.get(FenceGateBlock.IN_WALL)) {
                        world.setBlockState(blockPos, blockState.with(FenceGateBlock.IN_WALL, false));
                    } else {
                        world.setBlockState(blockPos, blockState.with(FenceGateBlock.IN_WALL, true));
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == PaneBlock.class) {
                if (!world.isClient()) {
                    if (interactedBlockSide == Direction.EAST) {
                        if (blockState.get(PaneBlock.EAST)) {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.EAST, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.EAST, true));
                        }
                    } else if (interactedBlockSide == Direction.SOUTH) {
                        if (blockState.get(PaneBlock.SOUTH)) {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.SOUTH, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.SOUTH, true));
                        }
                    } else if (interactedBlockSide == Direction.WEST) {
                        if (blockState.get(PaneBlock.WEST)) {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.WEST, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.WEST, true));
                        }
                    } else if (interactedBlockSide == Direction.NORTH) {
                        if (blockState.get(PaneBlock.NORTH)) {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.NORTH, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(PaneBlock.NORTH, true));
                        }
                    } else {
                        return ActionResult.PASS;
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == StainedGlassPaneBlock.class) {
                if (!world.isClient()) {
                    if (interactedBlockSide == Direction.EAST) {
                        if (blockState.get(StainedGlassPaneBlock.EAST)) {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.EAST, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.EAST, true));
                        }
                    } else if (interactedBlockSide == Direction.SOUTH) {
                        if (blockState.get(StainedGlassPaneBlock.SOUTH)) {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.SOUTH, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.SOUTH, true));
                        }
                    } else if (interactedBlockSide == Direction.WEST) {
                        if (blockState.get(StainedGlassPaneBlock.WEST)) {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.WEST, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.WEST, true));
                        }
                    } else if (interactedBlockSide == Direction.NORTH) {
                        if (blockState.get(StainedGlassPaneBlock.NORTH)) {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.NORTH, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(StainedGlassPaneBlock.NORTH, true));
                        }
                    } else {
                        return ActionResult.PASS;
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == StairsBlock.class) {
                if (!world.isClient()) {
                    if (blockState.get(StairsBlock.SHAPE) == StairShape.STRAIGHT && blockState.get(StairsBlock.HALF) == BlockHalf.BOTTOM) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.INNER_LEFT));
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.INNER_LEFT && blockState.get(StairsBlock.HALF) == BlockHalf.BOTTOM) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.INNER_RIGHT));
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.INNER_RIGHT && blockState.get(StairsBlock.HALF) == BlockHalf.BOTTOM) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.OUTER_LEFT));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.OUTER_LEFT && blockState.get(StairsBlock.HALF) == BlockHalf.BOTTOM) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.OUTER_RIGHT));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.OUTER_RIGHT && blockState.get(StairsBlock.HALF) == BlockHalf.BOTTOM) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.STRAIGHT).with(StairsBlock.HALF, BlockHalf.TOP));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.STRAIGHT && blockState.get(StairsBlock.HALF) == BlockHalf.TOP) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.INNER_LEFT));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.INNER_LEFT && blockState.get(StairsBlock.HALF) == BlockHalf.TOP) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.INNER_RIGHT));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.INNER_RIGHT && blockState.get(StairsBlock.HALF) == BlockHalf.TOP) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.OUTER_LEFT));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.OUTER_LEFT && blockState.get(StairsBlock.HALF) == BlockHalf.TOP) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.OUTER_RIGHT));
//                        }
                    } else if (blockState.get(StairsBlock.SHAPE) == StairShape.OUTER_RIGHT && blockState.get(StairsBlock.HALF) == BlockHalf.TOP) {
//                        if (!world.isClient()) {
                            world.setBlockState(blockPos, blockState.with(StairsBlock.SHAPE, StairShape.STRAIGHT).with(StairsBlock.HALF, BlockHalf.BOTTOM));
//                        }
                    } else {
                        return ActionResult.PASS;
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == SlabBlock.class) {
                if (blockState.get(SlabBlock.TYPE) == SlabType.BOTTOM) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SlabBlock.TYPE, SlabType.TOP));
                    }
                } else if (blockState.get(SlabBlock.TYPE) == SlabType.TOP) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SlabBlock.TYPE, SlabType.DOUBLE));
                    }
                } else if (blockState.get(SlabBlock.TYPE) == SlabType.DOUBLE) {
                    if (!world.isClient()) {
                        world.setBlockState(blockPos, blockState.with(SlabBlock.TYPE, SlabType.BOTTOM));
                    }
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else if(block.getClass() == WallBlock.class) {
                if (!world.isClient()) {
                    if (context.getPlayerFacing().getAxis() == Direction.Axis.Y) {
                        if (blockState.get(WallBlock.UP)) {
                            world.setBlockState(blockPos, blockState.with(WallBlock.UP, false));
                        } else {
                            world.setBlockState(blockPos, blockState.with(WallBlock.UP, true));
                        }
                    }
                    else if (context.getPlayerFacing().getAxis() == Direction.Axis.X || context.getPlayerFacing().getAxis() == Direction.Axis.Z) {
                        if (interactedBlockSide == Direction.EAST) {
                            if (blockState.get(WallBlock.EAST_SHAPE) == WallShape.NONE) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.EAST_SHAPE, WallShape.LOW));
                            } else if (blockState.get(WallBlock.EAST_SHAPE) == WallShape.LOW) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.EAST_SHAPE, WallShape.TALL));
                            } else if (blockState.get(WallBlock.EAST_SHAPE) == WallShape.TALL) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.EAST_SHAPE, WallShape.NONE));
                            } else {
                                return ActionResult.PASS;
                            }
                        } else if (interactedBlockSide == Direction.SOUTH) {
                            if (blockState.get(WallBlock.SOUTH_SHAPE) == WallShape.NONE) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.SOUTH_SHAPE, WallShape.LOW));
                            } else if (blockState.get(WallBlock.SOUTH_SHAPE) == WallShape.LOW) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.SOUTH_SHAPE, WallShape.TALL));
                            } else if (blockState.get(WallBlock.SOUTH_SHAPE) == WallShape.TALL) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.SOUTH_SHAPE, WallShape.NONE));
                            } else {
                                return ActionResult.PASS;
                            }
                        } else if (interactedBlockSide == Direction.WEST) {
                            if (blockState.get(WallBlock.WEST_SHAPE) == WallShape.NONE) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.WEST_SHAPE, WallShape.LOW));
                            } else if (blockState.get(WallBlock.WEST_SHAPE) == WallShape.LOW) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.WEST_SHAPE, WallShape.TALL));
                            } else if (blockState.get(WallBlock.WEST_SHAPE) == WallShape.TALL) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.WEST_SHAPE, WallShape.NONE));
                            } else {
                                return ActionResult.PASS;
                            }
                        } else if (interactedBlockSide == Direction.NORTH) {
                            if (blockState.get(WallBlock.NORTH_SHAPE) == WallShape.NONE) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.NORTH_SHAPE, WallShape.LOW));
                            } else if (blockState.get(WallBlock.NORTH_SHAPE) == WallShape.LOW) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.NORTH_SHAPE, WallShape.TALL));
                            } else if (blockState.get(WallBlock.NORTH_SHAPE) == WallShape.TALL) {
                                world.setBlockState(blockPos, blockState.with(WallBlock.NORTH_SHAPE, WallShape.NONE));
                            } else {
                                return ActionResult.PASS;
                            }
                        } else {
                            return ActionResult.PASS;
                        }
                    }
                    else {
                        return ActionResult.PASS;
                    }
                } else {
                    return ActionResult.PASS;
                }
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.success(world.isClient());
            }
            else {
                playerEntity.sendMessage(new TranslatableText("item.block-hammer.shape_block_hammer.no_shape"), true);
                return ActionResult.PASS;
            }
        } else {
            return ActionResult.PASS;
        }
    }
}