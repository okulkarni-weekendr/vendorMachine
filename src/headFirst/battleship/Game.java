package headFirst.battleship;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
	public static void main(String[] args) {
		int[] locationCells = new int[10];
		int numOfHits = 0;
		int x = ThreadLocalRandom.current().nextInt(1, 8);
		String str = String.valueOf(x);
		if(checkYourself(str, locationCells)) {
		}
	}

	static void setLocationCells(int[] locationCells){

	}

	private static String checkYourself(String s, Integer[] locationCell) {
		for(int i : locationCell) {
			if (Integer.parseInt(s) == i) {
				return "Hit";
			} else return "miss";
		}
	}
}

