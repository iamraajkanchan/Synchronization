package Communicating_Thread;

public class Customer {

    public static void main(String args[]) {
        Banking cust1 = new Banking();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                cust1.withdrawal(35000);
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                cust1.deposit(20000);
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        };
        
        thread1.start();
        thread2.start();
    }
}
