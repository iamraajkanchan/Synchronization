package Interruption;

public class Stop_Thread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted " + e);
        }
    }

    public static void main(String args[]) {
        Stop_Thread thread = new Stop_Thread();

        thread.start();

        try {
            thread.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled" + e);
        }
    }
}
