
package javaapplication11;
public class JavaApplication11 {

   
    public static void main(String[] args) {
       
        Singleton s1 = Singleton.getInstance();
        System.out.println("s1 - " + s1.getX());
        
        Singleton s2 = Singleton.getInstance(10);//при этом добавлении может вызвать разные потоки
        System.out.println("s2 - " + s2.getX());
        
        if (s1 == s2) System.out.println("OK");
    }
    
}
