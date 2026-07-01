package net.minjajo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minjajo.block.ModBlocks;
import net.minjajo.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> VIBRANITE_SMELTABLES = List.of(ModItems.RAW_VIBRANITE, ModBlocks.VIBRANITE_ORE,
                        ModBlocks.VIBRANITE_DEEPSLATE_ORE);

                this.oreSmelting(VIBRANITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.VIBRANITE, 0.25f, 150, "vibranite");
                this.oreBlasting(VIBRANITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.VIBRANITE, 0.5f, 100, "vibranite");

                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.VIBRANITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANITE_BLOCK);

                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_VIBRANITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_VIBRANITE_BLOCK);



                shaped(RecipeCategory.COMBAT, ModItems.VIBRANITE_SWORD)
                        .pattern("A")
                        .pattern("A")
                        .pattern("B")
                        .define('A', ModItems.VIBRANITE)
                        .define( 'B', Items.STICK)
                        .unlockedBy(getHasName(ModItems.VIBRANITE), has(ModItems.VIBRANITE))
                        .group("vibranite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VIBRANITE_PICKAXE)
                        .pattern("AAA")
                        .pattern(" B ")
                        .pattern(" B ")
                        .define('A', ModItems.VIBRANITE)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(ModItems.VIBRANITE), has(ModItems.VIBRANITE))
                        .group("vibranite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VIBRANITE_SHOVEL)
                        .pattern("A")
                        .pattern("B")
                        .pattern("B")
                        .define('A', ModItems.VIBRANITE)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(ModItems.VIBRANITE), has(ModItems.VIBRANITE))
                        .group("vibranite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VIBRANITE_AXE)
                        .pattern("AA")
                        .pattern("AB")
                        .pattern(" B")
                        .define('A', ModItems.VIBRANITE)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(ModItems.VIBRANITE), has(ModItems.VIBRANITE))
                        .group("vibranite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.VIBRANITE_HOE)
                        .pattern("AA")
                        .pattern(" B")
                        .pattern(" B")
                        .define('A', ModItems.VIBRANITE)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(ModItems.VIBRANITE), has(ModItems.VIBRANITE))
                        .group("vibranite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.VIBRANITE_SPEAR)
                        .pattern("  A")
                        .pattern(" B ")
                        .pattern("B  ")
                        .define('A', ModItems.VIBRANITE)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(ModItems.VIBRANITE), has(ModItems.VIBRANITE))
                        .group("vibranite")
                        .save(output);

            }
        };
    }

    @Override
    public String getName() {
        return "Vibranite Recipes";
    }
}
