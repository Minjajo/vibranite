package net.minjajo.block;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minjajo.Vibranite;

import java.util.function.Function;

public class ModBlocks {


    public static final Block VIBRANITE_BLOCK = registerBlock("vibranite_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops()));

    public static final Block RAW_VIBRANITE_BLOCK = registerBlock("raw_vibranite_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final Block VIBRANITE_ORE = registerBlock("vibranite_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final Block VIBRANITE_DEEPSLATE_ORE = registerBlock("vibranite_deepslate_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM,  Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name)))));
    }


    public static void registerModBlocks(){
        Vibranite.LOGGER.info("Registering Mod Blocks for " + Vibranite.MOD_ID);
    }


}
