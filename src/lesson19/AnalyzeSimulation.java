package lesson19;

public class AnalyzeSimulation {

	private int repetitions;
	private int numOfDays, numOfInfected, peakInfectedLevel;
	
	
	public AnalyzeSimulation(int repetitions) {
		this.repetitions = repetitions;
		this.numOfDays = this.numOfInfected = peakInfectedLevel = 0;
	}
	
	public void simulate() {
		for(int i = 0; i < this.repetitions; i++) {
			//population and country to be analyzed, can be modified with different parameters
			Population analyzePopulation = new MixedPopulation(20, 30, 20, 30, 20);
			analyzePopulation.createPeople();
			Country analyzeCountry = new Country(40, 20);
			analyzeCountry.population = analyzePopulation;
			analyzePopulation.placePeople(analyzeCountry);
			
			int days = 0;
			int prevInfected = 0;
			int maximum = 0;
			do {
				analyzeCountry.simulateOneStep();
				days++;
				//find the peak infected level between every two days
				if(maximum < analyzeCountry.numInfected - prevInfected) {
					maximum = analyzeCountry.numInfected - prevInfected;
				}
				//find the total number of infected in this simulation
				if(prevInfected < analyzeCountry.numInfected) {
					prevInfected = analyzeCountry.numInfected;
				}
			}
			while(analyzeCountry.numInfected != 0 );
			
			//result of each simulation 
			System.out.println("Repetition " + (i + 1) + ": numOfDays = " + days + "  numOfInfected = "
					+ prevInfected + "  peakInfectedLevel = " + maximum); 
			this.numOfDays += days;
			this.numOfInfected += prevInfected;
			this.peakInfectedLevel += maximum;
		}
		//average result of 100 simulations
		System.out.printf("%s%.0f%s%.0f%s%.0f", "Average Result: numOfDays = " , (double) numOfDays / this.repetitions, "  numOfInfected = ",
				 (double)numOfInfected / this.repetitions, "  peakInfectedLevel = ", (double)peakInfectedLevel / this.repetitions);
	}
}
