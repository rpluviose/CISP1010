import java.util.Scanner;
public class BmiSelection 
{
    public static void main(String[] args)
    {
        System.out.print("Enter weight in pounds:");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.print("Enter height in inches:");
        double height = input.nextDouble();
        
        double bmi = ((weight * 703) /(height * height));
        System.out.printf("Your bmi is %5.2f\n", bmi);
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
    }
}
