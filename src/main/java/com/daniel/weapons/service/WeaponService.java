package com.daniel.weapons.service;

import com.daniel.weapons.domain.weapon.*;
import com.daniel.weapons.exception.IncompatibleAmmoException;

public final class WeaponService {

    private WeaponService() {
        throw new AssertionError("Não é possível instanciar " + getClass().getSimpleName());
    }

    public static void performShoot(Weapon weapon) {
        if (weapon instanceof Shootable s) {
            s.shoot();
        } else {
            throw new IncompatibleAmmoException("A arma " + weapon + " não pode efetuar disparos.");
        }
    }

    public static void performShoot(Weapon weapon, int quantity) {
        System.out.println("Sequência de " + quantity + " disparos...");
        for (int i = 0; i < quantity; i++) {
            performShoot(weapon);
        }
    }

    public static void performReload(Weapon weapon, int amount) {
        if (weapon instanceof FireArm r) {
            r.reload(amount);
        } else {
            throw new IncompatibleAmmoException("A arma " + weapon + " não é recarregável.");
        }
    }

    public static void performStore(Weapon weapon) {
        if (weapon instanceof Storable s) {
            s.storeWeapon();
        }
    }
}
