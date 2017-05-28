package Anonymous_With_Sync;

public class TestSynchronization {
    
    public static void main(String args[]) {
        Sync_List obj = new Sync_List();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                obj.printList(50);
            }
        };
        
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                obj.printList(100);
            }
        };
        
        thread1.start();
        thread2.start();
    }
}
