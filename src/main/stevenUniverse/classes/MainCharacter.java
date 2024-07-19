package main.stevenUniverse.classes;

public class MainCharacter extends Gem {
    private String gender;
    private byte age;

    public MainCharacter (String name, String eyeColor, String hairColor, String gender, byte age, String gemStone, String gemType, String gemPlace, boolean isWhole ) {
        super(name, eyeColor, hairColor, gemStone, gemType, gemPlace, isWhole);
        this.gender = gender;
        this.age = age;
    }

    public boolean healGem (boolean isWhole) {
        if (!isWhole) {
            isWhole = true;
        }
        return isWhole;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
