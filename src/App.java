import main.stevenUniverse.classes.Character;
import main.stevenUniverse.classes.Gem;
import main.stevenUniverse.classes.Human;
import main.stevenUniverse.classes.MainCharacter;
import main.stevenUniverse.utils.DataProvider;

public class App {

    public static void main(String[] args) throws Exception {

        MainCharacter steven = new MainCharacter("Steven Universe", "black", "dark brown", "shield", "pink diamond", "diamond", true, "male", 13);
        System.out.println(steven.greet());
        System.out.println("I am " + steven.getAge() + " years old.");
        System.out.println(steven.makeFusion("Connie", "Stevonnie"));
        System.out.println(steven.eat());
        System.out.println(steven.getOlder(steven.getAge()));
        System.out.println("I am " + steven.getAge() + " years old.");
        System.out.println(steven.talk(DataProvider.stevenQuotes));
        System.out.println();

        Gem roseQueartz = new Gem("Rose Quartz", "black", "pink", "shield and sword", "pink diamond", "diamond", false);
        System.out.println(roseQueartz.greet());
        System.out.println(roseQueartz.haveWeapon());
        System.out.println(roseQueartz.talk(DataProvider.roseQuartzQuotes));
        System.out.println(roseQueartz.isBroken());
        System.out.println();

        Gem garnet = new Gem("Garnet", "blue, red and purple", "indigo-black", "gauntlets", "Ruby and Saphire", "fusion", true);
        System.out.println(garnet.greet());
        System.out.println(garnet.fight("Amethyst"));
        System.out.println(garnet.talk(DataProvider.garnetQuotes));
        System.out.println(garnet.isBroken());
        System.out.println();

        Gem amethyst = new Gem("Amethyst", "dark indigo", "pale lavender", "whip", "amethyst", "quartz", false);
        System.out.println(amethyst.greet());
        System.out.println(amethyst.makeFriends("Steven"));
        System.out.println(amethyst.talk(DataProvider.amethystQuotes));
        System.out.println(amethyst.isBroken());
        steven.healGem(amethyst);
        System.out.println(amethyst.isBroken());
        System.out.println();

        Human gregUniverse = new Human("Greg Universe", "black", "brown", "guitar", "male", 40);
        System.out.println(gregUniverse.greet());
        System.out.println(gregUniverse.haveWeapon());
        System.out.println(gregUniverse.eat());
        System.out.println(gregUniverse.talk(DataProvider.gregQuotes));
        System.out.println();

        Human connie = new Human("Connie Maheswaran", "black", "dark brown", "sword", "female", 12);
        System.out.println(connie.greet());
        System.out.println(connie.makeFriends("Steven"));
        System.out.println(connie.talk(DataProvider.connieQuotes));
        System.out.println();

        Gem pearl = new Gem("Pearl", "light cyan", "light peach", "spear", "pearl", "pearl", true);
        System.out.println(pearl.greet());
        System.out.println(pearl.haveWeapon());
        System.out.println(pearl.breaking(pearl.getIsWhole()));
        System.out.println(pearl.breaking(pearl.getIsWhole()));
        steven.healGem(pearl);
        System.out.println(pearl.isBroken());
        System.out.println(pearl.talk(DataProvider.pearlQuotes));
        System.out.println();

        Character lion = new Character("Lion", "black", "pink", "concussive roar");
        System.out.println(lion.makeFriends("Steven"));
    }

}
