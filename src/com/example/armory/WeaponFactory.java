package com.example.armory;

public class WeaponFactory implements ArmamentFactory{

    public Armament getArmament(int weaponType) {
        Weapon weapon = null;

        switch (weaponType) {
            case Weapon.CRUSHING:
                weapon = new Mace();
                break;
            case Weapon.SLASHING:
                weapon =  new Sword();
                break;
            default:
                Logger.getInstance().logMessage("Invalid weapon type", Logger.ERROR);
        }
        return weapon;
    }
}
