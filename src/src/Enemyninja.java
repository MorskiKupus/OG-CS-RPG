import java.util.Random;

public class Enemyninja extends Enemy {
    public Enemyninja() {
        super("Enemyninja", 15, 7);
    }

    @Override
    public int getCoinDrop() {
        // Randomize coin drop value between 5 and 20
        return new Random().nextInt(6) + 15;
    }
}
