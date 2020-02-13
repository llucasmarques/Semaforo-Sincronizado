
package semafaro.sincronizado;

public class SemafaroSincronizado {

    public static void main(String[] args) {
        
        Thread t1 = new Thread(new SemafaroD());
        Thread t2 = new Thread (new SemafaroD());
        
        t1.start();
        t2.start();

    }
    
}
