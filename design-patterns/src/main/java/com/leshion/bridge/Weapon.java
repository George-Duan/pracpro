package com.leshion.bridge;

public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
