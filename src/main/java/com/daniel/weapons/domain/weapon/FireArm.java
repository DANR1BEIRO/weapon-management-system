package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.Magazine;

public class FireArm extends Weapon implements Shootable, Reloadable {
    private Magazine magazine;

    public FireArm(Magazine magazine) {
        this.magazine = magazine;
    }

    public FireArm(WeaponType weaponType, String name, Magazine magazine) {
        super(weaponType, name);
        this.magazine = magazine;
    }

    @Override
    public String toString() {
        return "FireArm{" +
                "weaponType=" + weaponType +
                ", name='" + name + '\'' +
                ", " + magazine +
                '}';
    }

    @Override
    public void Shoot() {
        if (magazine.getAmmunition() > 0) {
            String className = getClass().getSimpleName();
            System.out.println(className + "'s amount of ammunition: " + magazine.getAmmunition());
            System.out.println(className + " is shooting");
            magazine.decreseAmmo();
            System.out.println("Amount of ammunition: " + magazine.getAmmunition());
        }
    }

    @Override
    public void reload() {

    }
}
