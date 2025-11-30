package com.daniel.weapons.service;

import com.daniel.weapons.domain.weapon.*;

public final class WeaponService {

    private WeaponService() {
        throw new AssertionError("Não é possível instanciar " + getClass().getSimpleName());
    }

    public static void performShoot(Weapon weapon) {
        if (weapon instanceof Shootable s) {
            s.shoot();
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
        }
    }

    public static void performStore(Weapon weapon) {
        if (weapon instanceof Storable s) {
            s.storeWeapon();
        }
    }


}
