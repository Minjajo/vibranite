package net.minjajo;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minjajo.datagen.ModBlockLootTableProvider;
import net.minjajo.datagen.ModBlockTagsProvider;
import net.minjajo.datagen.ModModelProvider;
import net.minjajo.datagen.ModRecipeProvider;
import net.minjajo.world.ModConfiguredFeatures;
import net.minjajo.world.ModPlacedFeatures;

public class VibraniteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);

		pack.addProvider((output, registriesFuture) -> new FabricDynamicRegistryProvider(output, registriesFuture) {
			@Override
			protected void configure(HolderLookup.Provider registries, Entries entries) {
				entries.addAll(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE));
				entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
			}

			@Override
			public String getName() {
				return "Worldgen Datagen";
			}
		});



	}

	// ADD THIS METHOD HERE:
	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		// This hooks up your custom feature bootstrap methods to the generator
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
