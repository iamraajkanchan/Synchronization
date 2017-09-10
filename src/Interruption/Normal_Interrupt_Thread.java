package Interruption;

public class Normal_Interrupt_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Normal_Interrupt_Thread thread = new Normal_Interrupt_Thread();

        thread.start();
        try {
            Thread.sleep(300);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Exception Handled " + e);
        }
    }

}
