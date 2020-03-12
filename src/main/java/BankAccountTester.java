public class BankAccountTester 
{
    public static void main(String[] args)
    {
        // create two BankAccount objects
        BankAccount first = new BankAccount(1000.0);
        
        
        // print initial balances
        System.out.printf("Initial balance : $ %.2f%n",first.getBalance());
        
       
        
       
        //deposit and withdraw
        first.deposit(500.00);        
        System.out.println("Initial balance is : $ " + first.getBalance());        
        first.withdraw(400.00);
        System.out.println("Initial balance is : $ " + first.getBalance());
        
}
}