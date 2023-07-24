import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//INPUT


        Inventory playerInventory = new Inventory();  //INVENTORY
        playerInventory.addItem("Sword");
        playerInventory.addItem("shield");

        //MOVEMENT
        Movement movement = new Movement();

        //ATTACK

        //ENEMIES
        EnemiesDefeated enemiesDefeated = new EnemiesDefeated(0);

        //MAIN
        System.out.println("Press 'e' to open the inventory or  'w' to move forward.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        while (true) {

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("e")) {
                playerInventory.displayInventory();
            }else if (input.equalsIgnoreCase("w")) {
                movement.moveForward();
            }
            else if (input.equalsIgnoreCase("b")) {
                    movement.startBattle();
            }
            else if(input.equalsIgnoreCase("f")){
                System.out.println("YOU FLEE");
                break;
            }
            else if(input.equalsIgnoreCase("1")){
                enemiesDefeated.numberOfDefeatedEnemies();
                System.out.println("You have defeated an enemy. Total enemy defeated: " + enemiesDefeated.getEnemiesDefeated());
            }

            else {
                System.out.println("Invalid input. Try again.");
            }

        }

        scanner.close();
    }
}