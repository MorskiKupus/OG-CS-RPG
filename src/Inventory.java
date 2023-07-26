package src;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Inventory implements Serializable {
    private Map<String, Integer> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addItem(String item) {
        inventory.put(item, inventory.getOrDefault(item, 0) + 1);
    }

    public void removeItem(String item) {
        int itemCount = inventory.getOrDefault(item, 0);
        if (itemCount > 0) {
            inventory.put(item, itemCount - 1);
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory contains:");
            for (String item : inventory.keySet()) {
                int itemCount = inventory.get(item);
                System.out.println("- " + item + "x" + itemCount);
            }
        }
    }

    public boolean containsItem(String item) {
        return inventory.containsKey(item) && inventory.get(item) > 0;
    }

    public int getItemCount(String item) {
        return inventory.getOrDefault(item, 0);
    }
}
