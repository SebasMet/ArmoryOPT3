package com.example.armory;

public abstract class Shield implements Armament {
    static final int BIG = 0;
    static final int SMALL = 1;
    static final int HUGE = 2;

    @Override
    public int type() {
        return Armament.SHIELD;
    }
}

class RoundShield extends Shield {

    @Override
    public String name() {
        return "Round Shield";
    }
}

class SquareShield extends Shield {

    @Override
    public String name() {
        return "Square Shield";
    }
}
