package With_Sync;

public class MyThread1 extends Thread {

    Sync_Table t;
    
    public MyThread1(Sync_Table t) {
        this.t = t;
    }
    
    @Override
    public void run() {
        t.printTable(50);
    }
}
