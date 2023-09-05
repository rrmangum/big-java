public class Balance
{
    public static void main(String[] args)
    {
        double balance = 10000.0; // Initial balance
        double monthlyWithdrawal = 500.0; // Monthly withdrawal amount
        double annualInterestRate = 0.06; // Annual interest rate (6 percent)
        double monthlyInterestRate = 0.005; // Monthly interest rate (0.5 percent)
        int years = 0; // Number of years
        
        while (balance > 0) {
            // Subtract monthly withdrawal
            balance -= monthlyWithdrawal;
            
            // Calculate monthly interest and add it to the balance
            balance += balance * monthlyInterestRate;
            
            // Increment years
            years++;
        }
        
        System.out.println("It takes " + years + " years for the account to be depleted.");
    }
}