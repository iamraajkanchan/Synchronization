package Anonymous_Static_Sync;

public class Table {

    synchronized static void printTable(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(n * i);
        }
    }
}
