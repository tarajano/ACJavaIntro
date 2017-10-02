/*
 * Author: Manuel Alonso (tarajano@gmail.com) Sep 14, 2017
*/


public class Hybrid1 {

  public static void main(String[] args) {
    // declare and initialize a few variables
    String instructor = "David Lareau";
    String course = "CST8110";
    String hobby = "programming";
    int number_of_teeths = 28;
    double gpa = 3.98;
    double gpa_max = 4;
    
    // print a little story about our instructor
    System.out.println(instructor + " is my " + course + " teacher.");
    System.out.println("He likes " + hobby + ".");
    System.out.println("He has " + number_of_teeths + " teeths, " + (number_of_teeths / 2) + " on each level.");
    System.out.println("His grade point average in college was " + gpa + " out of " + gpa_max + ". What a nerd.");
    
    // marking:
    // 2 points if you remember to add newlines with printf.
    // 2 points if you print the String variables correctly.
    // 2 points if you print the int variables correctly.
    // 2 points if you print the double variables correctly.
    // 2 points if the output is exactly as the original program.
    System.out.printf("----\n");
    System.out.printf("%s is my %s teacher.\n", instructor, course);
    System.out.printf("He likes %s.\n", hobby);
    System.out.printf("He has %d teeths, %d on each level.\n", number_of_teeths, (number_of_teeths / 2));
    System.out.printf("His grade point average in college was %.2f out of %.2f. What a nerd.\n", gpa, gpa_max);
  }

}