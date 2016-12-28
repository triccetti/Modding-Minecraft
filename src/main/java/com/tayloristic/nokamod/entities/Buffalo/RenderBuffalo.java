package com.tayloristic.nokamod.entities.Buffalo;

import javax.annotation.Nonnull;

import com.tayloristic.nokamod.Refrence;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;


public class RenderBuffalo  extends RenderLiving<EntityBuffalo> {
	private static final ResourceLocation BUFFALO_TEXTURE = new ResourceLocation(Refrence.MOD_ID + ":textures/entities/buffalo.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderBuffalo(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelBuffalo(), 0.5F);
	}

	@Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityBuffalo entity) {
        return BUFFALO_TEXTURE;
    }
		
	public static class Factory implements IRenderFactory<EntityBuffalo> {

	    @Override
	    public Render<? super EntityBuffalo> createRenderFor(RenderManager manager) {
	        return new RenderBuffalo(manager);
	    }

    }
}
