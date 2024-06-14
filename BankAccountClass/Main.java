
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        double bal;
        BankAccountDriver.testOne();
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount(5.00, 2.5);
        accounts[1] = new BankAccount(10.00, 1.0);
        accounts[2] = new BankAccount(5.00, 1.0);
        accounts[3] = new BankAccount (20.00, 3.0);
        accounts[4] = new BankAccount (25.00, 5.0);

        for(int i = 0; i < accounts.length;i++){
            System.out.println("balance:" + accounts[i].getBalance() + " interest rate: " + accounts[i].getInterestRate());//or balance,rate
        }
        for(int i = 0; i < accounts.length;i++){
            accounts[i].makeDeposit(5);
        }
        
        for(int i = 0; i < accounts.length;i++){
            bal = accounts[i].getBalance();
            sum = sum + bal;
        }
        System.out.println("Sum:" + sum);
    }
}
