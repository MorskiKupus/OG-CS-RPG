import java.util.Random;

public class Combat {
    private Player player;
    private Enemy enemy;

    // Constructor
    public Combat(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void startCombat() {
        System.out.println("Encounter: " + enemy.getName());

        while (true) {
            while (true) {
                System.out.println("Player Health: " + player.getHealth());
                System.out.println("Enemy Health: " + enemy.getHealth());
                System.out.println("Choose your action:");
                System.out.println("1. Attack");
                System.out.println("2. Use Item");
                System.out.println("3. Flee");

                int playerChoice = scanner.nextInt();

                switch (playerChoice) {
                    case 1:
                        // Implement logic for attack action
                        int playerAttackDamage = player.getDamage();
                        enemy.reduceHealth(playerAttackDamage);
                        System.out.println("You attacked " + enemy.getName() + " for " + playerAttackDamage + " damage.");
                        break;
                    case 2:
                        // Implement logic for using an item (if applicable)
                        // Example: player.useHealingPotion();
                        break;
                    case 3:
                        // Implement logic for player fleeing (if applicable)
                        // Example: playerFlees();
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }


                if (isVictorious()) {
                System.out.println("You defeated " + enemy.getName() + "!");
                int coinsDropped = enemy.getCoinDrop();
                player.addCoins(coinsDropped);
                System.out.println("You received " + coinsDropped + " coins.");
                break;
            } else if (isDefeated()) {
                System.out.println("You were defeated by " + enemy.getName() + ".");
                break;
            } else if (playerChoosesToFlee) {
                System.out.println("You fled from " + enemy.getName() + ".");
                break;
            }
        }
    }

    private boolean isVictorious() {
        // Implement logic to check if the player defeats the enemy
        // Compare player's and enemy's health, return true if enemy defeated
        return player.getHealth() > 0 && enemy.getHealth() <= 0;
    }

    private boolean isDefeated() {
        // Implement logic to check if the player is defeated
        // Compare player's and enemy's health, return true if player defeated
        return player.getHealth() <= 0;
    }
}
