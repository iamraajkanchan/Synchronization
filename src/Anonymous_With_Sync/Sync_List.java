package Anonymous_With_Sync;

public class Sync_List {

    synchronized void printList(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i * n);
        }
    }
}
