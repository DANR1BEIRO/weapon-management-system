package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.magazine.Magazine;

public abstract class Weapon implements Shootable {
    String name;
    private Ammo ammo;
    private Magazine magazine;

    public Weapon(String name, Ammo ammo, Magazine magazine) {
        this.name = name;
        this.ammo = ammo;
        this.magazine = magazine;
    }

    public String getName() {
        return name;
    }
}
