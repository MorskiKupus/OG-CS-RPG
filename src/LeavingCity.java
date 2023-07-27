package src;
import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class LeavingCity{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(in);
        out.println("You roam and get further from your city...you wander into the wilderness...");
        out.println("Eventually, you come to a choice. Finding 3 paths right in front of you....");
        out.println("Which one will you choose?");
        out.println("1. Rusty Mountains  2. Old forest 3. Savanna");

        int choice = myObj.nextInt();
        myObj.nextLine();

        String path = "";

        switch (choice) {
            case 1 -> {
                out.println("You have chosen a path: Rusty Mountains!");
                path = "Rusty Mountains";
            }
            case 2 -> {
                out.println("You have chosen a path: Old forest!");
                path = "Old forest";
            }
            case 3 -> {
                out.println("You have chosen a path: Savanna!");
                path = "Savanna";
            }
            default -> {
                out.println("Invalid choice. Please choose a valid path.");
                return;
            }
        }

        Random random = new Random();
        boolean enemySpawned = random.nextBoolean();

        if (enemySpawned) {
            out.println("As you enter the " + path + ", an enemy jumps in front of you!");
            out.println("You need to decide whether to fight or run!");
            out.println("1. Fight the enemy");
            out.println("2. Try to run away");
            int decision = myObj.nextInt();
            myObj.nextLine();

            if (decision == 1) {
                out.println("You bravely decide to fight the enemy!");
                //dodati combat
            } else if (decision == 2) {
                out.println("You attempt to run away from the enemy!");
                //ubaciti flee scenario
            } else {
                out.println("You freeze in fear and the enemy attacks...");
                //umres
            }
        } else {
            out.println("You enter the " + path + " without encountering any enemies.");
            //poslije combata se ovdje vraca
            out.println("Getting deeper into the " + path + " wasn't a great idea.... Being lost you have to choose again...");
            out.println("Will you try to get out, explore more, or build a shelter to sleep the night...");
            out.println("1. Try to get out");
            out.println("2. Explore more");
            out.println("3. Build a shelter");

            int choice2 = myObj.nextInt();
            myObj.nextLine();

            switch (choice2) {
                case 1 -> {
                    out.println("Being scared you try to find a way out...");
                    //pokusas se vratiti i umres
                }
                case 2 -> {
                    out.println("As your bravery takes over, you decide to keep exploring...");
                    //razgranati ovaj choice jos vise
                }
                case 3 -> {
                    out.println("Is it a great idea to try and build a shelter?... (you think to yourself...)");
                    //ubaciti scenario ako te napadne enemy ili ako uspjesno prespavas
                }
                default -> {
                    out.println("Invalid choice. Please choose a valid path.");
                    return;
                }
            }
        }
    }
}