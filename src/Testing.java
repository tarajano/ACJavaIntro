import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

public class Testing {
	
	private static double balance = 100; 

	public static void main(String args[]) {
		
		String userInput = getUserInput();
		System.out.println(userInput);
		
	}
	
	private static void processUserInput(String userInput) {
		if(userInput.equals("?")){
		} else if (userInput.equals("~")) {
		} else if (NumberUtils.isCreatable(userInput)) {
		}
	}
	
	private static String getUserInput() {
		String userInput; 
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Your balance is: $" + balance);
			System.out.print("How much you want to bet? $: ");
			userInput = scanner.next();
		} while (!validateInput(userInput) ) ;
		return userInput;
	}
	
	private static boolean validateInput(String userInput) {
		boolean validInput = false;
		
		if(userInput.equals("?") || userInput.equals("~")) {
			validInput = true;
		} else if (NumberUtils.isCreatable(userInput)) {
			validInput = true;
		}
		
		return validInput;
	}
	
}
