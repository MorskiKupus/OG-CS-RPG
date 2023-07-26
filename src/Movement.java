package src;
import java.util.Random;
public class Movement {

    public void Flee() {
        Random random = new Random();
        int choice = random.nextInt(2);
        if (choice == 1) {
            System.out.println("You have fled successfully");
        } else {
            System.out.println("Fleeing failed, resuming combat.");
        }
    }
}
