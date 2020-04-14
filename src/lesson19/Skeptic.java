package lesson19;

/**
 * @author Wenjie Wang
 * PA05
 * 04/13/20
 */

public class Skeptic extends Person {

   public Skeptic(int x, int y, Country country) {
        super(x, y, country);
   }
   
   public Skeptic() {
	    super();
   }

    /**
     * always tries to move every tick.
     */
    public void tryToMove() {
        super.tryToMoveRandomly();
    }
}
