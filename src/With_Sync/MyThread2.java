package With_Sync;

public class MyThread2 extends Thread {

    Sync_Table t;
    
    public MyThread2(Sync_Table t) {
        this.t = t;
    }
    
    @Override
    public void run() {
        t.printTable(100);
    }
}
