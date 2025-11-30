package com.daniel.weapons.domain.magazine;


import com.daniel.weapons.domain.ammo.Ammo;

public class Magazine implements AmmoContainer {
    private Ammo ammo;
    private int ammunition;
    private int maxCapacity;

    public Magazine(Ammo ammo) {
        this.ammo = ammo;
        this.maxCapacity = ammo.getAmmoCapacity();
        this.ammunition = maxCapacity;
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
        int previousAmmo = ammunition;
        this.ammunition = Math.min(ammunition + amount, maxCapacity);
        int loaded = this.ammunition - previousAmmo;

        System.out.println("Carga solicitada: " + amount +
                "\nRecarga realizada: " + loaded +
                "\nTotal: " + this.ammunition + "/" + this.maxCapacity);
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
