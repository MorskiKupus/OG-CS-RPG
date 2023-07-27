package src;

import java.util.Random;

public class EnemyRand {

    public int randGold() {
        Random gold = new Random();
        int max = 21;
        int min = 9;
        int gained = gold.nextInt(max + min) + min;
        return gained;
    }

    public String rand() {
        Enemy archer = new Enemy(3, 14, "Archer");
        Enemy rogue = new Enemy(4, 13, "Thief");
        Enemy ninja = new Enemy(5, 15, "Ninja");
        String encounter = "";
        Random rand = new Random();
        int max = 2;
        int min = 1;
        int value = rand.nextInt(max + min) + min;
        switch (value) {
            case 1:
                encounter = archer.name;
                return encounter;

            case 2:
                encounter = rogue.name;
                return encounter;

            case 3:
                encounter = ninja.name;
                return encounter;
        }
        return encounter;
    }
}