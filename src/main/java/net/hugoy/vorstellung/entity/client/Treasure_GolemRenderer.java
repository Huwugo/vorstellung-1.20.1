package net.hugoy.vorstellung.entity.client;

import net.hugoy.vorstellung.Vorstellung;
import net.hugoy.vorstellung.entity.custom.Treasure_GolemEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class Treasure_GolemRenderer extends GeoEntityRenderer<Treasure_GolemEntity> {
    public Treasure_GolemRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new Treasure_GolemModel());
    }

    @Override
    public Identifier getTextureLocation(Treasure_GolemEntity animatable) {
        return new Identifier(Vorstellung.MOD_ID, "textures/entity/treasure_golem.png");
    }

    @Override
    public void render(Treasure_GolemEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
