package Static_Sync;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        Table.printTable(10);
    }
}
