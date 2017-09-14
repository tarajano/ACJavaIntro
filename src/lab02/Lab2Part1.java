package lab02;

public class Lab2Part1 {

	static int hours = 2;
	static int minutes = 42;
	static int seconds = 31;
	static int minsPerHour = 60;

	public static void main(String[] args) {
		
		System.out.printf("Time passed -> hours: %d, minutes: %d, seconds: %d\n", hours, minutes, seconds);
		int totalSeconds = (hours * minsPerHour * minsPerHour) + (minutes * minsPerHour) + seconds;
		System.out.println("  In seconds -> " + totalSeconds);
		
		hours = totalSeconds / 3600;
		minutes = (totalSeconds % 3600) / minsPerHour;
		seconds = (totalSeconds % 3600) % minsPerHour;
		
		System.out.printf("Back to hours -> hours: %d, minutes: %d, seconds: %d\n", hours, minutes, seconds);
	}

}
