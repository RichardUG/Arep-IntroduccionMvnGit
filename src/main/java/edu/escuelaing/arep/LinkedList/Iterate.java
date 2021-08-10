package edu.escuelaing.arep.LinkedList;
import java.util.Iterator;
/**
 * Clase encargada de manejar el Iterador para saltar entre nodos de la Lista Enlazada.
 * @author  Richard Santiago Urrea Garcia
 * @version 1.0.  (10 de Agosto del 2021)
 */
public class Iterate<E> implements Iterator<E> {
    public Node<E> current;
    /**
     * Constructor de la clase Iterador.
     * @param current Nodo en el que se encuentra el Iterador.
     */
    public Iterate(Node<E> current) {
        this.current = current;
    }
    /**
     * Metodo que verifica si el nodo usado esta vacio para dar señal de pasar al siguiente o no.
     * @return boolean
     */
    public boolean hasNext() {
        return current != null;
    }
    /**
     * Metodo encargado de extraer el valor del nodo en que se encuentra.
     * @return E Elemento.
     */
    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }
    public void remove() {}
}