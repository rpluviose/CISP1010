
/**
 *
 * @author ricardopluviose
 */

public class TestScoreTester {
    
    public static void main(String[] args){
        TestScores student1 = new TestScores(73, 100, 100);
        TestScores student2 = new TestScores(94,72,62);
        TestScores student3 = new TestScores(86, 86, 75);
        TestScores student4 = new TestScores(52, 74, 63);
        TestScores student5 = new TestScores(73, 83, 58);
        TestScores student6 = new TestScores(82, 100, 76);
        TestScores student7 = new TestScores(61, 63, 91);
        TestScores student8 = new TestScores(96, 100, 100);
        TestScores student9 = new TestScores(81, 52, 58);
        TestScores student10 = new TestScores(56, 67, 0);
        
   
    // Display the test results for student 1
       
        System.out.println("The student grade for test 1 is : " + student1.getTest1());
        System.out.println("Expected: 98");    
        
        System.out.println("The student grade for test 2 is : " + student1.getTest2());
        System.out.println("Expected: 85");   
        
        System.out.println("The student grade for test 3 is : " + student1.getTest3());
        System.out.println("Expected: 90");   
        
        //Display the letter grade  
    System.out.println("The letter grade for student 1 is " + student1.CalcGrade());
    System.out.println("The letter grade for student 2 is " + student2.CalcGrade());
    System.out.println("The letter grade for student 3 is " + student3.CalcGrade());
    System.out.println("The letter grade for student 4 is " + student4.CalcGrade());
    System.out.println("The letter grade for student 5 is " + student5.CalcGrade());        
    System.out.println("The letter grade for student 6 is " + student6.CalcGrade());
    System.out.println("The letter grade for student 7 is " + student7.CalcGrade());    
    System.out.println("The letter grade for student 8 is " + student8.CalcGrade());
    System.out.println("The letter grade for student 9 is " + student9.CalcGrade());
    System.out.println("The letter grade for student 10 is " + student10.CalcGrade());
    }
}