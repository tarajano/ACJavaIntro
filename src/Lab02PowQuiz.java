import java.util.Scanner;

/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Nov 21, 2017  
 */
public class Lab02PowQuiz {

	public static boolean isAnswerOK = true;
	public static int baseNumber = 2;
	public static int exponentNumber, powerNumber, userAnswerNumber;
	public static int userOKAnswers = 0;
	public static long timeStart, timeEnd;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		long timeStart = System.currentTimeMillis();
		
		do{
			int exponentNumber = getRandomIntInRange(0,12);
			int powerNumber = (int) Math.pow(baseNumber, exponentNumber);
			
			printQuiz(baseNumber, exponentNumber);
			userAnswerNumber = getUserAnswer();
			isAnswerOK = testUserAnswer(powerNumber, userAnswerNumber);
			
			// count user OK answers
			if(isAnswerOK)
				userOKAnswers += 1;
			
		}while(isAnswerOK);
		
		long timeEnd = System.currentTimeMillis();
		
		printUserScore(userOKAnswers);
		printUserComsumedTime(timeStart, timeEnd);

	}

	public static void printUserComsumedTime(long start, long end) {
		int timeSecs = (int) Math.round( (end - start) / 1000);
		System.out.printf("Time: %d seconds.\n", timeSecs);
		System.out.printf("Bye now.\n", timeSecs);
	}
	
	public static void printUserScore(int userOKAnswers) {
		System.out.printf("Correct answers: %d\n", userOKAnswers);
	}

	public static boolean testUserAnswer(int powerNumber, int userAnswerNumber){
		if(userAnswerNumber == powerNumber){
			System.out.println("  Correct!");
			return true;
		}else{
			System.out.printf("  Ups! The correct answer is: %d.\n", powerNumber);
			return false;
		}
	}
	
	public static int getUserAnswer() {
		int userAnswer;
		Scanner intScanner = new Scanner(System.in);
		
		do {
			
			System.out.print("  Let's try: ");
			
			while (!intScanner.hasNextInt()) {
				System.out.print("  Umm ... enter a whole positive number: ");
				intScanner.next();
			}
			
			userAnswer = intScanner.nextInt();
			
			if(userAnswer < 0)
				System.out.print("  Ups! Remember it must positive.");
			
		} while(userAnswer < 0);
		    
		return userAnswer;
	}
	
	public static void printQuiz(int base, int exponent) {
		System.out.printf("What is %d to the %d power?\n", base, exponent);
	}
	
	public static int getRandomIntInRange(int min, int max){
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	

}
