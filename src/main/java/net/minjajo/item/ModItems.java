package net.minjajo.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minjajo.Vibranite;

import java.util.function.Function;

public class ModItems {

    public static final Item VIBRANITE = registerItem("vibranite", Item::new);
    public static final Item RAW_VIBRANITE = registerItem("raw_vibranite", Item::new);


    public static final Item VIBRANITE_SWORD = registerItem("vibranite_sword",
            properties -> new Item(properties.sword(ModToolMaterials.VIBRANITE, 3, -2.4F)));
    public static final Item VIBRANITE_PICKAXE = registerItem("vibranite_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.VIBRANITE, 1, -2.8F)));
    public static final Item VIBRANITE_SHOVEL = registerItem("vibranite_shovel",
            properties -> new ShovelItem(ModToolMaterials.VIBRANITE, 3, -2.4F, properties));
    public static final Item VIBRANITE_AXE = registerItem("vibranite_axe",
            properties -> new AxeItem(ModToolMaterials.VIBRANITE, 6, -3.2F, properties));
    public static final Item VIBRANITE_HOE = registerItem("vibranite_hoe",
            properties -> new HoeItem(ModToolMaterials.VIBRANITE, 0f, -3.0f, properties));
    public static final Item VIBRANITE_SPEAR = registerItem("vibranite_spear",
            properties -> new Item(properties.spear(ToolMaterial.NETHERITE, 1.15F, 1.2F, 0.4F, 2.5F, 9.0F, 5.5F, 5.1F, 8.75F, 4.6F)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey
                        .create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name)))));
    }


    public static void registerModItems(){
        Vibranite.LOGGER.info("Registering Mod Items for " + Vibranite.MOD_ID);

    }

}
