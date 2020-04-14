package lesson19;

public class MixedPopulation extends Population{
  int numShelterInPlace;
  int numEssential;
  int numSkeptic;
  int numFrequentFliers;
  int numMoveEvery7Days;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFrequentFliers, int numMoveEvery7Days){
    super(numShelterInPlace + numEssential + numSkeptic + numFrequentFliers + numMoveEvery7Days);
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numSkeptic = numSkeptic;
    this.numFrequentFliers = numFrequentFliers;
    this.numMoveEvery7Days = numMoveEvery7Days;
  }

  public void createPeople(){
    for(int i=0; i<this.numShelterInPlace; i++){
      this.addPerson(new StayAtHome());
    }
    for(int i=0; i<this.numEssential; i++){
      this.addPerson(new StayAtHomeIfSick());
    }
    for(int i=0; i<this.numSkeptic; i++){
      this.addPerson(new Skeptic());
    }
    for(int i=0; i<this.numFrequentFliers; i++){
        this.addPerson(new FrequentFlier());
    }
    for(int i=0; i<this.numMoveEvery7Days; i++){
        this.addPerson(new MoveEvery7Days());
    }
  }
}
