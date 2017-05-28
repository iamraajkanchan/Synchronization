package Static_Sync;
public class TestSyncrhonization 
{
    public static void main(String[] args) 
    {
        Table obj = new Table();
        MyThread1 thread1 = new MyThread1(obj);
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
