import java.util.Random;

public class Enemyninja extends Enemy {
    public Enemyninja() {
        super("Enemyninja", 15, 7);
    }

    @Override
    public int getCoinDrop() {
        // Randomize coin drop value between 20 and 40
        return new Random().nextInt(21) + 20;
    }
}
