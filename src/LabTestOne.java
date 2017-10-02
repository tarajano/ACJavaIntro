
import java.util.Scanner;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Oct 2, 2017  
 */
public class LabTestOne {

	public static void main(String[] args) {
		
		// Input vars
		int age = 0;
		int income = 0;
		int beauty = 0;
		
		// Muster standards
		int ageMin = 18;
		int ageMax = 32;
		int incomeMin = 75000;
		int beautyMin = 8;
		
		// Declaring scanner variable
		Scanner myScanner = new Scanner(System.in);
		
		// Scanning input
		System.out.printf("How old are you? ");
		age = myScanner.nextInt();

		// Won't ask further if user age is off range.   
		if(age < ageMin || age > ageMax) {
			System.out.printf("Fail.");
			// Close scanner
			myScanner.close();
			return;
		}
		
		// If user is on age range keep on asking.
		System.out.printf("\nWhat is your yearly income? ");
		income = myScanner.nextInt();
		
		System.out.printf("\nOn a scale of 1 to 10, how attractive are you? ");
		beauty = myScanner.nextInt();
		
		// Close scanner
		myScanner.close();
		
		// Check if used is either rich or beautiful.
		if (income >= incomeMin || beauty >= beautyMin) {
			System.out.printf("Pass.");
		} else {
			System.out.printf("Fail.");
		}
	}

}
