

import java.util.Scanner;

public class Lab2Part1 {

	
	static int days = 0;
	static int hours = 2;
	static int minutes = 42;
	static int seconds = 31;
	
	static int secsPerMins = 60;
	static int minsPerHour = 60;
	static int hoursPerDay = 24;
	static int secsPerHour = minsPerHour * secsPerMins;
	static int secsPerDay = hoursPerDay * secsPerHour;
	
	public static void main(String[] args) {
		
		// Converting HH::MM::SS <--> SS
		System.out.printf("Time passed -> hours: %d, minutes: %d, seconds: %d\n", hours, minutes, seconds);
		seconds = (hours * minsPerHour * secsPerMins) + (minutes * secsPerMins) + seconds;
		System.out.println("  In seconds -> " + seconds);
		hours = seconds / secsPerHour;
		minutes = (seconds % secsPerHour) / minsPerHour;
		seconds = seconds % secsPerMins;
		System.out.printf("Back to hours -> %02d::%02d::%02d\n", hours, minutes, seconds);
		
		// Scanning input from STDIN
		Scanner myScanner = new Scanner(System.in);
		System.out.printf("\n\nNumber of seconds (make it big): ");
		seconds = myScanner.nextInt();
		myScanner.close();
		// Converting SS --> DD::HH::MM::SS
		days = seconds / (secsPerHour * hoursPerDay);
		hours = (seconds % ( secsPerHour * hoursPerDay)) / secsPerHour;
		minutes = (seconds % secsPerHour) / minsPerHour;
		//seconds = (seconds % secsPerHour) % minsPerHour;
		seconds = seconds % secsPerMins;
		System.out.printf("days: %d, %02d::%02d::%02d\n", days, hours, minutes, seconds);	
	}

}
