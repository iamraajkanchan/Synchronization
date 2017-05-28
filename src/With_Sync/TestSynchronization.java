package With_Sync;

public class TestSynchronization {

    public static void main(String args[]) {
        Sync_Table obj = new Sync_Table();

        MyThread1 thread1 = new MyThread1(obj);
        MyThread2 thread2 = new MyThread2(obj);

        thread1.start();
        thread2.start();
    }

}
