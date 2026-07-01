package net.minjajo.world;

import net.minecraft.data.worldgen.BootstrapContext;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minjajo.Vibranite;
import net.minjajo.block.ModBlocks;
import java.util.List;

public class ModConfiguredFeatures {

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){
        TagMatchTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        TagMatchTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldTargets = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.VIBRANITE_ORE.defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.VIBRANITE_DEEPSLATE_ORE.defaultBlockState())
        );

        context.register(ModWorldKeys.CUSTOM_ORE_CONFIGURED, new ConfiguredFeature<>(
                Feature.ORE,
                new OreConfiguration(overworldTargets, 2)
        ));

    }

}

