package headFirst.battleship;

public class DotCom {

    private int[] location;

    public int getHits() {
        return hits;
    }

    private  int hits = 0;

    public void setLocation(int[] location){
        this.location = location;
    }

    public String checkYourself(int userGuess) {
        String result = "Miss";

        for (int i : location) {
            System.out.print(i + " ");
        }

        for (int i : location) {
            if (i == userGuess) {
                result = "Hit";
                hits++;
                break;
            } else {
                result = "Miss";
            }
        }
        if (hits == location.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
