package headFirst.guessGame;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    public void startGame(){
        p1 = new Player();
        p1.setNumber();
        p2 = new Player();
        p2.setNumber();
        p3 = new Player();
        p3.setNumber();
        int rand = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("The number to be guessed is: " + rand);
        p1.guess(rand);
        p2.guess(rand);
        p3.guess(rand);
    }
}
