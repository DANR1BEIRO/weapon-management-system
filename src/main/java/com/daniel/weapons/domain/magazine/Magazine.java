package com.daniel.weapons.domain.magazine;


import com.daniel.weapons.domain.ammo.Ammo;

public class Magazine {
    private Ammo ammo;
    private int ammunition;

    public Magazine(Ammo ammo) {
        this.ammo = ammo;
        if (this.ammo == Ammo.PISTOL_AMMO) {
            this.ammunition = 12;

        } else if (this.ammo == Ammo.RIFLE_AMMO) {
            this.ammunition = 30;
        } else {
            ammunition = 10;
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

    @Override
    public String toString() {
        return "Magazine{" +
                "ammo=" + ammo +
                ", ammunition=" + ammunition +
                '}';
    }

    public void decreseAmmo() {
        if (this.ammunition > 0) {
            this.ammunition--;
        }
    }
}
