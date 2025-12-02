package com.daniel.weapons.exception;

public class OutOfAmmoException extends WeaponException {
    public OutOfAmmoException(String weaponName) {
        super("A arma " + weaponName + " está sem munição.");
    }
}
