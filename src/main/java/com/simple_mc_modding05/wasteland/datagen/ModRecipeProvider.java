package com.simple_mc_modding05.wasteland.datagen;

import com.simple_mc_modding05.wasteland.block.ModBlocks;
import com.simple_mc_modding05.wasteland.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.METEOR_GEM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.METEOR_GEM.get())
                .unlockedBy(getHasName(ModItems.METEOR_GEM.get()), has(ModItems.METEOR_GEM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.METEOR_GEM.get(), 9)
                .requires(ModBlocks.METEOR_GEM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.METEOR_GEM_BLOCK.get()), has(ModBlocks.METEOR_GEM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_METEOR_GEM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.BLUE_METEOR_GEM.get())
                .unlockedBy(getHasName(ModItems.BLUE_METEOR_GEM.get()), has(ModItems.BLUE_METEOR_GEM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLUE_METEOR_GEM.get(), 9)
                .requires(ModBlocks.BLUE_METEOR_GEM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLUE_METEOR_GEM_BLOCK.get()), has(ModBlocks.BLUE_METEOR_GEM_BLOCK.get()))
                .save(pWriter);

    }
}
