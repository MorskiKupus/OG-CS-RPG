import java.util.Random;

public class Combat extends Enemy{
    private static Player player;
    private static Enemy enemy;

    public Combat(String name, int health, int damage) {
        super(name, health, damage);
    }


    // Constructor


    public void playerFlees() {
        if (Math.random() < 0.5) { // 50% chance of escaping
            System.out.println("You successfully fled from the enemy!");
        } else {
            System.out.println("You failed to flee and must continue the battle!");
        }
    }

    public void useHealingPotion() {
        int healingAmount = 10; //
        if (inventory.contains("Healing Potion")) {
            this.currentHealth += healingAmount;
            if (this.currentHealth > this.maxHealth) {
                this.currentHealth = this.maxHealth;
            }
            System.out.println("You used a Healing Potion and healed for " + healingAmount + " HP.");
        } else {
            System.out.println("You don't have any Healing Potions in your inventory.");
        }
    }

    import java.util.Random;
    public class Rand{
        public static void rng() {
            Random rand = new Random();
            int max = 2;
            int min = 1;
            int randInt = rand.nextInt(max + min) + min;
            System.out.println(randInt);

            switch (randInt){
                case 1:
                    enemy.getName(Enemyarch);
                    break;
                case 2:
                    enemy.getName(Enemyninja);
                    break;
                case 3:
                    enemy.getName(Enemythief);
            }
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
                        player.attack(enemy);
                        break;
                    int playerAttackDamage = player.getDamage();
                    enemy.reduceHealth(playerAttackDamage);
                    System.out.println("You attacked " + enemy.getName() + " for " + playerAttackDamage + " damage.");
                    break;
                    case 2:
                        player.useHealingPotion();
                        break;
                    case 3:
                        playerFlees();
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

        private boolean isVictorious () {
            return player.getHealth() > 0 && enemy.getHealth() <= 0;
            System.out.println("You are victorious!");
        }

        private boolean isDefeated () {
            System.out.println("You have been defeated.");
            return player.getHealth() <= 0;
        }
    }
}
