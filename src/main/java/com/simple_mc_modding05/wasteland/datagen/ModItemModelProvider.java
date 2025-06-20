package com.simple_mc_modding05.wasteland.datagen;

import com.simple_mc_modding05.wasteland.TheWasteland;
import com.simple_mc_modding05.wasteland.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheWasteland.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        SimpleItem(ModItems.METEOR_GEM);
        SimpleItem(ModItems.BLUE_METEOR_GEM);
    }

    private void SimpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TheWasteland.MOD_ID, "item/" + item.getId().getPath()));
    }

}
