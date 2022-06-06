package com.example.armory;

interface ArmamentFactory {

    static ArmamentFactory getFactory(int arnamentType) {
        ArmamentFactory factory = null;
        switch(arnamentType) {
            case Armament.WEAPON:
                factory = new WeaponFactory();
                break;
            case Armament.ARMOR:
                factory = new ArmorFactory();
                break;
            case Armament.SHIELD:
                factory = new ShieldFactory();
                break;
            default:
                Logger.getInstance().logMessage("Invalid Armament type", Logger.ERROR);
        }
        return factory;
    }

    Armament getArmament(int armamentSubType);
}
