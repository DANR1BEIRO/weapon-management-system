package com.daniel.weapons.domain.magazine;


import com.daniel.weapons.domain.ammo.Ammo;

public class Magazine implements AmmoContainer {
    private Ammo ammo;
    private int ammunition;
    private int maxCapacity;

    public Magazine(Ammo ammo) {
        this.ammo = ammo;
        if (this.ammo == Ammo.PISTOL_AMMO) {
            this.maxCapacity = 12;

        } else if (this.ammo == Ammo.RIFLE_AMMO) {
            this.maxCapacity = 30;
        } else {
            ammunition = 10;
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "ammo=" + ammo +
                ", ammunition=" + ammunition +
                '}';
    }

    public void decreaseAmmo() {
        if (this.ammunition > 0) {
            this.ammunition--;
        }
    }

    public void increaseAmmo(int amount) {
        if (ammunition + amount > maxCapacity) {
            ammunition = maxCapacity;
        } else {
            ammunition += amount;
        }
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public Ammo getAmmo() {
        return ammo;
    }

    public void setAmmo(Ammo ammo) {
        this.ammo = ammo;
    }
}
