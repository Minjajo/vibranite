package net.minjajo.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minjajo.Vibranite;
import net.minjajo.block.ModBlocks;
import net.minjajo.item.ModItems;

public class ModCreativeModeTabs {

    public static final CreativeModeTab VIBRANITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, "vibranite_items"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.VIBRANITE))
                    .title(Component.translatable("creativemodetab.vibranite.vibranite_items"))
                    .displayItems(((parameters, output) -> {
                        output.accept(ModItems.RAW_VIBRANITE);
                        output.accept(ModItems.VIBRANITE);
                        output.accept(ModBlocks.VIBRANITE_BLOCK);
                        output.accept(ModBlocks.RAW_VIBRANITE_BLOCK);
                        output.accept(ModBlocks.VIBRANITE_ORE);
                        output.accept(ModBlocks.VIBRANITE_DEEPSLATE_ORE);
                        output.accept(ModItems.VIBRANITE_AXE);
                        output.accept(ModItems.VIBRANITE_HOE);
                        output.accept(ModItems.VIBRANITE_PICKAXE);
                        output.accept(ModItems.VIBRANITE_SHOVEL);
                        output.accept(ModItems.VIBRANITE_SWORD);
                        output.accept(ModItems.VIBRANITE_SPEAR);
                    }))
                    .build());

    public static void registerModCreativeModeTabs(){
        Vibranite.LOGGER.info("Registering Creative Mode Tabs for " + Vibranite.MOD_ID + "!");
    }
}
