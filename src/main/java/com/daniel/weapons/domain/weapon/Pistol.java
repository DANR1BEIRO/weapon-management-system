package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.Magazine;

public class Pistol extends FireArm {
    public Pistol(WeaponType weaponType, String name, Magazine magazine) {
        super(weaponType, name, magazine);
    }

    @Override
    public void reload() {
        System.out.println("Pistol reloaded");
    }


    @Override
    public void Shoot() {
        super.Shoot();
    }
}

