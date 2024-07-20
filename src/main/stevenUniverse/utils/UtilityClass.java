package main.stevenUniverse.utils;
import java.util.Random;

public class UtilityClass  {
    public static int getRandomNumber (int bound) {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(bound);

        return number;
    }

    
    public static String getFood (String[] food) {
        int position = getRandomNumber(food.length);
        return  DataProvider.foodies[position];
        
    }
}
