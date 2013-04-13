package com.sirolf2009.necromancy.entity;

import com.sirolf2009.necromancy.Necromancy;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityIsaacNormal extends EntityAnimal {

    public EntityIsaacNormal(World par1World) {
        super(par1World);
        texture = Necromancy.rscPath + "/entity/Isaac.png";
    }

    @Override
    public int getMaxHealth() {
        return 10;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

}
