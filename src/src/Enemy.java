public abstract class Enemy {
    private String name;
    private int health;
    private int damage;

    public static void main(String[] args) {
        Player player = new Player("PlayerName", 100); // Assuming Player class has a constructor that takes name and health.
        Enemy enemy = new Enemyarch(); // Creating an instance of Enemyarch. You can use any other subclass as well.

        Combat combat = new Combat(player, enemy);
        combat.startCombat();
    }


    // Constructor
    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    // Abstract method for getting coin drop value
    public abstract int getCoinDrop();

    // Add methods for enemy actions here, if needed
}
