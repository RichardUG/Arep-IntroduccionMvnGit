package edu.escuelaing.arep.LinkedList;



/**
 * Clase encargada de todos los nodos en los cuales se almacena la informacion.
 * @author  Richard Santiago Urrea Garcia
 * @version 1.0.  (10 de Agosto del 2021)
 */
public class Node<E> {
    private E data;
    private Node<E> next = null;
    private Node<E> prior = null;
    /**
     * Constructor de la clase Node.
     */
    public Node() {
    }
    /**
     * Metodo constructor de la clase Nodo.
     * @param data Parametro que ingresa la informacion que se va a almacenar en el nodo.
     */
    public Node(E data) {
        this.data = data;
    }
    /**
     * Metodo que obtiene la informacióm del nodo anterior.
     * @return Retorna el nodo anterior.
     */
    public Node<E> getPrior() {
        return prior;
    }
    /**
     * Metodo que se encarga de actualizar la información del nodo anterior.
     * @param prior nuevo nodo anterior.
     */
    public void setPrior(Node<E> prior) {
        this.prior = prior;
    }
    /**
     * Metodo que obtiene la información del nodo en el que nos encontramos.
     * @return Retorna los datos del nodo.
     */
    public E getData() {
        return data;
    }
    /***
     * Metodo encargado de actualizar la información del nodo actual.
     * @param data Representa el nuevo valor del nodo actual.
     */
    public void setData(E data) {
        this.data = data;
    }
    /**
     * Metodo encargado de actualizar la información del nodo siguiente.
     * @param next Representa el nuevo valor del nodo siguiente.
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
    /**
     * Metodo que obtiene la información del nodo siguiente.
     * @return Retorna el nodo siguiente.
     */
    public Node<E> getNext() {
        return next;
    }


}