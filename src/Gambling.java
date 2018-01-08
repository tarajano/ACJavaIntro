
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Dec 11, 2017  
 */
public class Gambling {
	
	private static int TRIPLET_DICE_WORTH = 3;
	private static int DUPLE_DICE_WORTH = 2;
	private static int REIMBURSE_DICE_WORTH = 10;
	
	private static double balance = 100;
	private static double addToBalance;
	private static double betBalance;
	private static int dice1;
	private static int dice2;
	private static int dice3;
	private static boolean validRound;

	public static void main(String[] args) {
		
		do {
			
			do {
				// Get user input 
				String userInput = getUserInput();
				// Parse input 
				betBalance = getBetBalanceFromUserInput(userInput, balance);			
			} while (!validateBetBalance(betBalance));

			if (!validateCurrentRound())
				break;
			
			// Rolling the dices
			rollDices();

			// Computing results of dice roll
			addToBalance = computeAmountAddBalance(betBalance);
			balance = balance + addToBalance;
		
		} while (validateNextRound()) ;
		
	}

	// helper methods
	private static boolean validateCurrentRound(){
		if (betBalance == 0) {
			System.out.printf("Your final balance is $%.2f\n", balance);
			System.out.println("Sorry to see you go.");
			return false;
		}
		return true;
	}
	
	private static boolean validateNextRound(){
		if (balance <= 0) { 
			System.out.printf("You have $%.2f left.\n", balance);
			System.out.println("Sorry. Not enough money to gamble.");
			return false;
		}
		return true;
	}
	
	private static boolean validateBetBalance(double betBalance){
		if (betBalance >= 0 && betBalance <= balance){
			System.out.printf("  You are going to gamble $%.2f in this round.\n", betBalance);
			return true;
		}
		return false;
	}
	
	private static double computeAmountAddBalance(double betBal){
		double addToBalance;
		
		if(dice1 == dice2 && dice2 == dice3){ 
			// Checking for triplet
			addToBalance = betBal * TRIPLET_DICE_WORTH;
		} else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3){
			// Checking for duple
			addToBalance = betBal * DUPLE_DICE_WORTH;
		} else if ( (dice1 + dice2 + dice3) > REIMBURSE_DICE_WORTH ){
			// Checking for reimbursement
			addToBalance = 0;
		} else {
			addToBalance = betBal * -1;
		}
		
		System.out.printf("  You made %.2f in this round.\n", addToBalance);
		
		return addToBalance;
	}
	
	private static void rollDices(){
		int min = 1;
		int max = 6;
		dice1 = getRandomInt(min, max);
		dice2 = getRandomInt(min, max);
		dice3 = getRandomInt(min, max);
		System.out.printf("  Dices: %d %d %d\n", dice1, dice2, dice3);
	}
	
	private static String getUserInput() {
		String userInput; 
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("Your balance is: $%.2f\n", balance);
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
	
	private static double getBetBalanceFromUserInput(String userInput, double balance) {
		double betBalance = -1;
		
		if(userInput.equals("?")) {
			// gets random betBalance
			 betBalance = getRandomDouble(1, balance);
		} else if (userInput.equals("~")) {
			// cheats the balance
			cheatBalance();
		} else if (NumberUtils.isCreatable(userInput)) {
			betBalance = Double.parseDouble(userInput); 
		}
		
		return betBalance;
	}

	private static double getRandomDouble(double min, double max){
		return min + (Math.random() * ((max - min) + 1));
	}
	
	private static int getRandomInt(int min, int max){
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	private static void cheatBalance(){
		// secretly cheats balance
		int balanceTopUp = 100;
		balance = balance + balanceTopUp;
	}

}
