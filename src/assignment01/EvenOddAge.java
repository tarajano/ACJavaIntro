/**
 * 
 */
package assignment01;
import java.util.Scanner;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Sep 25, 2017  
 */
public class EvenOddAge {

	/**
	 * 
	 */
	public EvenOddAge() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		Integer age = myScanner.nextInt();
		myScanner.close();
		Integer evenOdd = age % 2;
		
		if ( evenOdd == 0) {
			System.out.printf("Interesting. Did you know that %d is an even number?\n", age);
		} else {
			System.out.printf("Cool. Did you know that %d is an odd number?\n", age);
		}
		
		
	}

}
