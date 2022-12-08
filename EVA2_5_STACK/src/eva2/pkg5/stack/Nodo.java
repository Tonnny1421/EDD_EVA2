package eva2.pkg4.queue;

/**
 *
 * @author emiliomurillo
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo previo;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public Nodo() {
        this.siguiente = null;
        this.previo = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
        
}
