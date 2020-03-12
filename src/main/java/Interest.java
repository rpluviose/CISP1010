import java.util.*;

// TheClassOfToday
public class Interest {
    public static void main(String[] args) {
        int year;
        double balance;
        //double interest_rate;   // interestRate
        int interest_rate;
        double interest;        // money obtained from the interest
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What year is it? Please enter year > 1000");
        year = scan.nextInt();
//        while(year < 1000) {
//            year = scan.nextInt();
//        }
        
        System.out.print("What is the starting balance? ");
        balance = scan.nextDouble();
        
        System.out.print("What is the expected interest rate? ");
        //interest_rate = scan.nextDouble();
        interest_rate = scan.nextInt();
        double decimal_interst = interest_rate/100.0; 
        
        System.out.println("Decimal Interst = " + decimal_interst);
        
        while(balance < 20000) {
            year++; // year = year + 1; year += 1
            interest = balance*decimal_interst;
            balance += interest;
            
            //System.out.println("Year = " + year + " Interest Earned = " + interest + " Balance = " + balance);
            System.out.printf("Year = %d Interest earned = %.2f Balance = %.2f\n", year, interest, balance);
        }
        
    }
;}