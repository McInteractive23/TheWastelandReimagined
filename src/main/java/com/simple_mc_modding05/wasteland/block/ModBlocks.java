package com.simple_mc_modding05.wasteland.block;

import com.simple_mc_modding05.wasteland.TheWasteland;
import com.simple_mc_modding05.wasteland.fluid.ModFluids;
import com.simple_mc_modding05.wasteland.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheWasteland.MOD_ID);


    public static final RegistryObject<Block> METEORITE = registerBlock("meteorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> HOT_METEORITE = registerBlock("hot_meteorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> METEOR_GEM_BLOCK = registerBlock("meteor_gem_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> BLUE_METEOR_GEM_BLOCK = registerBlock("blue_meteor_gem_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));


    public static final RegistryObject<LiquidBlock> TOXIC_WATER_BLOCK = BLOCKS.register("toxic_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_TOXIC_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
