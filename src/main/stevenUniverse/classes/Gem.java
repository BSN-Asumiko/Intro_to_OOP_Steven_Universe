package main.stevenUniverse.classes;

import main.stevenUniverse.interfaces.Battle;
import main.stevenUniverse.interfaces.RegularActions;

public abstract class Gem extends Character implements RegularActions, Battle {

    private String gemStone;
    private String gemType;
    private boolean isWhole;

    public Gem  (String name, String eyeColor, String hairColor, String gemStone, String gemType,  boolean isWhole) {
        super(name, eyeColor, hairColor);
        this.gemStone = gemStone;
        this.gemType = gemType;
        this.isWhole = isWhole;
    }

    public boolean breaking (boolean isWhole) {
        if (isWhole) {
            isWhole = false;
        }
        return isWhole;
    }

    public String makeFusion (String name[], String fusionName) {
        return "When I'm dancing with " + name + ", we form " + fusionName + "!";
    }

    public String isBroken () {
        String broken = isWhole ? "Whew, I'm not broken" :  "Oh nooo, I'm broken...";
        return broken;
    }

    @Override 
    public abstract String talk();
    
    @Override
    public String greet () {
        String greeting = "Hi! I'm " + getName() + ", nice to meet you! My gemstone is " + gemStone + ", I belong to " + gemType + " family. My eyes are " + getEyeColor() + "and my hair is " + getHairColor();
        return greeting;
    }

    @Override 
    public String haveWeapon (String weapon) {
        return "My weapon is " + weapon + ".";
    }

    @Override 
    public String fight(String names[]) {
        return names[0] + " and " + names[1] + " are fighting. Who is going to win?";
    }

    public String getGemStone() {
        return gemStone;
    }

    public void setGemStone(String gemStone) {
        this.gemStone = gemStone;
    }

    public String getGemType() {
        return gemType;
    }

    public void setGemType(String gemType) {
        this.gemType = gemType;
    }

    public boolean getIsWhole() {
        return isWhole;
    }


}
