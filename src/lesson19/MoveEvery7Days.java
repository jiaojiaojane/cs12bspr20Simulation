/**
 * 
 */
package lesson19;

/**
 * @author Feipeng Qi
 *
 */
public class MoveEvery7Days extends Person {
	private int counter=0;

	/**
	 * @param x
	 * @param y
	 * @param country
	 */
	public MoveEvery7Days(int x, int y, Country country) {
		super(x, y, country);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public void tryToMove() {
		if(this.counter%7==0) {
			tryToMoveRandomly();
		}
		this.counter++;
	}
	
    
}
