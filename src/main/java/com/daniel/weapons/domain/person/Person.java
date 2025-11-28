package com.daniel.weapons.domain.person;

import com.daniel.weapons.domain.weapon.Weapon;

import java.util.List;

public class Person<T extends Weapon> {
    private String name;
    private List<T> weapons;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<T> weapons) {
        this.name = name;
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weapons=" + weapons +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<T> getWeapons() {
        return weapons;
    }
}
