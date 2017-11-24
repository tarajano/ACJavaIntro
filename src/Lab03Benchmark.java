
import javax.swing.JOptionPane;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Nov 21, 2017  
 */
public class Lab03Benchmark {
	public static long loopDurationMillisecs = 1000;
	
	public static void main(String[] args) {
		
		// Call JOptionPane for Input Data of base and exponent
		boolean likesApple = JOptionPane.showConfirmDialog(null, "This program will do some exponentiations." +
																 "\n Are OK with that?",
							  "User Agreement", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		
		if(!likesApple) {
			System.out.printf("User agreement declined.\nBye bye.");
			System.exit(0);
		}
		
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base", 0.0));
		double exponent = Double.parseDouble(JOptionPane.showInputDialog("Exponent", 0.0));
		
		// Control empty loop
		timedEmptyLoop();
		
		// cube(x) loop
		timedCubeLoop(base);
		// square(x) loop
		timedSquareLoop(base);
		
		// Math.pow(x,y) loop
		timedMathPowLoop(base, exponent);
		
		// Math.pow(x,y) loop
		timedMathPowLoop(base, exponent);

	}
	
	public static void timedEmptyLoop() {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			calls++;
		}
		System.out.printf("%d calls to empty loop\n", calls);
	}
	
	public static void timedMathPowLoop(double base, double exponent) {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double res = Math.pow(base, exponent);
			calls += 1;
		}
		System.out.printf("%d calls to Math.pow(%.2f,%.2f)\n", calls, base, exponent);
	}
	
	public static void timedCubeLoop(double base) {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double result = cube(base);
			calls += 1;
		}
		System.out.printf("%d calls to cube(%.2f)\n", calls, base);
	}
	
	public static void timedSquareLoop(double base) {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double result = square(base);
			calls += 1;
		}
		System.out.printf("%d calls to square(%.2f)\n", calls, base);
	}
	
	public static double cube(double n) {
		return n * n * n;
	}
	
	public static double square(double n) {
		return n * n;
	}
}
