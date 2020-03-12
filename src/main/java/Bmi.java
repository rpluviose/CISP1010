/*
**************************************
* @author Ricardo Pluviose 
* Date: 2/24/2020
* CISP 1010 Section: 02  
* Time 5:30 p.m. to 9:00 p.m.
* Assignment 1 Version 1
************************************** 
*/
//Problem: Calculate BMI given weight and height
import java.util.Scanner;
public class Bmi 
{
    public static void main(String[] args)
    {
        System.out.print("Enter weight in pounds:");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.print("Enter height in inches:");
        double height = input.nextDouble();
        
        double bmi = (weight/(height * height)*703);
        System.out.printf("Your bmi is %5.2f\n" , bmi);
        
   }
}
