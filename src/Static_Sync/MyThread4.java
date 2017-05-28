package Static_Sync;

public class MyThread4 extends Thread {

    @Override
    public void run() {
        Table.printTable(20);
    }
}
