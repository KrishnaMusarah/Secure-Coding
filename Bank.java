package Assignment1;
public class Bank {
    String account_type;
    double account_balance;

// Parameterized constructor
     public Bank(String account_type, double account_balance) {
          this.account_type = account_type;
          this.account_balance = account_balance;
     }
    // Method to deposit money
    public double deposit(double amount) {
        account_balance += amount;
        return account_balance;
    }

    // Method to withdraw money
    public double withdrawal(double amount) {
        if (amount <= account_balance) {
            account_balance -= amount;
            return account_balance;
        } else {
            System.out.println("Insufficient balance");
            return account_balance;
        }
    }
    // display method
    public void display() {
        System.out.println("The account type is " + account_type + " and the balance is " + account_balance);
    }

}