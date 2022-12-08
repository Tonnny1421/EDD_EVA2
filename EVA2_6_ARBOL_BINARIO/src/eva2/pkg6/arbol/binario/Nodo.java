package eva2.pkg6.arbol.binario;

/**
 *
 * @author emiliomurillo
 */
public class Nodo {
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
        
}
