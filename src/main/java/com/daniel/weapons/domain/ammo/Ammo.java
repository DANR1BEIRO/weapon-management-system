package com.daniel.weapons.domain.ammo;

public enum Ammo {
    RIFLE_AMMO(WeaponType.RIFLE),
    PISTOL_AMMO(WeaponType.PISTOL),
    ARROW(WeaponType.BOW);

    private final WeaponType weaponType;

    Ammo(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
