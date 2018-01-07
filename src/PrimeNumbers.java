/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Jan 7, 2018  
 */
public class PrimeNumbers {

	private int numberOfPrimes; 
	private int [] primes;
	
	public PrimeNumbers(int nop) {
		numberOfPrimes = nop;
		primes = new int[nop];
	}
	
	public void printPrimes(){
		for(int idx = 1; idx < numberOfPrimes; idx++){
			System.out.println(primes[idx]);
		}
	}
	
	public void generatePrimes(){
		primes[0] = 2;
		
		for(int nextPrimeIdx = 1; nextPrimeIdx < numberOfPrimes; nextPrimeIdx++){
			
			int previousPrime = primes[nextPrimeIdx - 1];
			int currentNumber = previousPrime + 1;
			
			while(!isPrime(currentNumber)){
				currentNumber++;
			}
			primes[nextPrimeIdx] = currentNumber;
		}

	}
	
	private boolean isPrime(int n){
		int idx = 0;
		
		while(idx < numberOfPrimes && primes[idx] != 0){
			if(n % primes[idx] == 0)
				return false;
			idx++;
		}
		
		return true;
	}
	
	
	public static void main (String [] args){
		PrimeNumbers pn = new PrimeNumbers(10);
		pn.generatePrimes();
		pn.printPrimes();
	}
	

}
