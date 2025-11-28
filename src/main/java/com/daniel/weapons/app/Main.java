package com.daniel.weapons.app;

import com.daniel.weapons.domain.ammo.Ammo;
import com.daniel.weapons.domain.ammo.WeaponType;
import com.daniel.weapons.domain.magazine.Magazine;
import com.daniel.weapons.domain.person.Person;
import com.daniel.weapons.domain.weapon.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Weapon> larasWeapons = new ArrayList<>(
                List.of(new Rifle(WeaponType.RIFLE, "762", new Magazine(Ammo.RIFLE_AMMO)),
                        new Pistol(WeaponType.PISTOL, "desert eagle", new Magazine(Ammo.PISTOL_AMMO))));

        Person<Weapon> lara = new Person<>("Lara croft", larasWeapons);
        System.out.println(larasWeapons);
        for (Weapon larasWeapon : larasWeapons) {
            larasWeapon.storeWeapon();
            if (larasWeapon instanceof Reloadable s) {
                s.reload(20);


            }
        }
    }
}
