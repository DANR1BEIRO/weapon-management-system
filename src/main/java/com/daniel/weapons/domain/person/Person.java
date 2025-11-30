package com.daniel.weapons.domain.person;

import com.daniel.weapons.domain.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Weapon> weapons;

    public Person(String name) {
        this.name = name;
        this.weapons = new ArrayList<>();
    }

    public Person(String name, List<Weapon> weapons) {
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

    public List<Weapon> getWeapons() {
        return weapons;
    }
}
