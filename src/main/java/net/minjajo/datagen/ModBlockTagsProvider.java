package net.minjajo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minjajo.block.ModBlocks;
import net.minjajo.world.ModTags;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.VIBRANITE_BLOCK.builtInRegistryHolder().key())
                .add(ModBlocks.RAW_VIBRANITE_BLOCK.builtInRegistryHolder().key())
                .add(ModBlocks.VIBRANITE_ORE.builtInRegistryHolder().key())
                .add(ModBlocks.VIBRANITE_DEEPSLATE_ORE.builtInRegistryHolder().key());

        builder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.VIBRANITE_ORE.builtInRegistryHolder().key())
                .add(ModBlocks.VIBRANITE_DEEPSLATE_ORE.builtInRegistryHolder().key());





    }
}