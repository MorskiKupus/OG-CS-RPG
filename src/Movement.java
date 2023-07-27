package src;

import java.util.Random;
import java.util.Scanner;

public class Movement extends  CoinShop{
    private static final int EncounterChance = 45;
    private static final int Treasure = 5;

    CoinShop coinShop = new CoinShop();

    public int Flee() {
        Random random = new Random();
        int choice = random.nextInt(2);
        return choice;
    }

    public void Movement() {
        String input;
        Random encounter = new Random();
        int enemyE = encounter.nextInt(2);
        do {
            System.out.println("Press W to move forward");
            Scanner movement = new Scanner(System.in);
            input = movement.nextLine();
            if (input.equalsIgnoreCase("W")) {
                System.out.println("You are moving forward");
                if (encounter.nextInt(100) < EncounterChance) {
                    System.out.println("You encountered an enemy!");
                    Combat combat = new Combat();
                    combat.combat();
                }
                if (encounter.nextInt(100) < Treasure) {
                    Random gained = new Random();
                    int max = 300;
                    int min = 99;
                    int gold = gained.nextInt(max - min + 1) + min;
                    System.out.println("You found a treasure chest and gained " + gold + " gold!");
                     wallet = wallet + gold;
                }
            } else {
                System.out.println("Invalid input");
            }
        } while (input.equalsIgnoreCase("W"));
    }
}
