package headFirst.battleship;

import java.util.concurrent.ThreadLocalRandom;

public class User {
    private int guess;

    public int getGuess() {
        return guess;
    }

    public void setGuess() {
        int rand = ThreadLocalRandom.current().nextInt(1,10);
        this.guess = rand;
    }
}
