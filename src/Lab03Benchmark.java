/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Nov 21, 2017  
 */
public class Lab03Benchmark {
	public static long loopDurationMillisecs = 1000;
	
	public static void main(String[] args) {
		
		// Control empty loop
		timedEmptyLoop();
		
		// Math.pow(x,y) loop
		timedMathPowLoop(3);
		
		// cube(x) loop
		timedCubeLoop(3);

		// Math.pow(x,y) loop
		timedMathPowLoop(2);
		
		// square(x) loop
		timedSquareLoop(2);
		
		// Control empty loop
		timedEmptyLoop();
	}
	
	public static void timedEmptyLoop() {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			calls += 1;
			calls = Math.abs(calls); // Nothing interesting here.
		}
		System.out.printf("Calls to empty loop: %d\n", calls);
	}
	
	public static void timedMathPowLoop(double var) {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double res = Math.pow(var, var);
			calls += 1;
		}
		System.out.printf("Calls to Math.pow(%.2f,%.2f): %d\n", var, var, calls);
	}
	
	public static void timedCubeLoop(double var) {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double result = cube(var);
			calls += 1;
		}
		System.out.printf("Calls to cube(%.2f):     %d\n", var, calls);
	}
	
	public static void timedSquareLoop(double var) {
		int calls = 0;
		long timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double result = square(var);
			calls += 1;
		}
		System.out.printf("Calls to square(%.2f):   %d\n", var, calls);
	}
	
	public static double cube(double n) {
		return n * n * n;
	}
	
	public static double square(double n) {
		return n * n;
	}
}
