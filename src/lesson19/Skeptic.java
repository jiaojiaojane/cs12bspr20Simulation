package lesson19;


public class Skeptic extends Person {

   public Skeptic(int x, int y, Country country) {
        super(x, y, country);
   }
   
   public Skeptic() {
	    super();
   }

    @Override
    public void tryToMove() {
        super.tryToMoveRandomly();
    }
    //3333777
}
