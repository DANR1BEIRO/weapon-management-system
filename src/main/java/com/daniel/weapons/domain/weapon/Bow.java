package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.AmmoContainer;

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
            System.out.println("Sem flechas na aljava!");
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
}
