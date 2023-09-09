package net.hugoy.vorstellung.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.hugoy.vorstellung.Vorstellung;
import net.hugoy.vorstellung.entity.custom.Treasure_GolemEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<Treasure_GolemEntity> TREASURE_GOLEM = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Vorstellung.MOD_ID, "treasure_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, Treasure_GolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1.4f)).build());
}
