
import java.util.ArrayList;


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

}
