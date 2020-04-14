package lesson19;

/**
 * @author Jane Wang, Feipeng Qi, Qiming Feng, Wenjie Wang
 * PA05
 * 04/13/20
 */

public class StayAtHomeIfSick extends Person{


	public StayAtHomeIfSick() {
		super();
	}

	public void tryToMove() {
		if (!this.infected){
			tryToMoveRandomly();
		}
	}
}
