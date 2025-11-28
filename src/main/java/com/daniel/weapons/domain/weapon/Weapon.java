package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.WeaponType;

public abstract class Weapon implements Storable {
    private WeaponType weaponType;
    private String name;
    protected boolean storedWeapon = false;

    public Weapon(WeaponType weaponType, String name) {
        this.weaponType = weaponType;
        this.name = name;
    }

    @Override
    public abstract void storeWeapon();

    public String getName() {
        return name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public boolean isStoredWeapon() {
        return storedWeapon;
    }
}

