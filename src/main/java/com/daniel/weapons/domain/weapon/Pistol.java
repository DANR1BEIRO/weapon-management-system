package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.AmmoContainer;

public class Pistol extends FireArm {
    public Pistol(WeaponType weaponType, String name, AmmoContainer magazine) {
        super(weaponType, name, magazine);
    }

    @Override
    public void storeWeapon() {
        if (storedWeapon) {
            System.out.println(getName() + " já está guardada.");
            return;
        }
        System.out.println(getClass().getSimpleName() + " " + getName() + " guardada no coldre.");
        storedWeapon = true;
    }

    @Override
    public void shoot() {
        super.shoot();
    }
}




