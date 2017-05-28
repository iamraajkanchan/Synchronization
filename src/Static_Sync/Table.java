package Static_Sync;

public class Table {

    // Note if you create a static method than only one object of this class can access this method
    synchronized static void printTable(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i * n);
        }
    }
}
