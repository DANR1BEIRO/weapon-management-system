package com.daniel.weapons.domain.person;

import com.daniel.weapons.domain.weapon.Weapon;

import java.util.Arrays;

public class Person {
    private String name;
    private Weapon[] weapons;

    public Person(String name, Weapon[] weapons) {

        this.name = name;
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weapons=" + Arrays.toString(weapons) +
                '}';
    }

    public String getName() {
        return name;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }
}
