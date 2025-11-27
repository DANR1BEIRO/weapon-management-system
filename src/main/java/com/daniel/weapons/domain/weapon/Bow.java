package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;

public class Bow extends Weapon implements Shootable{

    public Bow() {
    }

    public Bow(WeaponType weaponType, String name, Ammo ammo) {
        super(weaponType, name);
    }

    public Bow(String name, Ammo ammo) {
        super(name, ammo);
    }

    @Override
    public void Shoot() {

        System.out.println("throwing a arrow");
    }
}
