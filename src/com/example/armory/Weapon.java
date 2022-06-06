package com.example.armory;

public abstract class Weapon implements Armament {
    static final int SLASHING = 0;
    static final int CRUSHING = 1;

    @Override
    public int type() {
        return Armament.WEAPON;
    }
}

class Sword extends Weapon {

    @Override
    public String name() {
        return "Sword";
    }
 }

class Mace extends Weapon {

    @Override
    public String name() {
        return "Mace";
    }
}



