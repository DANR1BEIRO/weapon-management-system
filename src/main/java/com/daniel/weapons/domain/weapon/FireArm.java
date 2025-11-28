package com.daniel.weapons.domain.weapon;

import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.AmmoContainer;

/**
 * Esta classe depende da interface AmmoContainer em vez da implementação concreta Magazine.
 * Isso aplica dois princípios SOLID importantes:
 * <p>
 * - DIP (Dependency Inversion Principle):
 * FireArm é um módulo de alto nível e não deve depender de classes concretas como Magazine.
 * Ao depender da abstração AmmoContainer, qualquer tipo de container de munição pode ser usado
 * <p>
 * - ISP (Interface Segregation Principle):
 * AmmoContainer é uma interface pequena e específica, expondo apenas o que FireArm realmente precisa:
 * obter munição, aumentar/diminuir munição e verificar o tipo de munição.
 */

public abstract class FireArm extends Weapon implements Shootable, Reloadable {
    private AmmoContainer magazine;

    public FireArm(WeaponType weaponType, String name, AmmoContainer magazine) {
        super(weaponType, name);
        this.magazine = magazine;
    }

    @Override
    public String toString() {
        return "FireArm{" +
                "weaponType=" + getWeaponType() +
                ", name='" + getName() + '\'' +
                ", " + magazine +
                '}';
    }

    @Override
    public void shoot() {
        if (magazine.getAmmunition() <= 0) {
            System.out.println(getName() + ": sem munição!");
            return;
        }

        System.out.println(getName() + " disparando");
        magazine.decreaseAmmo();
    }

    @Override
    public void reload(int increaseAmmo) {
        if (magazine.getAmmo().getWeaponType() != getWeaponType()) {
            System.out.println("Não é possível carregar: Munição incompatível");
            return;
        }
        System.out.println("Carregando " + getName() + "...");
        magazine.increaseAmmo(increaseAmmo);
    }
}
