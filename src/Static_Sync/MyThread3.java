package Static_Sync;
public class MyThread3 extends Thread
{
    @Override
    public void run(){
        Table.printTable(15);
    }
}
