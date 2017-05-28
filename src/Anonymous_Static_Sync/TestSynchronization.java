package Anonymous_Static_Sync;

public class TestSynchronization {

    public static void main(String args[]) throws Exception {
        Table obj = new Table();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                Table.printTable(5);
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                Table.printTable(10);
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                Table.printTable(15);
            }
        };

        Thread thread4 = new Thread() {
            @Override
            public void run() {
                Table.printTable(20);
            }
        };

        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.getMessage();
        }

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
