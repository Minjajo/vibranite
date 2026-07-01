package net.minjajo.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minjajo.Vibranite;
import net.minecraft.resources.ResourceKey;


public class ModWorldKeys{
    public static final ResourceKey<ConfiguredFeature<?, ?>> CUSTOM_ORE_CONFIGURED = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, "custom_ore")
    );

    public static final ResourceKey<PlacedFeature> CUSTOM_ORE_PLACED = ResourceKey.create(
            Registries.PLACED_FEATURE,
            Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, "custom_ore")
    );

}