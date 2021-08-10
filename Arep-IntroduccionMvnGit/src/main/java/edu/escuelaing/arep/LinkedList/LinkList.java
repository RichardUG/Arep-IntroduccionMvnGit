package edu.escuelaing.arep.LinkedList;

import java.util.Iterator;
/**
 * Clase encargada de crear Lista Enlazada para hacer los calculos necesarios.
 * @author  Richard Santiago Urrea Garcia
 * @version 1.0.  (10 de Agosto del 2021)
 */
public class LinkList<E> implements Iterable<E> {
    private Node<E> head = new Node<E>();
    private int size = 0;
    /**
     * Metodo encargado de agregar un nuevo nodo a la Lista.
     * @param node El nodo que se va a ingresar en la lista.
     * @return boolean
     */
    public boolean add(E node) {
        Node<E> here = new Node<E>(node);
        if (size == 0) {
            head.setPrior(here);
            head.setNext(here);
        } else {
            head.getNext().setNext(here);
            head.setNext(here);
        }
        size++;
        return true;
    }
    /**
     * Metodo encargado de obtener un elemento dentro de la Lista Enlazada.
     * @param index Indice del nodo que se quiere encontrar.
     * @return Retorna el dato del nodo solicitado.
     */
    public E get(int index) {
        if (index < 0 || index < size) {
            int pos = 0;
            Iterator<E> iterator = iterator();
            while (pos != index) {
                iterator.next();
                pos++;
            }
            return iterator.next();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * Metodo encargado de obtener el tamaño de la lista.
     * @return Retorna el tamaño de la lista.
     */
    public int getSize() {
        return size;
    }

    /**
     * Metodo encargado de el iterador que se movera entre los nodos.
     * @return Retorna el Iterador de la lista.
     */
    public Iterate<E> iterator()
    {
        return new Iterate<E>(head.getPrior());
    }
}