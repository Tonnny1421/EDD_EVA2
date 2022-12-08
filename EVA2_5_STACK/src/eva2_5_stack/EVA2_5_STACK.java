package eva2.pkg5.stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.imprimir();
        System.out.println("CIMA DE LA PILA: " + myStack.peek());
        myStack.imprimir();
        try {
            System.out.println("CIMA DE LA PILA: " + myStack.pop());
        } catch (Exception ex) {
            Logger.getLogger(EVA25STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        myStack.imprimir();
    }
}