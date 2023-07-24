import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory playerInventory = new Inventory();
        playerInventory.addItem("Sword");
        playerInventory.addItem("shield");

        System.out.println("Press 'e' to open the inventory or  'w' to move forward.");
        while (true) {

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("e")) {
                playerInventory.displayInventory();
            }else if (input.equalsIgnoreCase("w")) {
                playerInventory.moveForward();

            }
            else if (input.equalsIgnoreCase("q to quit")) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid input. Try again.");
            }
        }

        scanner.close();
    }
}