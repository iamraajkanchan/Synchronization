package Synchronized_Block;

public class MyThread2 extends Thread {

    Sync_List l;
    
    public MyThread2(Sync_List l) {
        this.l = l;
    }
    
    @Override
    public void run() {
        l.printList(100);
    }
    
}
