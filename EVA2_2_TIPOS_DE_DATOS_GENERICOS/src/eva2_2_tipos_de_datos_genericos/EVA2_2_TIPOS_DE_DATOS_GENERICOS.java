package eva2.pkg2.tipos.datos.genericos;

import java.util.LinkedList;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_2_TIPOS_DE_DATOS_GENERICOS {

    public static void main(String[] args) {
        LinkedList<String> miLista = new LinkedList<String>(); //Lista Enlazada
        //miLista.
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos<Integer>();
        miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenericos<T>{
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}