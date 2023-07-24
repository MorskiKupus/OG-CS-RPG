import java.util.Random;

public class Enemythief extends Enemy {
    public Enemythief() {
        super("Enemythief", 30, 3);
    }

    @Override
    public int getCoinDrop() {
        // Randomize coin drop value between 5 and 15
        return new Random().nextInt(11) + 5;
    }
}
