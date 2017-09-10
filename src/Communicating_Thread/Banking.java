package Communicating_Thread;

public class Banking {

    int amount = 25000;

    synchronized void withdrawal(int amt) {
        System.out.println("Withdrawal will process in a second");
        if (this.amount < amt) {
            System.out.println("Sorry! You don't have sufficient balance to withdraw the amount.");
            try {
                wait();
            } catch (Exception e) {
                e.getMessage();
            }
        } 
            this.amount -= amt;
            System.out.println("The amount : " + amt + " has been debited from your account");
        
    }

    synchronized void deposit(int amt) {
        System.out.println("Deposit will process in a second");
        try {
            this.amount += amt;
            System.out.println("The amount : " + amt + " has been credited to your account");
            notify();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
