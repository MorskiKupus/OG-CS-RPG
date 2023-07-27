package src;
import java.util.Random;

public class EnemyRand {
    public String rand() {
        Enemy archer = new Enemy("Archer", 14, 3);
        Enemy rouge = new Enemy("Rogue", 13, 4);
        Enemy ninja = new Enemy("Ninja", 15, 6);
        String encounter = null;
        Random rand = new Random();
        int max = 2;
        int min = 1;
        int value = rand.nextInt(max + min) + min;
        switch (value) {
            case 1:
                encounter = archer.getName();
                return encounter;

            case 2:
                encounter = rouge.getName();
                return encounter;


            case 3:
                encounter = ninja.getName();
                return encounter;
        }

        return encounter;
    }
}
