package Without_Sync;

public class MyThread1 extends Thread {

    Unsync_Table t;
    
    public MyThread1(Unsync_Table t) {
        this.t = t;
    }
    
    @Override
    public void run() {
        t.printTable(50);
        
    }
}
