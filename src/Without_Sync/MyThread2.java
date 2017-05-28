package Without_Sync;

public class MyThread2 extends Thread {

    Unsync_Table t;
    
    public MyThread2(Unsync_Table t) {
        this.t = t;
    }
    
    @Override
    public void run() {
        t.printTable(100);
    }
}
