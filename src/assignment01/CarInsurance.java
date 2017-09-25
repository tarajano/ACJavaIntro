/**
 * 
 */
package assignment01;
import java.util.Scanner;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Sep 25, 2017  
 */
public class CarInsurance {

	/**
	 * 
	 */
	public CarInsurance() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Double maleBaseCost = 1000d;
		Double femaleBaseCost = 500d;
		Double otherBaseCost = 1000d;
		Double accidentCost = 100d;
		Double totalInsuranceCost = 0d;		
		
		Integer carAge = 0;
		Integer currentYear = 2017;
		String gender = "";
		Integer carYear = 0;
		Integer accidents = 0;
		Double costIncrease = 0d;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter your gender (female|male|other): ");
		gender = myScanner.nextLine();
		System.out.print("Enter number of accidents last year: ");
		accidents = myScanner.nextInt();
		System.out.print("Enter car year: ");
		carYear = myScanner.nextInt();
		myScanner.close();
		
		// Computing car age.
		carAge = currentYear - carYear;
		
		// Computing cost increase for accidents.
		costIncrease = accidentCost * accidents;
		
		// Computing gender-associated cost.
		if(gender.equals("female")) {
			totalInsuranceCost = femaleBaseCost;
		} else if(gender.equals("male")) {
			totalInsuranceCost = maleBaseCost;
		} else {
			totalInsuranceCost = otherBaseCost;
		}
		// Computing accident-associated cost.
		if (costIncrease > 0) {
			totalInsuranceCost = totalInsuranceCost + costIncrease;
		}
		//  Computing car age-associated cost.		
		if (carAge > 10) {
			totalInsuranceCost = totalInsuranceCost / 2;
		}
		
		// Printing insurance cost.
//		You are a male.
//		Base cost is $1000
//		You've had 0 accidents. Increase is $0.
//		Your car is 8 years old.
//		Still recent. No rebate.
//		Your insurance cost will be $1000.
		System.out.format("Your gender is: %s\n", gender);
		
		if(gender.equals("female")) {
			System.out.format("Your base cost is: $%.2f.\n", femaleBaseCost);
		} else if(gender.equals("male")) {
			System.out.format("Your base cost is: $%.2f.\n", maleBaseCost);
		} else {
			System.out.format("Your base cost is: $%.2f.\n", otherBaseCost);
		}
		
		System.out.format("You've had %d accidents. Increase is $%.2f.\n", accidents, costIncrease);
		
		if (carAge < 10) {
			System.out.format("You car is %d years old.\nStill recent. No rebate.\n", carAge);
		} else {
			System.out.format("You car is %d years old.\nThat's old. Your total cost will be halved.\n", carAge);
		}
		
		System.out.format("Your insurance cost will be $%.2f.\n", totalInsuranceCost);
		
	}

}
