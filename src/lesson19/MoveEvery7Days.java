/**
 * 
 */
package lesson19;
import java.util.Random;

/**
 * @author Feipeng Qi
 *
 */
public class MoveEvery7Days extends Person {
	private int counter=0;
	private Random r = new Random();

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
		tryToMoveRandomly();
	}
	
    public void tryToMoveRandomly(){
    	int dx = r.nextInt(3)-1; // -1,0,1
		int dy = r.nextInt(3)-1; // -1,0,1
		if (isOK(this.x+dx, this.y+dy,this.country)) {
			this.moveTo(this.x+dx, this.y+dy);
			this.counter++;
		}
    }
    
    public boolean isOK(int a, int b,Country country) {
		if (a<0 || a>=country.places.length || b<0
				|| b>= country.places[0].length) {
			return false;
		}else if (country.places[a][b] !=null) {
			return false;
		}else if(this.counter%7!=0) {
			return false;
		}else {
			return true;
		}

	}

}
