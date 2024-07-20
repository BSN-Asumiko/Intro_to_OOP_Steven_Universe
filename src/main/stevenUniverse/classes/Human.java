package main.stevenUniverse.classes;

import main.stevenUniverse.utils.DataProvider;
import main.stevenUniverse.utils.UtilityClass;
import main.stevenUniverse.interfaces.Battle;
import main.stevenUniverse.interfaces.RegularActions;

public class Human extends Character implements RegularActions, Battle {
    private String gender;
    private int age;

    public Human  (String name, String eyeColor, String hairColor, String weapon, String gender, int age) {
        super(name, eyeColor, hairColor, weapon);
        this.gender = gender;
        this.age = age;
    }

    public String eat () {
        return "I'm eating the " + UtilityClass.getFood(DataProvider.foodies) + ". This is sooo delicious!";
    }

    public String getOlder (int age) {
        age++;
        setAge(age);
        return "Another year passed, now I'm " + age + ".";
    }

    @Override
    public String talk(String[] quotes) {
        int quotePosition = UtilityClass.getRandomNumber(quotes.length);
        return quotes[quotePosition];
    }
    
    @Override
    public String greet () {
        String greeting = "Hello! I'm " + getName() + ". My eyes are " + getEyeColor() + " and my hair is " + getHairColor();
        return greeting;
    }

    @Override 
    public String haveWeapon () {
        return "I'm very good with " + getWeapon() + ".";
    }

    @Override 
    public String fight(String opponentName) {
        return getName() + " and " + opponentName + " are fighting. Who is going to win?";
    }

    public String getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}
