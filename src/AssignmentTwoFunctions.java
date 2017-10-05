
/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Oct 5, 2017  
 */
public class AssignmentTwoFunctions {

	// Functions 
	
	// 1.2 cubeOfInt()
	public static int cubeOfInt(int n) {
		return n * n * n;
	} 
	
	// 1.3 maxOfTwo()
	public static int maxOfTwo(int a, int b) {
		return a > b ? a : b;
	}
	
	// 1.4 maxOfThree()
	public static int maxOfThree(int a, int b, int c) {
		int x = maxOfTwo(a, b);
		return x > c ? x : c;
	}
	
	// 1.5 maxOfFour()
	public static int maxOfFour(int a, int b, int c, int d) {
		int x = maxOfTwo(a, b);
		int y = maxOfTwo(c, d);
		return x > y ? x : y;
	}
	
	// 1.6 averageOfFour()
	public static double averageOfFour(double a, double b, double c, double d) {
		return (a+b+c+d)/4;
	}	
	
	// TODO 1.7 cuadraticRoot()
	public static double cuadraticRoot(int a, int b, int c) {
		return ( (-1 * b) + Math.sqrt( (b * b) - (4 * a * c) ) ) / (2 * a);
	}
	
	// 1.8 story()
	public static void story(String a, String b) {
		int min = 0;
		int max = 2;
		int randomNum = min + (int)(Math.random() * ((max - min) + 1));
		
		if ( randomNum == 0) {
			System.out.printf("%s and %s always enjoy their walk to the park on Saturday mornings.\n", a, b);
		} else if (randomNum == 1) {
			System.out.printf("The quick brown %s jumps over the lazy %s.\n", a, b);
		} else {
			System.out.printf("%s and %s climbed up the water spout.\n", a, b);
		}
	}
	
	// 1.9 knockJoke()
	public static void knockJoke(String name, String punchLine) {
		System.out.printf("Knock Knock\n");
		System.out.printf("Who's there?\n");
		System.out.printf("%s\n", name);
		System.out.printf("%s who?\n", name);
		System.out.printf("%s\n", punchLine);
	}
	
	
	// Main
	public static void main(String[] args) {
		
		// 1.2 
		System.out.println("1.2 cubeOfInt(3): " + cubeOfInt(3));

		// 1.3
		System.out.println("1.3 maxOfTwo(2,6): " + maxOfTwo(2,6));
		
		// 1.4
		System.out.println("1.4 maxOfThree(25,16,6): " + maxOfThree(25,16,6));
		
		// 1.5
		System.out.println("1.5 maxOfFour(2225,162,622,56): " + maxOfFour(2225,162,622,56));
		
		// 1.6
		System.out.println("1.6 averageOfFour(1,2,3,4): " + averageOfFour(1,2,3,4));

		// 1.7 
		System.out.println("1.7 cuadraticRoot(2,-4,0): " + cuadraticRoot(2,-4,0));
		
		// 1.8 story()
		System.out.print("1.8 ");
		story("Gabriel", "Agnes");
		
		// 1.9 knockJoke()
		System.out.println("1.9 ");
		knockJoke("Doris","Doris open, so I thought I'd drop by.");
		
	}

}
