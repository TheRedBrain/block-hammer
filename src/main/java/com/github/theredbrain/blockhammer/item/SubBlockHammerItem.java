package com.github.theredbrain.blockhammer.item;

import com.google.common.collect.ImmutableMap.Builder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

@SuppressWarnings(value = "unchecked")
public class SubBlockHammerItem extends Item {

    protected static final Map<Block, Block> BLOCKS_AND_SUB_BLOCKS;

    public SubBlockHammerItem(FabricItemSettings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = (Block) BLOCKS_AND_SUB_BLOCKS.get(blockState.getBlock());
        PlayerEntity playerEntity = context.getPlayer();

        if(playerEntity != null) {
            if (block != null) {
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (!world.isClient()) {
                    world.setBlockState(blockPos, (BlockState) block.getDefaultState(), 11);
                }
                return ActionResult.success(world.isClient());
            } else {
                playerEntity.sendMessage(new TranslatableText("item.block-hammer.sub_block_hammer.no_sub_blocks"), true);
                return ActionResult.PASS;
            }
        } else {
            return ActionResult.PASS;
        }
    }

    static {
        // TODO get blocks from json
        BLOCKS_AND_SUB_BLOCKS = new Builder()
            // stone
            .put(Blocks.STONE, Blocks.STONE_STAIRS).put(Blocks.STONE_STAIRS, Blocks.STONE_SLAB).put(Blocks.STONE_SLAB, Blocks.STONE)
            .put(Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB).put(Blocks.SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE)
            .put(Blocks.STONE_BRICKS, Blocks.STONE_BRICK_STAIRS).put(Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BRICK_SLAB).put(Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICK_WALL).put(Blocks.STONE_BRICK_WALL, Blocks.STONE_BRICKS)
            .put(Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_STAIRS).put(Blocks.MOSSY_STONE_BRICK_STAIRS, Blocks.MOSSY_STONE_BRICK_SLAB).put(Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICK_WALL).put(Blocks.MOSSY_STONE_BRICK_WALL, Blocks.MOSSY_STONE_BRICKS)
            .put(Blocks.COBBLESTONE, Blocks.COBBLESTONE_STAIRS).put(Blocks.COBBLESTONE_STAIRS, Blocks.COBBLESTONE_SLAB).put(Blocks.COBBLESTONE_SLAB, Blocks.COBBLESTONE_WALL).put(Blocks.COBBLESTONE_WALL, Blocks.COBBLESTONE)
            .put(Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_STAIRS).put(Blocks.MOSSY_COBBLESTONE_STAIRS, Blocks.MOSSY_COBBLESTONE_SLAB).put(Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE_WALL).put(Blocks.MOSSY_COBBLESTONE_WALL, Blocks.MOSSY_COBBLESTONE)
            // overworld stone variants
            .put(Blocks.ANDESITE, Blocks.ANDESITE_STAIRS).put(Blocks.ANDESITE_STAIRS, Blocks.ANDESITE_SLAB).put(Blocks.ANDESITE_SLAB, Blocks.ANDESITE_WALL).put(Blocks.ANDESITE_WALL, Blocks.ANDESITE)
            .put(Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_STAIRS).put(Blocks.POLISHED_ANDESITE_STAIRS, Blocks.POLISHED_ANDESITE_SLAB).put(Blocks.POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE)
            .put(Blocks.DIORITE, Blocks.DIORITE_STAIRS).put(Blocks.DIORITE_STAIRS, Blocks.DIORITE_SLAB).put(Blocks.DIORITE_SLAB, Blocks.DIORITE_WALL).put(Blocks.DIORITE_WALL, Blocks.DIORITE)
            .put(Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_STAIRS).put(Blocks.POLISHED_DIORITE_STAIRS, Blocks.POLISHED_DIORITE_SLAB).put(Blocks.POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE)
            .put(Blocks.GRANITE, Blocks.GRANITE_STAIRS).put(Blocks.GRANITE_STAIRS, Blocks.GRANITE_SLAB).put(Blocks.GRANITE_SLAB, Blocks.GRANITE_WALL).put(Blocks.GRANITE_WALL, Blocks.GRANITE)
            .put(Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_STAIRS).put(Blocks.POLISHED_GRANITE_STAIRS, Blocks.POLISHED_GRANITE_SLAB).put(Blocks.POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE)
            // bricks
            .put(Blocks.BRICKS, Blocks.BRICK_STAIRS).put(Blocks.BRICK_STAIRS, Blocks.BRICK_SLAB).put(Blocks.BRICK_SLAB, Blocks.BRICK_WALL).put(Blocks.BRICK_WALL, Blocks.BRICKS)
            // prismarine
            .put(Blocks.PRISMARINE, Blocks.PRISMARINE_STAIRS).put(Blocks.PRISMARINE_STAIRS, Blocks.PRISMARINE_SLAB).put(Blocks.PRISMARINE_SLAB, Blocks.PRISMARINE_WALL).put(Blocks.PRISMARINE_WALL, Blocks.PRISMARINE)
            .put(Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_STAIRS).put(Blocks.DARK_PRISMARINE_STAIRS, Blocks.DARK_PRISMARINE_SLAB).put(Blocks.DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE)
            .put(Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS).put(Blocks.PRISMARINE_BRICK_STAIRS, Blocks.PRISMARINE_BRICK_SLAB).put(Blocks.PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS)
            // sandstone
            .put(Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS).put(Blocks.SANDSTONE_STAIRS, Blocks.SANDSTONE_SLAB).put(Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE_WALL).put(Blocks.SANDSTONE_WALL, Blocks.SANDSTONE)
            .put(Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_STAIRS).put(Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE_SLAB).put(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE)
            .put(Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE_SLAB).put(Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE)
            // red sandstone
            .put(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS).put(Blocks.RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE_SLAB).put(Blocks.RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE_WALL).put(Blocks.RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE)
            .put(Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_STAIRS).put(Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Blocks.SMOOTH_RED_SANDSTONE_SLAB).put(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE)
            .put(Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE_SLAB).put(Blocks.CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE)
            // black stone
            .put(Blocks.BLACKSTONE, Blocks.BLACKSTONE_STAIRS).put(Blocks.BLACKSTONE_STAIRS, Blocks.BLACKSTONE_SLAB).put(Blocks.BLACKSTONE_SLAB, Blocks.BLACKSTONE_WALL).put(Blocks.BLACKSTONE_WALL, Blocks.BLACKSTONE)
            .put(Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_STAIRS).put(Blocks.POLISHED_BLACKSTONE_STAIRS, Blocks.POLISHED_BLACKSTONE_SLAB).put(Blocks.POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE_WALL).put(Blocks.POLISHED_BLACKSTONE_WALL, Blocks.POLISHED_BLACKSTONE)
            .put(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS).put(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).put(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICK_WALL).put(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, Blocks.POLISHED_BLACKSTONE_BRICKS)
            // nether brick
            .put(Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_STAIRS).put(Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_BRICK_SLAB).put(Blocks.NETHER_BRICK_SLAB, Blocks.NETHER_BRICK_WALL).put(Blocks.NETHER_BRICK_WALL, Blocks.NETHER_BRICK_FENCE).put(Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICKS)
            .put(Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_STAIRS).put(Blocks.RED_NETHER_BRICK_STAIRS, Blocks.RED_NETHER_BRICK_SLAB).put(Blocks.RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICK_WALL).put(Blocks.RED_NETHER_BRICK_WALL, Blocks.RED_NETHER_BRICKS)
            // quartz
            .put(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS).put(Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_SLAB).put(Blocks.QUARTZ_SLAB, Blocks.QUARTZ_BLOCK)
            .put(Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_QUARTZ_STAIRS).put(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.SMOOTH_QUARTZ_SLAB).put(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ)
            // endstone
            .put(Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_STAIRS).put(Blocks.END_STONE_BRICK_STAIRS, Blocks.END_STONE_BRICK_SLAB).put(Blocks.END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICK_WALL).put(Blocks.END_STONE_BRICK_WALL, Blocks.END_STONE_BRICKS)
            // purpur
            .put(Blocks.PURPUR_BLOCK, Blocks.PURPUR_STAIRS).put(Blocks.PURPUR_STAIRS, Blocks.PURPUR_SLAB).put(Blocks.PURPUR_SLAB, Blocks.PURPUR_BLOCK)
            // wooden planks
            .put(Blocks.OAK_PLANKS, Blocks.OAK_STAIRS).put(Blocks.OAK_STAIRS, Blocks.OAK_SLAB).put(Blocks.OAK_SLAB, Blocks.OAK_FENCE).put(Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE).put(Blocks.OAK_FENCE_GATE, Blocks.OAK_PLANKS)
            .put(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_STAIRS).put(Blocks.SPRUCE_STAIRS, Blocks.SPRUCE_SLAB).put(Blocks.SPRUCE_SLAB, Blocks.SPRUCE_FENCE).put(Blocks.SPRUCE_FENCE, Blocks.SPRUCE_FENCE_GATE).put(Blocks.SPRUCE_FENCE_GATE, Blocks.SPRUCE_PLANKS)
            .put(Blocks.BIRCH_PLANKS, Blocks.BIRCH_STAIRS).put(Blocks.BIRCH_STAIRS, Blocks.BIRCH_SLAB).put(Blocks.BIRCH_SLAB, Blocks.BIRCH_FENCE).put(Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE).put(Blocks.BIRCH_FENCE_GATE, Blocks.BIRCH_PLANKS)
            .put(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_STAIRS).put(Blocks.JUNGLE_STAIRS, Blocks.JUNGLE_SLAB).put(Blocks.JUNGLE_SLAB, Blocks.JUNGLE_FENCE).put(Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE).put(Blocks.JUNGLE_FENCE_GATE, Blocks.JUNGLE_PLANKS)
            .put(Blocks.ACACIA_PLANKS, Blocks.ACACIA_STAIRS).put(Blocks.ACACIA_STAIRS, Blocks.ACACIA_SLAB).put(Blocks.ACACIA_SLAB, Blocks.ACACIA_FENCE).put(Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE).put(Blocks.ACACIA_FENCE_GATE, Blocks.ACACIA_PLANKS)
            .put(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_STAIRS).put(Blocks.DARK_OAK_STAIRS, Blocks.DARK_OAK_SLAB).put(Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_FENCE).put(Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE).put(Blocks.DARK_OAK_FENCE_GATE, Blocks.DARK_OAK_PLANKS)
            .put(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STAIRS).put(Blocks.CRIMSON_STAIRS, Blocks.CRIMSON_SLAB).put(Blocks.CRIMSON_SLAB, Blocks.CRIMSON_FENCE).put(Blocks.CRIMSON_FENCE, Blocks.CRIMSON_FENCE_GATE).put(Blocks.CRIMSON_FENCE_GATE, Blocks.CRIMSON_PLANKS)
            .put(Blocks.WARPED_PLANKS, Blocks.WARPED_STAIRS).put(Blocks.WARPED_STAIRS, Blocks.WARPED_SLAB).put(Blocks.WARPED_SLAB, Blocks.WARPED_FENCE).put(Blocks.WARPED_FENCE, Blocks.WARPED_FENCE_GATE).put(Blocks.WARPED_FENCE_GATE, Blocks.WARPED_PLANKS)
            // wooden logs
            .put(Blocks.OAK_LOG, Blocks.OAK_WOOD).put(Blocks.OAK_WOOD, Blocks.OAK_LOG)
            .put(Blocks.SPRUCE_LOG, Blocks.SPRUCE_WOOD).put(Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG)
            .put(Blocks.BIRCH_LOG, Blocks.BIRCH_WOOD).put(Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG)
            .put(Blocks.JUNGLE_LOG, Blocks.JUNGLE_WOOD).put(Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG)
            .put(Blocks.ACACIA_LOG, Blocks.ACACIA_WOOD).put(Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG)
            .put(Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_WOOD).put(Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG)
            .put(Blocks.CRIMSON_STEM, Blocks.CRIMSON_HYPHAE).put(Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM)
            .put(Blocks.WARPED_STEM, Blocks.WARPED_HYPHAE).put(Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM)
            // stripped wooden logs
            .put(Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_WOOD).put(Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_WOOD).put(Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG)
            .put(Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_WOOD).put(Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG)
            .put(Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_WOOD).put(Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG)
            .put(Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_WOOD).put(Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG)
            .put(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_WOOD).put(Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG)
            .put(Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_HYPHAE).put(Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM)
            .put(Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_HYPHAE).put(Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM)
            // glass
            .put(Blocks.GLASS, Blocks.GLASS_PANE).put(Blocks.GLASS_PANE, Blocks.GLASS)
            .put(Blocks.WHITE_STAINED_GLASS, Blocks.WHITE_STAINED_GLASS_PANE).put(Blocks.WHITE_STAINED_GLASS_PANE, Blocks.WHITE_STAINED_GLASS)
            .put(Blocks.ORANGE_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS_PANE).put(Blocks.ORANGE_STAINED_GLASS_PANE, Blocks.ORANGE_STAINED_GLASS)
            .put(Blocks.MAGENTA_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS_PANE).put(Blocks.MAGENTA_STAINED_GLASS_PANE, Blocks.MAGENTA_STAINED_GLASS)
            .put(Blocks.LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).put(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, Blocks.LIGHT_BLUE_STAINED_GLASS)
            .put(Blocks.YELLOW_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS_PANE).put(Blocks.YELLOW_STAINED_GLASS_PANE, Blocks.YELLOW_STAINED_GLASS)
            .put(Blocks.LIME_STAINED_GLASS, Blocks.LIME_STAINED_GLASS_PANE).put(Blocks.LIME_STAINED_GLASS_PANE, Blocks.LIME_STAINED_GLASS)
            .put(Blocks.PINK_STAINED_GLASS, Blocks.PINK_STAINED_GLASS_PANE).put(Blocks.PINK_STAINED_GLASS_PANE, Blocks.PINK_STAINED_GLASS)
            .put(Blocks.GRAY_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS_PANE).put(Blocks.GRAY_STAINED_GLASS_PANE, Blocks.GRAY_STAINED_GLASS)
            .put(Blocks.LIGHT_GRAY_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).put(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, Blocks.LIGHT_GRAY_STAINED_GLASS)
            .put(Blocks.CYAN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS_PANE).put(Blocks.CYAN_STAINED_GLASS_PANE, Blocks.CYAN_STAINED_GLASS)
            .put(Blocks.PURPLE_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS_PANE).put(Blocks.PURPLE_STAINED_GLASS_PANE, Blocks.PURPLE_STAINED_GLASS)
            .put(Blocks.BLUE_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS_PANE).put(Blocks.BLUE_STAINED_GLASS_PANE, Blocks.BLUE_STAINED_GLASS)
            .put(Blocks.BROWN_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS_PANE).put(Blocks.BROWN_STAINED_GLASS_PANE, Blocks.BROWN_STAINED_GLASS)
            .put(Blocks.GREEN_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS_PANE).put(Blocks.GREEN_STAINED_GLASS_PANE, Blocks.GREEN_STAINED_GLASS)
            .put(Blocks.RED_STAINED_GLASS, Blocks.RED_STAINED_GLASS_PANE).put(Blocks.RED_STAINED_GLASS_PANE, Blocks.RED_STAINED_GLASS)
            .put(Blocks.BLACK_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS_PANE).put(Blocks.BLACK_STAINED_GLASS_PANE, Blocks.BLACK_STAINED_GLASS)
            .build();
    }
}