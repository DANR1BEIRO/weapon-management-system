package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;

public abstract class Weapon {
    WeaponType weaponType;
    String name;

    public Weapon() {
    }

    public Weapon(WeaponType weaponType, String name) {
        this.weaponType = weaponType;
        this.name = name;

    }

    public Weapon(String name, Ammo ammo) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
