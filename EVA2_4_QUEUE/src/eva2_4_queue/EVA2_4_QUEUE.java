package eva2.pkg4.queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyQueue myQueue = new MyQueue();
        //FIFO --> FIRST IN, FIRST OUT
        myQueue.agregar(10); //Primero en llegar, primero en ser atendido
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50); //Último en llegar, último en ser atendiendo.
        System.out.println("Primer valor en llegar es " + myQueue.peek());
        myQueue.imprimir(); 
        try {
            System.out.println("Primer valor en llegar es " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA24QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }
    
}
// Add -> Al final de la lista
