/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Oct 5, 2017  
 */


// This class is part of Assignment Two.

public class Point {

	double x;
	double y;
	
	public static void main(String [] args) {
		
		Point p = new Point();
		Point q = new Point();
		
		// move them directly
		p.x = 2;
		p.y = 4;
		
		// 2.2 moveTo
		p.moveTo(3.0, 3.0);

		// 2.3 moveBy
		p.moveBy(3.0, 3.0);

		// Print
		System.out.print("point P: "); 
		p.print();
		System.out.print("point Q: "); 
		q.print();
		
		// 2.4 Euclidean distance
		System.out.println("Euclidean distance: " + p.euclideanDistance(q));

		// 2.5 Chebyshev distance
		System.out.println("Chebyshev distance: " + p.chebyshevDistance(q));
		
		// 2.6 Manhattan distance
		System.out.println("Manhattan distance: " + p.manhattanDistance(q));
	}
	
	// Member Methods
	public double manhattanDistance(Point target){
		double distX = Math.abs(this.x - target.x);
		double distY = Math.abs(this.y - target.y);
		return (distX + distY);
	}
	
	public double chebyshevDistance(Point target){
		double distX = Math.abs(this.x - target.x);
		double distY = Math.abs(this.y - target.y);
		return maxOfTwo(distX,distY);
	}
	
	public double euclideanDistance(Point target){
		return Math.sqrt( Math.pow((this.x - target.x), 2)  +  Math.pow((this.y - target.y),2));
	}
	
	public void moveBy(double shiftX, double shiftY){
		this.x = this.x + shiftX;
		this.y = this.y + shiftY;
	}
	
	public void moveTo(double newX, double newY){
		this.x = newX;
		this.y = newY;
	}
	
	public void print() {
		System.out.println("x:" + this.x + ", y:" + this.y);
	}
	
	private static double maxOfTwo(double a, double b) {
		return a > b ? a : b;
	}
}
