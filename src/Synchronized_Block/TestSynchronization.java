package Synchronized_Block;
public class TestSynchronization
{
    public static void main(String args[]){
        
        Sync_List obj = new Sync_List();
        
        MyThread1 thread1 = new MyThread1(obj);
        MyThread2 thread2 = new MyThread2(obj);
        
        thread1.start();
        thread2.start();
    }
    
}
