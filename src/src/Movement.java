import java.lang.ref.Cleaner;

public class Movement {

    public void moveForward(){
        System.out.println("Moving forward...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void startBattle(){
        System.out.println("Battle is starting click 1 to attack ");
    }


}
