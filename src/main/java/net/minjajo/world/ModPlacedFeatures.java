package net.minjajo.world;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static void bootstrap(BootstrapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        var configuredFeatureLookup = configuredFeatures.getOrThrow(ModWorldKeys.CUSTOM_ORE_CONFIGURED);

        context.register(ModWorldKeys.CUSTOM_ORE_PLACED, new PlacedFeature(
                configuredFeatureLookup,
                List.of(
                        CountPlacement.of(10),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(32)
                        ),
                        BiomeFilter.biome()
                )
        ));

    }
}
