package com.daniel.weapons.domain.ammo;

public enum Ammo {
    RIFLE_AMMO(WeaponType.RIFLE, 30),
    PISTOL_AMMO(WeaponType.PISTOL, 12),
    ARROW(WeaponType.BOW, 10);

    private final WeaponType weaponType;
    private final int ammoCapacity;

    Ammo(WeaponType weaponType, int ammoCapacity) {
        this.weaponType = weaponType;
        this.ammoCapacity = ammoCapacity;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }
}
