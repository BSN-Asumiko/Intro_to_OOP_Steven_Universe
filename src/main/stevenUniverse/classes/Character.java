package main.stevenUniverse.classes;

public abstract class Character {
    private String name;
    private String eyeColor;
    private String hairColor;
    
    public Character (String name, String eyeColor, String hairColor) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String makeFriends (String friendName) {
        return "Me and " + friendName + " are friends!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

}
