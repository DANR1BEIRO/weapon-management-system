package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.Magazine;

public class Rifle extends FireArm {
    public Rifle(WeaponType weaponType, String name, Magazine magazine) {
        super(weaponType, name, magazine);
    }

    @Override
    public void Shoot() {
        super.Shoot();
    }

    @Override
    public void reload() {
        System.out.println("rifle reloading");
    }
}
