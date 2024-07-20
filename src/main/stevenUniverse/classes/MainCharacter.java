package main.stevenUniverse.classes;

import main.stevenUniverse.utils.DataProvider;
import main.stevenUniverse.utils.UtilityClass;


public class MainCharacter extends Gem {
    private String gender;
    private int age;

    public MainCharacter (String name, String eyeColor, String hairColor, String weapon, String gemStone, String gemType, boolean isWhole, String gender, int age) {
        super(name, eyeColor, hairColor, weapon, gemStone, gemType, isWhole);
        this.gender = gender;
        this.age = age;
    }

    public void healGem(Gem gem) {
        if (!gem.getIsWhole()) {
            gem.setWhole(true);
            System.out.println("Steven healed " + gem.getName() + " and now she's whole!");
        } else {
            System.out.println(gem.getName() + " is already whole.");
        }
    }

    public String eat () {
        return "What about to eat some " + UtilityClass.getFood(DataProvider.foodies) + "? Do you want a bite?";
    }

    public String getOlder (int age) {
        age++;
        setAge(age);
        return "Another year passed, now I'm " + age + ".";
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
