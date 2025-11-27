package com.daniel.weapons.domain.person;

import com.daniel.weapons.domain.weapon.Weapon;

import java.util.List;

public class Person {
    private String name;
    private List<? extends Weapon> weapons;

    public Person(String name) {
        this.name = name;
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

    public List<? extends Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<? extends Weapon> weapons) {
        this.weapons = weapons;
    }
}
