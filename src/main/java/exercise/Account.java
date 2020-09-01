package exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String owner;
    private double balance;
    private int numberOfTransactions;

    /**
     * Try to deposit an amount from balance
     * @param amount, the amount to depoist
     * @return true if the actions is a success else false
     */
    public boolean deposit(double amount){
        if (amount <= 0) return false;
        this.balance += amount;
        return true;
    }

    /**
     *  Try to withdraw an amount from balance
     * @param amount, the amount to withdraw
     * @return  true if the actions is a success else false
     */
    public boolean withdraw(double amount){
        if ((amount < 0) || (amount > this.balance)) return false;
        this.balance -= amount;
        return true;
    }

    /**
     * Test methods deposit and withdraw
     */
    public void testMethods(){
        System.out.println("Test deposit and withdraw functions for account balance: " + this.balance);
        double testAmount = this.balance / 2;
        int i = 1;

        System.out.println("Test " + i);
        System.out.println("Account balance: " + this.balance);
        System.out.println("Try to deposit: " + testAmount);
        System.out.println("The result should be a success");
        if (deposit(testAmount)) System.out.println("You manage to deposit: " + testAmount);
        else System.out.println("Failed at deposing: " + testAmount);

        System.out.println(" ");
        i++;
        System.out.println("Test " + i);
        System.out.println("Account balance: " + this.balance);
        testAmount = this.balance * -1;
        System.out.println("Try to deposit: " + testAmount);
        System.out.println("The result should be a failure");
        if (deposit(testAmount)) System.out.println("You manage to deposit: " + testAmount);
        else System.out.println("Failed at deposing: " + testAmount);

        System.out.println(" ");
        i++;
        System.out.println("Test " + i);
        System.out.println("Account balance: " + this.balance);
        testAmount = this.balance / 2;
        System.out.println("Try to withdraw: " + testAmount);
        System.out.println("The result should be a success");
        if (withdraw(testAmount)) System.out.println("You manage to withdraw: " + testAmount);
        else System.out.println("Failed at withdrawing: " + testAmount);

        System.out.println(" ");
        i++;
        System.out.println("Test " + i);
        System.out.println("Account balance: " + this.balance);
        testAmount = this.balance * -1;
        System.out.println("Try to withdraw: " + testAmount);
        System.out.println("The result should be a failure");
        if (withdraw(testAmount)) System.out.println("You manage to withdraw: " + testAmount);
        else System.out.println("Failed at withdrawing: " + testAmount);

        System.out.println(" ");
        i++;
        System.out.println("Test " + i);
        System.out.println("Account balance: " + this.balance);
        testAmount = this.balance + 1;
        System.out.println("The result should be a failure");
        System.out.println("Try to withdraw: " + testAmount);
        if (withdraw(testAmount)) System.out.println("You manage to withdraw: " + testAmount);
        else System.out.println("Failed at withdrawing: " + testAmount);
    }
}
