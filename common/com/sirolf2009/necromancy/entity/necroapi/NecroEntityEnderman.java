package com.sirolf2009.necromancy.entity.necroapi;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;

import com.sirolf2009.necroapi.BodyPart;
import com.sirolf2009.necroapi.NecroEntityBase;
import com.sirolf2009.necromancy.client.model.ModelMinion;
import com.sirolf2009.necromancy.item.ItemBodyPart;

public class NecroEntityEnderman extends NecroEntityBase {

    public NecroEntityEnderman() {
        super("ENDERMAN");
        headItem = ItemBodyPart.getItemStackFromName("Enderman Head", 1);
        torsoItem = ItemBodyPart.getItemStackFromName("Enderman Torso", 1);
        armItem = ItemBodyPart.getItemStackFromName("Enderman Arm", 1);
        legItem = ItemBodyPart.getItemStackFromName("Enderman Legs", 1);
        texture = "/mob/enderman.png";
    }

    @Override
    public BodyPart[] initHead(ModelMinion model) {
        BodyPart head = new BodyPart(this, model, 0, 0);
        head.addBox(-4, -7, -4, 8, 8, 8, 0.0F);
        head.setTextureSize(textureWidth, textureHeight);
        BodyPart bipedHeadwear = new BodyPart(this, model, 0, 16);
        bipedHeadwear.addBox(-4.0F, -3.0F, -4.0F, 8, 8, 8, -0.5F);
        return new BodyPart[] { head, bipedHeadwear };
    }

    @Override
    public BodyPart[] initTorso(ModelMinion model) {
        float[] headPos = { 4.0F, -4.0F, 2.0F };
        float[] armLeftPos = { -4F, 0.0F, 2.0F };
        float[] armRightPos = { 8F, 0.0F, 2.0F };
        BodyPart torso = new BodyPart(this, armLeftPos, armRightPos, headPos, model, 32, 16);
        torso.addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 0.0f);
        return new BodyPart[] { torso };
    }

    @Override
    public BodyPart[] initLegs(ModelMinion model) {
        float[] torsoPos = { -4F, -18F, 0F };
        BodyPart legRight = new BodyPart(this, torsoPos, model, 56, 0);
        legRight.addBox(-1.0F, -4.0F, 1.0F, 2, 30, 2, 0.0F);
        legRight.setRotationPoint(-2.0F, -2.0F, 0.0F);
        BodyPart legLeft = new BodyPart(this, torsoPos, model, 56, 0);
        legLeft.mirror = true;
        legLeft.addBox(-1.0F, -4.0F, 1.0F, 2, 30, 2, 0.0F);
        legLeft.setRotationPoint(2.0F, -2.0F, 0.0F);
        return new BodyPart[] { legLeft, legRight };
    }

    @Override
    public BodyPart[] initArmLeft(ModelMinion model) {
        BodyPart bipedLeftArm = new BodyPart(this, model, 56, 0);
        bipedLeftArm.mirror = true;
        bipedLeftArm.addBox(0.0F, 0.0F, 0.0F, 2, 30, 2, 0.0F);
        return new BodyPart[] { bipedLeftArm };
    }

    @Override
    public BodyPart[] initArmRight(ModelMinion model) {
        BodyPart bipedRightArm = new BodyPart(this, model, 56, 0);
        bipedRightArm.addBox(0.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F);
        return new BodyPart[] { bipedRightArm };
    }

    @Override
    public void initRecipes() {
        headRecipe = new Object[] { "SSSS", "SBFS", "SEES", 'S', new ItemStack(organs, 1, 4), // skin
        'E', Item.spiderEye, 'F', Item.rottenFlesh, 'B', new ItemStack(organs, 1, 0) }; // brains
        torsoRecipe = new Object[] { " LL ", "BHUB", "LEEL", "BLLB", 'L', new ItemStack(organs, 1, 4), // skin
        'E', Item.rottenFlesh, 'H', new ItemStack(organs, 1, 1), // heart
        'U', new ItemStack(organs, 1, 3), // lungs
        'B', Item.bone };
        armRecipe = new Object[] { "LLLL", "BMEB", "LLLL", 'L', new ItemStack(organs, 1, 4), // skin
        'E', Item.rottenFlesh, 'M', new ItemStack(organs, 1, 2), // muscle
        'B', Item.bone };
        legRecipe = new Object[] { "LBBL", "LMML", "LEEL", "LBBL", 'L', new ItemStack(organs, 1, 4), // skin
        'E', Item.rottenFlesh, 'M', new ItemStack(organs, 1, 2), // muscle
        'B', Item.bone };
    }

    @Override
    public void preRender(Entity entity, BodyPart[] parts, String location, ModelMinion model) {
        GL11.glTranslatef(0, 10, 0);
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity, BodyPart[] part, String location) {
    }
}
