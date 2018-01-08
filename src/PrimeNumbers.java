import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.math3.primes.Primes;

/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Jan 7, 2018  
 */
public class PrimeNumbers {
	
	private static final int MAXNUMB = 15000;
	private static int numberOfPrimes; 
	private static int [] primes;
	
	public PrimeNumbers(int nop) {
		numberOfPrimes = nop;
		primes = new int[nop];
	}
	
	public void printPrimes(){
		String separator;
		for(int idx = 0; idx < numberOfPrimes; idx++){
			separator = idx < 9 ? ":  " : ": ";
			System.out.println( (idx + 1) + separator + primes[idx]);
		}
	}
	
	public void generatePrimes(){
		primes[0] = 2;
		
		for(int nextPrimeIdx = 1; nextPrimeIdx < numberOfPrimes; nextPrimeIdx++){
			int previousPrime = primes[nextPrimeIdx - 1];
			int currentNumber = previousPrime + 1;
		
			while(!isPrime(currentNumber))
				currentNumber++;
			primes[nextPrimeIdx] = currentNumber;
		}
	}
	
	private boolean isPrime(int n){
		
		// Call math3::Primes if input number is long
		if(n > 10000)
			return Primes.isPrime(n);
		
		// Dividing by all previous primes
		int idx = 0;
		while(idx < numberOfPrimes && primes[idx] != 0){
			if(n % primes[idx] == 0)
				return false;
			idx++;
		}
		return true;
	}

	
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
		if (pnumb > 0 && pnumb <= MAXNUMB)
			return true;
		return false;
	}
	
	private static int getIntFromUserInput(String userInput) {
		int pnum = 0;
		
		if (NumberUtils.isCreatable(userInput))
			pnum = (int) Math.round(Double.parseDouble(userInput)); 
		return pnum;
	}
	
	public static void main (String [] args){
		System.out.println("Program developed by Manuel Alonso");

		// Get user input
//		do {
//			String userInput = getUserInput();
//			// Parse input 
//			numberOfPrimes = getIntFromUserInput(userInput);			
//		} while (!validateNumberOfPrimes(numberOfPrimes));
		
		numberOfPrimes = 15000;
		PrimeNumbers pn = new PrimeNumbers(numberOfPrimes);
		
		pn.generatePrimes();
		
		pn.printPrimes();
	}
	

}
