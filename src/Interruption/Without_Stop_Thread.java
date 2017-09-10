package Interruption;

public class Without_Stop_Thread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(300);
            System.out.println("task");
        } catch (InterruptedException e) {
            System.out.println("Exception handled " + e);
        }
        System.out.println("Thread is running");
    }

    public static void main(String args[]) {
        Without_Stop_Thread thread = new Without_Stop_Thread();

        thread.start();
        thread.interrupt();
    }
}
