package lesson19;
import java.util.Random;

/**
 * @author Qiming Feng
 * PA05
 * 04/13/20
 */

public class FrequentFlier extends Person {
    private Random random = new Random();

    public FrequentFlier(int x, int y, Country country) {
         super(x, y, country);
    }

    public FrequentFlier() {
        super();
    }

    /**
     * When this person move they jump to a random, unoccupied space on the board.
     */
    public void tryToMove() {
        int i = random.nextInt(country.places.length);
        int j = random.nextInt(country.places[i].length);
        while (country.places[i][j] != null) {
            // loop to make sure it is an open space ...
            i = random.nextInt(country.places.length);
            j = random.nextInt(country.places[i].length);
        }
        //System.out.println("placing "+p.id+" at "+i+","+j);

        super.moveTo(i,j);
    }
}
