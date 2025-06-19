package com.simple_mc_modding05.wasteland.item;

import com.simple_mc_modding05.wasteland.TheWasteland;
import com.simple_mc_modding05.wasteland.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheWasteland.MOD_ID);


    public static final RegistryObject<CreativeModeTab> WASTELAND = CREATIVE_MODE_TABS.register("wasteland",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METEOR_GEM.get()))
                    .title(Component.translatable("creativetab.wasteland"))
                    .displayItems((itemDisplayParameters, output) -> {


                        output.accept(ModItems.METEOR_GEM.get());
                        output.accept(ModItems.BLUE_METEOR_GEM.get());

                        output.accept(ModBlocks.METEOR_GEM_BLOCK.get());
                        output.accept(ModBlocks.BLUE_METEOR_GEM_BLOCK.get());

                        output.accept(ModBlocks.METEORITE.get());
                        output.accept(ModBlocks.HOT_METEORITE.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
