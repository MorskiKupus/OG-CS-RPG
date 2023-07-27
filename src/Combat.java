package src;

import java.util.Random;
import java.util.Scanner;

public class Combat {
    Knight knight = new Knight(5, 5, 5);
    int knightHp = knight.getHpPot();
    Movement movement = new Movement();
    private String enemyDeath = "Enemy is dead";
    private String playerDeath = "You are dead";

    int enemyHp;
    int enemyAtk;

    Inventory inventory = new Inventory();
    CoinShop coinShop = new CoinShop();


    public String getEnemyDeath() {
        return enemyDeath;
    }

    public String getPlayerDeath() {
        return playerDeath;
    }

    public void combat() {
        String enemyType = randEnemy();
        System.out.println("You encountered: " + enemyType);

        if (enemyType.equalsIgnoreCase("Archer")) {
            Enemy enemy = new Enemy("Archer", 3, 14);
            enemyAtk = enemy.getAtk();
            enemyHp = enemy.getHp();
        } else if (enemyType.equalsIgnoreCase("Thief")) {
            Enemy enemy = new Enemy("Thief", 4, 13);
            enemyAtk = enemy.getAtk();
            enemyHp = enemy.getHp();
        } else {
            Enemy enemy = new Enemy("Ninja", 5, 15);
            enemyAtk = enemy.getAtk();
            enemyHp = enemy.getHp();
        }

        int totalDamage = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The enemy has " + enemyHp + " hp");

        while (enemyHp > 0 && knightHp > 0) {
            System.out.println("Choose an action: ");
            System.out.println("1. Attack 2. Flee  3. Inventory");
            String select = scanner.nextLine();

            if (select.equalsIgnoreCase("2")) {
                if (movement.Flee() == 1) {
                    System.out.println("You have successfully fled");
                    movement.Movement();
                } else {
                    System.out.println("Fleeing failed, resuming combat");
                }
            } else if (select.equalsIgnoreCase("1")) {
                System.out.println("The enemy hits you for " + enemyAtk + " damage. You now have " + (knightHp - enemyAtk) + " health.");
                System.out.println("You hit the enemy for " + knight.getAttack() + " damage. The enemy now has " + (enemyHp - knight.getAttack()) + " health.");

                knightHp -= enemyAtk;
                enemyHp -= knight.getAttack();

                if (enemyHp <= 0) {
                    System.out.println("The enemy has been defeated, you gained " + randGold() + " gold.");
                    System.out.println("You have " +knightHp+ " Health");
                    randGold();
                    coinShop.wallet = coinShop.wallet + randGold();

                }
                if (knightHp <= 0) {
                    System.out.println("You have been defeated, game over.");
                }
            }
        }
    }

    public void Healing() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("3") && inventory.containsItem("Health Potion")) {
            int heal = knightHp + 3;
            System.out.println("Your health is now: " + heal);
        } else {
            System.out.println("You don't have any health potions.");
        }
    }

    private int randGold() {
        Random gold = new Random();
        return gold.nextInt(21);
    }

    private String randEnemy() {
        String[] enemies = {"Archer", "Thief", "Ninja"};
        Random rand = new Random();
        int index = rand.nextInt(enemies.length);
        return enemies[index];
    }
}
