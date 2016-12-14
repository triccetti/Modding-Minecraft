package com.tayloristic.nokamod.entities.Goat;

import javax.annotation.Nonnull;

import com.tayloristic.nokamod.Refrence;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;


public class RenderGoat  extends RenderLiving<EntityGoat> {
	private static final ResourceLocation GOAT_TEXTURE = new ResourceLocation(Refrence.MOD_ID + ":textures/entities/goat.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderGoat(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelGoat(), 0.5F);
	}

	@Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityGoat entity) {
        return GOAT_TEXTURE;
    }
		
	public static class Factory implements IRenderFactory<EntityGoat> {

	    @Override
	    public Render<? super EntityGoat> createRenderFor(RenderManager manager) {
	        return new RenderGoat(manager);
	    }

    }
}
