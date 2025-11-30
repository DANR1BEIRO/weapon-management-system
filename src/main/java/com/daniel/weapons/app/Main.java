package com.daniel.weapons.app;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.AmmoContainer;
import com.daniel.weapons.domain.magazine.Magazine;
import com.daniel.weapons.domain.person.Person;
import com.daniel.weapons.domain.weapon.*;
import com.daniel.weapons.service.WeaponService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person lara = new Person("Lara croft",
                new ArrayList<>(List.of(
                        new Rifle(WeaponType.RIFLE, "762", new Magazine(Ammo.RIFLE_AMMO)),
                        new Pistol(WeaponType.PISTOL, "desert eagle", new Magazine(Ammo.PISTOL_AMMO)),
                        new Bow(WeaponType.BOW, "Arco da Lara", new Magazine(Ammo.ARROW)))));

        for (Weapon weapon : lara.getWeapons()) {
            WeaponService.performShoot(weapon, 10);
        }
    }
}
