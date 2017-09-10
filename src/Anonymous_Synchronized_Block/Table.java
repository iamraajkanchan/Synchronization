package Anonymous_Synchronized_Block;

public class Table {

    void printTable(int n) {

        synchronized (this) {
            for (int i = 1; i < 5; i++) {
                System.out.println(n * i);
            }
        }
    }

}
