
package unidad2pgv;

import java.util.ArrayList;
import unidad2pgv.Clases.Raton;

public class Main {

    public static void main(String[] args) throws InterruptedException {
       
        Raton jerry = new Raton("Jerry",4);
        ArrayList <Thread.State> estadoHilo = new ArrayList<>();
        Thread h = new Thread(jerry);
        
        h.start();
        while (h.getState() != Thread.State.TERMINATED) {
            
            if (!estadoHilo.contains(h.getState())) {
            
                estadoHilo.add(h.getState());
                
            }
            
            try {
            
                Thread.sleep(50);
                
                
            }catch (InterruptedException e) {
            
                e.printStackTrace();
                
            }
            
            if (!estadoHilo.contains(h.getState())) {
            
                estadoHilo.add(h.getState());
                
            }
            
            for (Thread.State estado : estadoHilo) {
            
                System.out.println(estado);
                
            }
            
        }
    }
     
}
