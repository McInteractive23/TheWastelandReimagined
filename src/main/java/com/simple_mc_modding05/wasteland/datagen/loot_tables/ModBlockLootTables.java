package com.simple_mc_modding05.wasteland.datagen.loot_tables;

import com.simple_mc_modding05.wasteland.block.ModBlocks;
import com.simple_mc_modding05.wasteland.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.METEOR_GEM_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_METEOR_GEM_BLOCK.get());

        this.add(ModBlocks.METEORITE.get(),
                block -> createSingleItemTableWithSilkTouch(ModBlocks.METEORITE.get(), ModItems.METEOR_GEM.get()));
        this.add(ModBlocks.HOT_METEORITE.get(),
                block -> createSingleItemTableWithSilkTouch(ModBlocks.HOT_METEORITE.get(), ModItems.BLUE_METEOR_GEM.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
