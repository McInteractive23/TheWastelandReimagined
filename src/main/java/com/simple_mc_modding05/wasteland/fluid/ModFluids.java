package com.simple_mc_modding05.wasteland.fluid;

import com.simple_mc_modding05.wasteland.TheWasteland;
import com.simple_mc_modding05.wasteland.block.ModBlocks;
import com.simple_mc_modding05.wasteland.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, TheWasteland.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_TOXIC_WATER = FLUIDS.register("toxic_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.TOXIC_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_TOXIC_WATER = FLUIDS.register("flowing_toxic_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.TOXIC_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties TOXIC_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.TOXIC_WATER_FLUID_TYPE, SOURCE_TOXIC_WATER, FLOWING_TOXIC_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.TOXIC_WATER_BLOCK).bucket(ModItems.TOXIC_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
