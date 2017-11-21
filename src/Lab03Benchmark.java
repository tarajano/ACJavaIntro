/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Nov 21, 2017  
 */
public class Lab03Benchmark {
	public static long timeStart;
	public static long loopDurationMillisecs = 1000;
	
	public static void main(String[] args) {
		
		// Control empty loop
		timedEmptyLoop();
		
		// Math.pow(x,y) loop
		timedMathPowLoop();
		
		// cube(x) loop
		timedCubeLoop();
		
		// Control empty loop
		timedEmptyLoop();
	}
	
	public static void timedEmptyLoop() {
		int calls = 0;
		timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			calls += 1;
		}
		System.out.printf("Calls to empty loop: %d\n", calls);
	}
	
	public static void timedMathPowLoop() {
		int calls = 0;
		timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double res = Math.pow(4, 4);
			calls += 1;
		}
		System.out.printf("Calls to Math.pow(): %d\n", calls);
	}
	
	public static void timedCubeLoop() {
		int calls = 0;
		timeStart = System.currentTimeMillis();
		while ( System.currentTimeMillis() < timeStart + loopDurationMillisecs){
			double result = cube(4);
			double res = Math.pow(4, 4);
			calls += 1;
		}
		System.out.printf("Calls to cube():     %d\n", calls);
	}
	
	public static double cube (double n) {
		return n * n * n;
	}

}
