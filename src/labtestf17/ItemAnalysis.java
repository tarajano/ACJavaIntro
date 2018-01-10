package labtestf17;
/**
 * 
 */

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Jan 8, 2018  
 */
public class ItemAnalysis {

	/**
	 * 
	 */
	//private final int MAXMARK = 100;
	private int[] items = {25,50,60,70,80,85,90,100};
	
	public ItemAnalysis() {
		System.out.println("Program developed by Manuel Alonso");
	}
	
	public void displayChart(){
		
		for (int i = 0; i < 100; i+=10){
		
			int marksCount = 0;
			
			for (int e = 0; e <= items.length - 1; e++){
				if(items[e] >= i && items[e] < i + 10)
					marksCount++;
				if(i == 90 && items[e] == 100)
					marksCount++;
			}
			
			if(i < 90)
				System.out.printf(" %02d-%02d: %s\n", i, i + 9, generateStars(marksCount));
			else 
				System.out.printf("%02d-%02d: %s\n", i, i + 10, generateStars(marksCount));
		}
	}
	
	private String generateStars(int numStars){
		String stars = "";
		for (int i = 0; i < numStars; i++) {
			stars = stars + "*";
		}
		return stars;
	}
	
	public void generateRandomGrades(){
		int numGrades = 8;
		int minGrade = 0;
		int maxGrade = 100;
		
		for (int n = 0; n < numGrades; n++)
			items[n] = getRandomInt(minGrade, maxGrade);
		
	}
	
	public void printRandomGrades(){
		java.util.Arrays.sort(items);
		String grades = "Random grades: ";
		for (int i = 0; i < items.length;i++){
			grades = grades + items[i] + " ";
		}
		System.out.println(grades);
	}
	
	private static int getRandomInt(int min, int max){
		return min + (int) (Math.random() * ((max - min) + 1));
	}

}
