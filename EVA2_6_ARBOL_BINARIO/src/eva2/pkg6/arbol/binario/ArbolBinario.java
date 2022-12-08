/package eva2.pkg6.arbol.binario;

/**
 *
 * @author emiliomurillo
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario(Nodo root) {
        this.root = null;
    }

    ArbolBinario() {
    }
    
    //Méotdo público para el usuario
    public void agregar(int valor){
    //Que el nodo recibido es null -> Árbol vacío
    if(root == null)
        root = new Nodo(valor);
    else
        agregarRecur(valor, root);
    }
    
    //Méotdo recursivo agregar
    //Necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual){
        //Decidir si va a la izquierda o a la derecha
        /*
            Verificar si el lado (nodo) es null
            Si es null, ahí va el valor
            Si no
                Repetir recursión
        */
        Nodo nuevo = new Nodo(valor);
        if(valor < nodoActual.getValor()){ //Va a la izquierda
            if(nodoActual.getIzquierda() == null)
                nodoActual.setIzquierda(nuevo);
            else
                agregarRecur(valor, nodoActual.getIzquierda());
        }else if(valor > nodoActual.getValor()){//Va a la derecha
            if(nodoActual.getDerecha() == null)
                nodoActual.setDerecha(nuevo);
            else
                agregarRecur(valor, nodoActual.getDerecha());

        }else{//Igual
            System.out.println("¡Elemento repetido!");
        }
    }
    
    //Impresión de valores:
    //In order -> Izq, valor, der -> Método público
    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
    }
    //Método privado recursivo
    private void inOrderRecu(Nodo nodo){
        if(nodo != null){
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecha());
        }
    }
    //Pre order -> Valor, Izq, Der -> Método público
    public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
    //Método privado recursivo
    private void preOrderRecu(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.getValor() + " - ");
            preOrderRecu(nodo.getIzquierda());
            preOrderRecu(nodo.getDerecha());
        }
    }
    //Pos order -> Izq,  der, valor -> Método público
    public void posOrder(){
        posOrderRecu(root);
        System.out.println("");
    }
    //Método privado recursivo
    private void posOrderRecu(Nodo nodo){
        if(nodo != null){
            posOrderRecu(nodo.getIzquierda());
            posOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");
        }
    }
    
}