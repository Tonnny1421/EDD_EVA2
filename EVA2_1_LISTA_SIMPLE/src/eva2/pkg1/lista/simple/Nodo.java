package eva2.pkg1.lista.simple;

/**
 *
 * @author emiliomurillo
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
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
    
    
}