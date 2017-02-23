package com.tayloristic.nokamod.entities.Buffalo;

import com.tayloristic.nokamod.Refrence;
import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityBuffalo extends EntityAnimal {
	public static final ResourceLocation BUFFALO_TEXTURE = new ResourceLocation(Refrence.MOD_ID + ":textures/entities/buffalo.png");

	public EntityBuffalo(World worldIn) {
		super(worldIn);
		setSize(0.9F, 1.3F);
	}
	
	 @Override
	 protected void entityInit() {
		 super.entityInit();
	 }

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.spinach, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));	
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return stack == null ? false : stack.getItem() == ModItems.spinach;
	}
	
	@Override 
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SHEEP_AMBIENT;
	}

	protected SoundEvent getHurtSound() {
		return SoundEvents.ENTITY_SHEEP_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SHEEP_DEATH;
	}

	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
	}

	protected float getSoundVolume() {
		return 0.4F;
	}
	
	@Override
	public EntityBuffalo createChild(EntityAgeable ageable) {
        return new EntityBuffalo(this.world);
    }

	@Override
	protected ResourceLocation getLootTable() {
		return BUFFALO_TEXTURE;
	}
	
	@Override
	public float getEyeHeight() {
		return this.isChild() ? this.height : 0.2F;
	}

}
