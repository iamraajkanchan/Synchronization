package Synchronized_Block;

public class MyThread1 extends Thread {
    
    Sync_List l;
    
    public MyThread1(Sync_List l) {
        this.l = l;
    }
    
    @Override
    public void run() {
        l.printList(50);
    }
    
}
