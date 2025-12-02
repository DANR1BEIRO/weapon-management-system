package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.AmmoContainer;
import com.daniel.weapons.exception.OutOfAmmoException;

public class Bow extends Weapon implements Shootable {

    private AmmoContainer quiver;

    public Bow(WeaponType weaponType, String name, AmmoContainer quiver) {
        super(weaponType, name);
        this.quiver = quiver;
    }

    @Override
    public void shoot() {
        if (quiver.getAmmunition() > 0) {
            System.out.println(getName() + " dispara uma flecha!");
            quiver.decreaseAmmo();
        } else {
            throw new OutOfAmmoException(getName());
        }
    }

    @Override
    public void storeWeapon() {
        if (storedWeapon) {
            System.out.println(getName() + " já está guardado.");
        } else {
            System.out.println(getName() + " guardando nas costas junto com a aljava.");
            storedWeapon = true;
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
