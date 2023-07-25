import java.util.Random;
public class Rand{
    public static void rng() {
        Random rand = new Random();
        int max = 2;
        int min = 1;
        int randInt = rand.nextInt(max + min) + min;
        System.out.println(randInt);

        switch (randInt){
            case 1:
                enemy.getName(Enemyarch);
                break;
            case 2:
                enemy.getName(Enemyninja);
                break;
            case 3:
                enemy.getName(Enemythief);
        }
    }