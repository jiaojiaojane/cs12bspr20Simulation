/**
 *
 */
package lesson19;

/**
 * @author Feipeng Qi
 *this class extends the skeptic class and creates a new type of person who moves every 7 days.
 */

public class MoveEvery7Days extends Person {
	private int counter=0;

	public MoveEvery7Days(int x, int y, Country country) {
		super(x, y, country);
		// TODO Auto-generated constructor stub
	}

	public MoveEvery7Days(){
		super();
	}

	/**
	 * add a restriction to the tryToMove method so that the person moves every 7 days.
	 */
	public void tryToMove() {
		if(this.counter%7==0) {
			tryToMoveRandomly();
		}
		this.counter++;
	}


}
