/**
 * This program can be used to test the BankAccount class.
 *
 * @author Dr. Flatland
 * @version Spring 2024
 */
public class BankAccountDriver
{
    /**
     * Uncomment this method when ready to test.
     */
    public static void testOne()
    {

        

        int score = 0;
        int maxScore = 0;

        //testing default constructor
        BankAccount acct = new BankAccount();
        if(acct.getBalance() == 0.00) {System.out.println("Passed test 1"); score++; }
        else {System.out.println("Failed test 1"); }
        if(acct.getInterestRate() == 1.0) {System.out.println("Passed test 2"); score++;}
        else {System.out.println("Failed test 2"); }
        maxScore += 2;

        //testing second constructor
        acct = new BankAccount(50.00);
        if(acct.getBalance() == 50.00) {System.out.println("Passed test 3"); score++; }
        else {System.out.println("Failed test 3"); }
        if(acct.getInterestRate() == 1.0) {System.out.println("Passed test 4"); score++;}
        else {System.out.println("Failed test 4"); }
        maxScore += 2;

        //testing third constructor
        acct = new BankAccount(100.00, 4.25);
        if(acct.getBalance() == 100.00) {System.out.println("Passed test 5"); score++; }
        else {System.out.println("Failed test 5"); }
        if(acct.getInterestRate() == 4.25) {System.out.println("Passed test 6"); score++;}
        else {System.out.println("Failed test 6"); }
        maxScore += 2;

        //testing setInterestRate
        acct = new BankAccount(200.00);
        acct.setInterestRate(3.00);
        if(acct.getInterestRate() == 3.00) {System.out.println("Passed test 7"); score++;}
        else {System.out.println("Failed test 7"); }
        maxScore += 1;

        //testing getEarnedInterest
        acct = new BankAccount(200.00, 4.25);
        if(acct.getEarnedInterest() == 200.0*4.25/100.0) {System.out.println("Passed test 8"); score++; }
        else {System.out.println("Failed test 8"); }
        if(acct.getInterestRate() == 4.25) {System.out.println("Passed test 9"); score++;}
        else {System.out.println("Failed test 9"); }
        maxScore += 2;

        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the testOne tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points on testOne.");
            System.out.println("You still have a little more work to do.  You can do it!");
        }

        

    }

    
}
