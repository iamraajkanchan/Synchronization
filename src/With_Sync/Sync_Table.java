package With_Sync;

public class Sync_Table {

    synchronized void printTable(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
        }
    }
}
