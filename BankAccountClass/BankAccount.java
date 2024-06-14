/**
 * Class for representing bank accounts.
 * @author Dr. Flatland
 * @version Spring 2024
 */

public class BankAccount {
    private double balance;
    private double rate; // balance of the account

    /**
    * Initializes a BankAccount object with 0.00 balance.
    */
    public BankAccount() {
        balance = 0.00;
        rate = 1.00;
    }

    /**
    * Initializes a BankAccount object with a starting
    * balance.
    *
    * @param initialBalance starting balance for account
    */
    public BankAccount(double initialBalance, double initialRate) {
        balance = initialBalance;
        rate = initialRate;
    }

    public BankAccount(double initialBalance){
        balance = initialBalance;
        rate = 1.00;
    }

    /**
    * Returns the account's balance.
    *
    * @return account's balance
    */
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return rate;
    }



    /**
    * Increases the account's balance by the deposit amount.
    *
    * @param amountToDeposit the amount to add to the balance
    */
    public void makeDeposit(double amountToDeposit) {
        balance = balance + amountToDeposit;
    }

    /**
    * Decreases the account's balance by the withdrawal amount.
    *
    * @param amountToWithdraw the amount to subtract from the balance
    */
    public void makeWithdrawal(double amountToWithdraw) {
        balance = balance - amountToWithdraw;
    }

    public void setInterestRate(double newRate){
        rate = newRate; 
    }

    public double getEarnedInterest(){
        double amount = 0.00;
        amount = balance * (rate/100);
        return amount;
    }

    /**
    * Returns a String description of the account.
    *
    * @returns a String containing the labeled account's balance
    */
    public String toString() {
        return "Balance: " + balance;
    }
}
