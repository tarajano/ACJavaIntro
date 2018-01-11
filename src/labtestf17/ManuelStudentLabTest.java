package labtestf17;
/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Jan 8, 2018  
 */
public class ManuelStudentLabTest {

	/**
	 * 
	 */
	public ManuelStudentLabTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemAnalysis testGrade  = new ItemAnalysis();
		
		System.out.println("\n--- Test2 Grades ---");
		testGrade.displayChart();
		
		System.out.println("\n--- Random Grades ---");
		testGrade.generateRandomGrades();
		testGrade.printRandomGrades();
		testGrade.displayChart();
		

	}

}
