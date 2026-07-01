package net.minjajo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minjajo.item.ModItems;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture, @Nullable BlockTagsProvider blockTagsProvider) {
        super(output, registryLookupFuture, blockTagsProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        builder(ItemTags.SWORDS).add(ModItems.VIBRANITE_SWORD.builtInRegistryHolder().key());
        builder(ItemTags.AXES).add(ModItems.VIBRANITE_AXE.builtInRegistryHolder().key());
        builder(ItemTags.PICKAXES).add(ModItems.VIBRANITE_PICKAXE.builtInRegistryHolder().key());
        builder(ItemTags.SHOVELS).add(ModItems.VIBRANITE_SHOVEL.builtInRegistryHolder().key());
        builder(ItemTags.HOES).add(ModItems.VIBRANITE_HOE.builtInRegistryHolder().key());
        builder(ItemTags.SPEARS).add(ModItems.VIBRANITE_SPEAR.builtInRegistryHolder().key());
    }
}
