
package Reentrant_Monitor;
// To eliminate the possiblity of single thread deadlocking
public class Reentrant {
    
    public synchronized void m(){
        n();
        System.out.println("This is m() method");
    }
    public synchronized void n(){
        System.out.println("This is n() method");
    }

}
