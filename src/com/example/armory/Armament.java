package com.example.armory;

interface Armament {
    static final int WEAPON = 0;
    static final int ARMOR = 1;
    static final int SHIELD = 2;

    String name();
    int type();
}



