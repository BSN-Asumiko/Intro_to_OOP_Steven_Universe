package main.stevenUniverse.classes;

public class Human extends Character {
    private String gender;
    private byte age;

    public Human  (String name, String eyeColor, String hairColor, String gender, byte age) {
        super(name, eyeColor, hairColor);
        this.gender = gender;
        this.age = age;
    }

    public String eat (String food) {
        return "I'm eating the " + food + ". It's sooo delicious!";
    }

    public String getOlder (byte age) {
        age++;
        return "Another year passed, now I'm " + age + ".";
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
