package headFirst.guessGame;
import java.util.concurrent.ThreadLocalRandom;

class Player {
    int number;

    public boolean guess(int randomInt){
        return randomInt == number;
    }

    public void setNumber() {
        this.number = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("Number guessed: " + number);
    }

    public int getNumber(){
        return number;
    }
}
