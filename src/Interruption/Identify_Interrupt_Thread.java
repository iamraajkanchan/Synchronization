package Interruption;

public class Identify_Interrupt_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (Thread.interrupted()) {
                System.out.println("Code for interrupted thread: " + Thread.currentThread().getName());
            } else {
                System.out.println("Code for normal thread");
                System.out.print(Thread.currentThread().getName());
                System.out.println(" " +i);
            }
        }
    }

    public static void main(String argsp[]) {
        Identify_Interrupt_Thread thread1 = new Identify_Interrupt_Thread();
        Identify_Interrupt_Thread thread2 = new Identify_Interrupt_Thread();
        
        thread1.setName("Ivy Fernandes");
        thread2.setName("Raaj Kanchan");
        
        thread1.start();
        thread1.interrupt();

        thread2.start();
    }

}
