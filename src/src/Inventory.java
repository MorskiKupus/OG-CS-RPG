
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<String> inventory;
    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory contains:");
            for (String item : inventory) {
                System.out.println("- " + item);
            }
        }
    }
    public void moveForward(){
        System.out.println("Moving forward...");
        System.out.println("enemy is near you try to slain it");
        startBattle();
    }

    public void startBattle(){
        System.out.println("Press b for battle to start or press f to flee");

    }
}
