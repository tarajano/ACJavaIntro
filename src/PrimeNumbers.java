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
	
	public void generatePrimes(){
		primes[0] = 2;
		
		for(int nextPrimeIndex = 1; nextPrimeIndex < numberOfPrimes; nextPrimeIndex++){
			int lastPrime = primes[nextPrimeIndex - 1];
			int testNumber = lastPrime + 1;
			
			while(!isPrime(testNumber)){
				testNumber++;
			}
			primes[nextPrimeIndex] = testNumber;
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
	

}
