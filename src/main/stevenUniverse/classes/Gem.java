package main.stevenUniverse.classes;

import main.stevenUniverse.interfaces.Battle;
import main.stevenUniverse.interfaces.RegularActions;
import main.stevenUniverse.utils.UtilityClass;

public class Gem extends Character implements RegularActions, Battle {

    private String gemStone;
    private String gemType;
    private boolean isWhole;

    public Gem  (String name, String eyeColor, String hairColor, String weapon, String gemStone, String gemType,  boolean isWhole) {
        super(name, eyeColor, hairColor, weapon);
        this.gemStone = gemStone;
        this.gemType = gemType;
        this.isWhole = isWhole;
    }

    
    public String breaking (boolean isWhole) {
        if (isWhole) {
            isWhole = false;
            setWhole(isWhole);
            return "Oh no, it seems I got a fracture..";
        } else {
            return "I had a fracture before and now I'm breaking apart..";
        }

    }

    public String makeFusion (String name, String fusionName) {
        return "When I'm dancing with " + name + ", we form " + fusionName + "!";
    }

    public String isBroken () {
        String broken = isWhole ? "Whew, I'm not broken" :  "Oh nooo, I'm broken...";
        return broken;
    }

    @Override
    public String talk(String[] quotes) {
        int quotePosition = UtilityClass.getRandomNumber(quotes.length);
        return quotes[quotePosition];
    }
    
    @Override
    public String greet () {
        String greeting = "Hi! I'm " + getName() + ", nice to meet you! My gemstone is " + gemStone + ", I belong to " + gemType + " family. My eyes are " + getEyeColor() + " and my hair is " + getHairColor() + ".";
        return greeting;
    }

    @Override 
    public String haveWeapon () {
        return "My weapon is " + getWeapon() + ".";
    }

    @Override 
    public String fight(String opponentName) {
        return getName() + " and " + opponentName + " are fighting. Who is going to win?";
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

    public void setWhole(boolean isWhole) {
        this.isWhole = isWhole;
    }



}
