import java.util.Scanner;

// Written by David Lareau
// This program verifies if a given String is sorted or not.
//
// Lab4 Exercice: This program has three problems. Try fixing them using Eclipse.
// 1) Start by formatting the code (Ctrl-Shift-F).
// 2) Then fix the compilation error by resolving import (Ctrl-Shift-O).
// 3) Run the program, but notice it never ends (Run in the Debugger, so see where the problem is).
//    Hint: it's stuck in an infinite loop. Ensure the value of 'index' changes inside the loop.
// 4) Run the program again, and notice a crash (Click on the crash error line to see where it crashes).
//    Hint: If you re-run the program in debug mode, you will see that the loop advances, but goes too far.
//          Change the condition so that it doesn't overshoot.
// 5) Show your work, and discuss your thoughts with the teacher.
public class Lab4 {

	// Function that verifies if the given string is sorted (unicode char-wise).
	public static boolean isSorted(String text) {
		int index = 0;
		while (index < text.length() - 1) {		// 1) Found that index was not incremented (noticed from code behaviour, not debuger)
												// 2) Out of index StringIndexOutOfBoundsException
			char current = text.charAt(index);
			char next = text.charAt(index + 1);    
			if (current > next) {
				return false;
			}
			index++;
		}
		return true;
	}

	// Verbose utility that tests and reports to the user if a given String is
	// sorted.
	public static void test(String letters) {
		System.out.println("Is " + letters + " sorted?");
		boolean sorted = isSorted(letters);
		System.out.println(sorted);
	}

	public static void main(String[] args) {
		// Verify if a known sorted String is sorted
		test("abc");

		// Ask the user for letters
		System.out.println("Give me a sequence of character to verify:");
		Scanner scanner = new Scanner(System.in);
		test(scanner.next());

		System.out.println("Program Done");
	}

}
