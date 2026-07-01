package net.minjajo.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minjajo.Vibranite;

public class ModTags {

    public static class Blocks{

        public static final TagKey<Block> NEEDS_VIBRANITE_TOOL = createTag("needs_vibranite_tool");
        public static final TagKey<Block> INCORRECT_FOR_VIBRANITE_TOOL = createTag("incorrect_for_vibranite_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name));
        }
    }

    public static class Items{

        public static final TagKey<Item> VIBRANITE_REPAIRABLES = createTag("vibranite_repairables");

        private static TagKey<Item> createTag(String name){
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name));
        }
    }


}
