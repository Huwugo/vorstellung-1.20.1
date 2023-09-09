package net.hugoy.vorstellung;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.hugoy.vorstellung.entity.ModEntities;
import net.hugoy.vorstellung.entity.custom.Treasure_GolemEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vorstellung implements ModInitializer {
	public static final String MOD_ID = "vorstellung";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(ModEntities.TREASURE_GOLEM, Treasure_GolemEntity.setAttributes());
	}
}