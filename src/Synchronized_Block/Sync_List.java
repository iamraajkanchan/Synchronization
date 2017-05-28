package Synchronized_Block;

public class Sync_List {
    
    public void printList(int n) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(n * i);
            }
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
    
}
