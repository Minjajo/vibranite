package net.minjajo.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minjajo.Vibranite;

import java.util.function.Function;

public class ModItems {

    public static final Item VIBRANITE = registerItem("vibranite", Item::new);
    public static final Item RAW_VIBRANITE = registerItem("raw_vibranite", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey
                        .create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vibranite.MOD_ID, name)))));
    }


    public static void registerModItems(){
        Vibranite.LOGGER.info("Registering Mod Items for " + Vibranite.MOD_ID);

    }

}
