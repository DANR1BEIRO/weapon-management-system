package com.daniel.weapons.domain.magazine;

import com.daniel.weapons.domain.ammo.Ammo;

public interface AmmoContainer {

    int getAmmunition();
    void decreaseAmmo();
    void increaseAmmo(int amount);
    Ammo getAmmo();
}
