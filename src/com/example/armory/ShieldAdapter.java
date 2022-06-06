package com.example.armory;

public class ShieldAdapter extends Shield implements Armament {
    private LegacyShield instance;

    public ShieldAdapter(LegacyShield instance) {
        this.instance = instance;
    }

    @Override
    public String name() {
        return instance.shieldName();
    }
}


// Below example is more verbose
/*
public class ShieldAdapter implements Armament {
    private LegacyShield instance;

    public ShieldAdapter(LegacyShield instance) {
        this.instance = instance;
    }

    @Override
    public String name() {
        return instance.shieldName();
    }

    @Override
    public int type() {
        return Armament.SHIELD;
    }
}
*/



