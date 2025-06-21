package com.simple_mc_modding05.wasteland.fluid;

import com.simple_mc_modding05.wasteland.TheWasteland;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flowing");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation(TheWasteland.MOD_ID, "misc/in_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TheWasteland.MOD_ID);

    public static final RegistryObject<FluidType> TOXIC_WATER_FLUID_TYPE = register("toxic_water_fluid",
            FluidType.Properties.create().density(1000).viscosity(1000).motionScale(0.014D).canConvertToSource(false).canHydrate(false).supportsBoating(false).sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1E038D0, new Vector3f(224f / 225f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}
