package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.magazine.Magazine;

public class Pistol extends Weapon implements Reloadable{

    @Override
    public void reload() {

    }

    @Override
    public void Shoot() {

    }

    public Pistol(String name, Ammo ammo, Magazine magazine) {
        super(name, ammo, magazine);
    }
}
