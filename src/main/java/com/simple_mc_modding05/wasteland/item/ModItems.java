package com.simple_mc_modding05.wasteland.item;

import com.simple_mc_modding05.wasteland.TheWasteland;
import com.simple_mc_modding05.wasteland.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheWasteland.MOD_ID);

    public static final RegistryObject<Item> METEOR_GEM = ITEMS.register("meteor_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_METEOR_GEM = ITEMS.register("blue_meteor_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOXIC_WATER_BUCKET = ITEMS.register("toxic_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_TOXIC_WATER ,new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
