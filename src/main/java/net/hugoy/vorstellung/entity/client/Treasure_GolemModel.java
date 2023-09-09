package net.hugoy.vorstellung.entity.client;

import net.hugoy.vorstellung.Vorstellung;
import net.hugoy.vorstellung.entity.custom.Treasure_GolemEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class Treasure_GolemModel extends GeoModel<Treasure_GolemEntity> {
    @Override
    public Identifier getModelResource(Treasure_GolemEntity animatable) {
        return new Identifier(Vorstellung.MOD_ID, "geo/treasure_golem.geo.json");
    }

    @Override
    public Identifier getTextureResource(Treasure_GolemEntity animatable) {
        return new Identifier(Vorstellung.MOD_ID, "textures/entity/treasure_golem.png");
    }

    @Override
    public Identifier getAnimationResource(Treasure_GolemEntity animatable) {
        return new Identifier(Vorstellung.MOD_ID, "animations/treasure_golem.animation.json");
    }

    @Override
    public void setCustomAnimations(Treasure_GolemEntity animatable, long instanceId, AnimationState<Treasure_GolemEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}