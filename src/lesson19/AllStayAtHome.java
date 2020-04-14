package lesson19;

/**
 * @author Jane Wang, Feipeng Qi, Qiming Feng, Wenjie Wang
 * PA05
 * 04/13/20
 */

public class AllStayAtHome extends Population{

  public AllStayAtHome(int n){
    super(n);
  }

  public void createPeople(){
    for(int i=0; i<this.people.length; i++){
      this.addPerson(new StayAtHome());
    }
  }
}
