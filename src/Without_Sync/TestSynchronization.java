package Without_Sync;

public class TestSynchronization {

    public static void main(String args[]) {

        Unsync_Table t = new Unsync_Table();

        MyThread1 thread1 = new MyThread1(t);
        MyThread2 thread2 = new MyThread2(t);

        thread1.start();
        thread2.start();
    }
}
