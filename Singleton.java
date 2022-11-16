
package javaapplication11;
public class Singleton {
    
    private volatile static Singleton instance = null;

    private int x;
    
    private Singleton(int x) {
        this.x = x;
    
}

    public synchronized static Singleton getInstance() {
        if (instance == null) instance = new Singleton(0);
        return instance;
    }
    
  public synchronized static Singleton getInstance(int x) {
        if (instance == null) instance = new Singleton(x);
        return instance;
    }

    public int getX() {
        return x;
    }
  
  
}
