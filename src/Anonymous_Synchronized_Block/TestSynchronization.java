package Anonymous_Synchronized_Block;

public class TestSynchronization {

    public static void main(String args[]) {
        Table obj = new Table();

        Thread thread1 = new Thread() {
            @Override
            public void run() { 
                obj.printTable(50);
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                obj.printTable(10);
            }
        };
        thread1.start();
        thread2.start();

    }

}
