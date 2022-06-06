package com.example.armory;

import com.sun.net.httpserver.Filter;

public class ArmorFactory implements ArmamentFactory {
    public Armament getArmament(int armorType) {
        Armor armor = null;

        switch (armorType) {
            case Armor.LIGHT:
                armor = new LeatherArmor();
                break;
            case Armor.MEDIUM:
                armor =  new ChainArmor();
                break;
            case Armor.HEAVY:
                armor =  new PlateArmor();
                break;
            default:
                Logger.getInstance().logMessage("Invalid armor type", Logger.ERROR);
        }
        return armor;
    }
}
