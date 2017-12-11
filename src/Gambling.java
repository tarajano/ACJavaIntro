
import java.util.Scanner;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Dec 11, 2017  
 */
public class Gambling {
	
	private static int TRIPLE_DICE_WORTH = 3;
	private static int DOUBLE_DICE_WORTH = 2;
	
	private static double balance = 100;
	private static double addToBalance;
	private static double balanceBet = 10;
	private static int dice1;
	private static int dice2;
	private static int dice3;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String balanceInput = "";
		
		// Get user input 
		
		// Validate bet balance 
		validateBetBalance(balanceInput);
		
		// Rolling the dices
		rollDices();
		
		// Computing results of dice roll
		addToBalance = computeBetResult(balanceBet);
		balance = balance + addToBalance;
		
		// Check balance
		if (checkEnoughBalance()){
			// print and stay
		} else {
			// print and leave
		}
		

	}

	// helper methods
	
	private static boolean checkEnoughBalance(){
		if (balance > 0)
			return true;
		return false;
	}
	
	private static double computeBetResult(double betBal){
		double addToBalance;
		
		if(dice1 == dice2 && dice2 == dice3){
			addToBalance = betBal * TRIPLE_DICE_WORTH;
		} else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3){
			addToBalance = betBal * DOUBLE_DICE_WORTH;
		} else if ( (dice1 + dice2 + dice3) > 10 ){
			addToBalance = 0;
		} else {
			addToBalance = betBal * -1;
		}
		
		return addToBalance;
	}
	
	private static void rollDices(){
		int min = 1;
		int max = 6;
		dice1 = getRandomInt(1, 6);
		dice2 = getRandomInt(1, 6);
		dice3 = getRandomInt(1, 6);
	}
	
	private static String getUserInput(){
		return "";
	}
	
	private static double validateBetBalance(String balanceInput) {
		double balBet;
		
		if(balanceInput.equals("?")) {
			// get random balanceBet within balance range
			return getRandomInt(1, (int) Math.floor(balance));
		} else if (balanceInput.equals("~")) {
			// cheat balance and set balanceBet to 1.00
			cheatBalance();
			return 1.00;
		} else {
			// cast balanceBet string to double
			balBet = Double.parseDouble(balanceInput);
			
			// validate balanceBet within range 
		}
		
		return isValid;
	}

	private static int getRandomInt(int min, int max){
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	private static void cheatBalance(){
		// secretly cheats balance
		int balanceTopUp = 100;
		balance = balance + balanceTopUp;
		balanceBet = 1;
	}
	
	

}
