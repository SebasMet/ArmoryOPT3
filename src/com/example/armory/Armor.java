package com.example.armory;

public abstract class Armor implements Armament {
    static final int LIGHT = 0;
    static final int MEDIUM = 1;
    static final int HEAVY = 2;

    @Override
    public int type() {
        return Armament.ARMOR;
    }
}

class LeatherArmor extends Armor {

    @Override
    public String name() {
        return "Leather Armor";
    }
}

class ChainArmor extends Armor {

    @Override
    public String name() {
        return "Chain Armor";
    }
}

class PlateArmor extends Armor {

    @Override
    public String name() {
        return "Plate Armor";
    }
}


