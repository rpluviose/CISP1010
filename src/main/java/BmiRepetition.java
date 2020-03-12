import java.util.Scanner;
/*
**************************************
* @author Ricardo Pluviose 
* Date: 2/24/2020
* CISP 1010 Section: 02  
* Time 5:30 p.m. to 9:00 p.m.
* Assignment 1 Version 1
************************************** 
*/
public class BmiRepetition
{
    public static void main(String[] args)
    {
        int count = 0;
        while(count < 6)
        {
            System.out.print("Enter weight in pounds");
            Scanner input = new Scanner(System.in);
            double weight = input.nextDouble();

            System.out.print("Enter height in inches");
            double height = input.nextDouble();

            double bmi = (weight/(height * height))* 703;
            System.out.printf("Your bmi is %5.2f\n" , bmi);

            if(bmi < 16)
                    System.out.println("You are seriously underweight");
            else if(bmi < 18)
                System.out.println("You are underweight");
            else if(bmi < 24)
                System.out.println("You are normal weight");
            else if(bmi < 29)
                System.out.println("You are overweight");
            else if(bmi < 35)
                System.out.println("You are seriously overweight");
            else
                System.out.println("You are gravely overweight");
            count++;
        }
        System.out.println("Program ended. Out of Loop. Good Bye");
    }
}
