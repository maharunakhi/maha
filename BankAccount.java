package bankaccount;


public class BankAccount {
    private int account;
    private double balance;

    
    public BankAccount(int account, double balance) {
        this.account = account;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " units. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " units. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Cannot withdraw.");
        }
    }

 
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
      
        BankAccount account = new BankAccount(123456789, 1000.0);

        
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); 
    }
}