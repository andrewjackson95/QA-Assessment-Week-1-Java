package main;

public class results {
	
	int physics = 0;
	int chemistry = 0;
	int biology = 0;
	int total = 0;
	double percentage = 0;
	double physicsPercentage = 0;
	double chemistryPercentage = 0;
	double biologyPercentage = 0;
		
	public int examResults(int physics, int chemistry, int biology) {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		
		physicsPercentage = (physics * 100) / 150;
		if (physicsPercentage < 60) {
			System.out.println("You have failed physics");
		}
		
		chemistryPercentage = (chemistry * 100) / 150;
		if (chemistryPercentage < 60) {
			System.out.println("You have failed chemistry");
		}
		
		biologyPercentage = (biology * 100) / 150;
		if (biologyPercentage < 60) {
			System.out.println("You have failed biology");
		}

		return total;
	}
	
	public double examPercentage() {
		percentage = (total * 100) / 450;
		double physicsPercentage = (physics * 100) / 150;
				
		if (physicsPercentage > 60) {
				
			if (percentage < 60) {
				System.out.println("Better luck next time");
			}
			else {
				System.out.println("Congratulations");
			}
			return percentage;
		}
		else {
			System.out.println("You have failed one or more of your exams so have failed overall");
		}
		return physicsPercentage;
	}
}
