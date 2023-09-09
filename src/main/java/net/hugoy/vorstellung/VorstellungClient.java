package net.hugoy.vorstellung;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.hugoy.vorstellung.entity.ModEntities;
import net.hugoy.vorstellung.entity.client.Treasure_GolemRenderer;

public class VorstellungClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TREASURE_GOLEM, Treasure_GolemRenderer::new);
    }
}
