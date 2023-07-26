package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Combat {

    Enemy enemy = new Enemy("Marko", 3, 1);
    Knight knight = new Knight(3, 5,6);
    private String enemyDeath = "Enemy is dead";
    private String playerDeath = "You are dead";

    Inventory inventory = new Inventory();
    CoinShop coinShop = new CoinShop();
    public String getEnemyDeath() {
        return enemyDeath;
    }

    public String getPlayerDeath() {
        return playerDeath;
    }
    int knightHp = knight.getHpPot();
    public void combat(){
        if(knight.getAttack()>enemy.getHp()) {
            System.out.println("enemy has: " + enemy.getHp() + " health");

            for (int i = knight.getAttack(); i > enemy.getHp(); i--) {
                knightHp = knight.getHpPot() - enemy.getAtk();
                int coins = coinShop.wallet + 25;
            }
            if (knightHp > 0) {
                System.out.println(enemyDeath + " you killed him in " + enemy.getHp() + " hits");
                System.out.println("you are left with " + knightHp + " health" );
                System.out.println("press 3 to use health potion");
                Healing();
            } else {
                System.out.println(playerDeath);
            }
        }
    }

    public void Healing(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("3") && inventory.equals("Health Potion")){
            int heal = knightHp + 3;
            System.out.println("your health is now: " + heal);
        }
        else{
            System.out.println("you don't have any health potions");
            System.out.println("Press b to buy them: ");
             input = scanner.nextLine();
            if(input.equalsIgnoreCase("b")){
                coinShop.addItem("Health  Potion");
                coinShop.displayShop();
                coinShop.buyHealthPotion();
            }

        }
    }
}
