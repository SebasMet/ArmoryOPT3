package com.example.armory;

public class Main {

    public static void main(String[] args) {
        ArmamentFactory shieldFactory = ArmamentFactory.getFactory(Armament.SHIELD);
        ArmamentFactory armorFactory = ArmamentFactory.getFactory(Armament.ARMOR);
        ArmamentFactory weaponFactory = ArmamentFactory.getFactory(Armament.WEAPON);

        Armament shield = shieldFactory.getArmament(Shield.HUGE);
        Armament armor = armorFactory.getArmament(Armor.HEAVY);
        Armament weapon = weaponFactory.getArmament(Weapon.CRUSHING);

        Logger mainLogger = Logger.getInstance();

        mainLogger.logMessage(shield.name());
        mainLogger.logMessage(armor.name());
        mainLogger.logMessage(weapon.name());

    }
}
