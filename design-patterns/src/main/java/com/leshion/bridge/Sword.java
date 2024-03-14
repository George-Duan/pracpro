package com.leshion.bridge;

public class Sword implements Weapon{

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment){
        this.enchantment = enchantment;
    }
    @Override
    public void wield() {

    }

    @Override
    public void swing() {

    }

    @Override
    public void unwield() {

    }

    @Override
    public Enchantment getEnchantment() {
        return null;
    }
}
