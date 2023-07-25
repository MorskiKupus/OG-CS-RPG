import java.util.Random;

public class Enemyarch extends Enemy {
    public Enemyarch() {
        super("Enemyarch", 20, 4);
    }

    @Override
    public int getCoinDrop() {
        // Randomize coin drop value between 5 and 10
        return new Random().nextInt(4) +10;
    }
}
