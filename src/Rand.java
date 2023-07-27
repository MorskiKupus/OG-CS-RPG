package src;

import java.util.Random;
public class Rand{
    public static void rng() {
        Random rand = new Random();
        int max = 2;
        int min = 1;
        int randInt = rand.nextInt(max + min) + min;
        System.out.println(randInt);
    }
}