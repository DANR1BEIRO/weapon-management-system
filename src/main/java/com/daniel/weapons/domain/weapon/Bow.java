package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;

public class Bow extends Weapon implements Shootable {

    public Bow(WeaponType weaponType, String name, Ammo ammo) {
        super(weaponType, name);
    }

    @Override
    public void shoot() {

        System.out.println("throwing a arrow");
    }

    @Override
    public void storeWeapon() {
        if (storedWeapon) {
            System.out.println(getName() + " já está guardada.");
            return;
        }
        System.out.println(getClass().getSimpleName() + " " + getName() + " pendurado no ombro.");
        storedWeapon = true;
    }
}
