package Reentrant_Monitor;

public class Reentrant_Test {

    public static void main(String args[]) {
        Reentrant obj = new Reentrant();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                obj.m();
            }
        };

        thread1.start();
    }

}
