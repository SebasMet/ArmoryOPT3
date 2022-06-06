package com.example.armory;

public class ShieldFactory implements ArmamentFactory {
    
    public Armament getArmament(int shieldType) {
        Shield shield = null;

        switch (shieldType) {
            case Shield.SMALL:
                shield = new RoundShield();
                break;
            case Shield.BIG:
                shield =  new SquareShield();
                break;
            case Shield.HUGE:
                //shield = new ShieldAdapter(new LegacyShield());
                return new ShieldAdapter(new LegacyShield());


            default:
                Logger.getInstance().logMessage("Invalid shield type", Logger.ERROR);
        }
        return shield;
    }
}
