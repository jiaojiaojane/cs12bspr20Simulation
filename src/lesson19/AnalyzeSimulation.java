package lesson19;

import java.util.Random;

public class AnalyzeSimulation {

	private int repetitions;
	private Country country;
	private Population population;
	private int numOfDays, numOfInfected, peakInfectedLevel;
	
	
	public AnalyzeSimulation(int repetitions, Population population, Country country) {
		this.repetitions = repetitions;
		this.population = population;
		this.country = country;
		this.numOfDays = this.numOfInfected = peakInfectedLevel = 0;
	}
	
	public void stimulate() {
		for(int i = 0; i < this.repetitions; i++) {
			int days = 0;
			int infected = 0;
			int maximum = 0;
			while(country.numInfected >= 0) {
				country.simulateOneStep();
				if(maximum < country.numInfected - infected) {
					maximum = country.numInfected - infected;
				}
				if(infected < country.numInfected) {
					infected = country.numInfected;
				}
				days++;	
			}
			System.out.println("Repetition " + (repetitions + 1) + ": numOfDays = " + days + "  numOfInfected = "
					+ infected + "  peakInfectedLevel = " + maximum); 
			numOfDays = (numOfDays + days)/(repetitions + 1);
			numOfInfected = (numOfInfected + infected)/(repetitions + 1);
			peakInfectedLevel = (peakInfectedLevel + infected)/(repetitions + 1);
		}
		System.out.println("Average Result: numOfDays = " + numOfDays + "  numOfInfected = "
				+ numOfInfected + "  peakInfectedLevel = " + peakInfectedLevel); 
	}
}
