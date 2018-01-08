/**
 * 
 */
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;
/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Jan 7, 2018  
 */
public class GetTestUserInput {

	public GetTestUserInput() {
	}

	// general variables here
	private static final int MAXNUMB = 15000;
	private static int numberOfPrimes; 


	private static String getUserInput() {
		String userInput; 
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("How many primes do you want? ");
			userInput = scanner.next();
		} while (!isInputNumber(userInput));
		return userInput;
	}

	private static boolean isInputNumber(String userInput) { 
		if (NumberUtils.isCreatable(userInput))
			return true;
		return false;
	}

	private static boolean validateNumberOfPrimes(int pnumb){
		if (pnumb > 0 && pnumb <= MAXNUMB){
			return true;
		}
		return false;
	}

	private static int getIntFromUserInput(String userInput) {
		int pnum = 0;
		if (NumberUtils.isCreatable(userInput)) {
			pnum = (int) Math.round(Double.parseDouble(userInput)); 
		}
		return pnum;
	}

	public static void main (String [] args){
		System.out.println("Program developed by Manuel Alonso");

		// Get user input
		do {
			String userInput = getUserInput();
			// Parse input 
			numberOfPrimes = getIntFromUserInput(userInput);			
		} while (!validateNumberOfPrimes(numberOfPrimes));

		PrimeNumbers pn = new PrimeNumbers(numberOfPrimes);
		pn.generatePrimes();
		pn.printPrimes();
	}


}
