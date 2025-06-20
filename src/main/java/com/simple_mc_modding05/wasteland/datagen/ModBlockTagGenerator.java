package com.simple_mc_modding05.wasteland.datagen;

import com.simple_mc_modding05.wasteland.TheWasteland;
import com.simple_mc_modding05.wasteland.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheWasteland.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.METEOR_GEM_BLOCK.get())
                .add(ModBlocks.BLUE_METEOR_GEM_BLOCK.get())
                .add(ModBlocks.METEORITE.get())
                .add(ModBlocks.HOT_METEORITE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.METEOR_GEM_BLOCK.get())
                .add(ModBlocks.BLUE_METEOR_GEM_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.METEORITE.get())
                .add(ModBlocks.HOT_METEORITE.get());


    }
}
