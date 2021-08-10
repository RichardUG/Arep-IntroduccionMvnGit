package edu.escuelaing.arep.Calculadora;

import  edu.escuelaing.arep.LinkedList.LinkList;
/**
 * Clase encargada de realizar los calculos como son la Media, Varianza y Desviacion Estandar partiendo de la Lista Enlazada.
 * @author  Richard Santiago Urrea Garcia
 * @version 1.0.  (10 de Agosto del 2021)
 */
public class Calculadora {
    /**
     * Metodo encargado de calcular la Media de los datos ingresados en el archivo de texto.
     * @param lista Lista Enlazada que se encarga de almacenar los valores ingresados en el archivo de texto.
     * @return Retorna la Media de los datos del archivo de texto.
     */
    public static double media(LinkList<Double> lista){
        double suma = 0;
        for(int i = 0; i < lista.getSize(); i++){
            suma += lista.get(i);
        }
        return suma / lista.getSize();
    }
    /**
     * Metodo encargado de calcular la Varianza de los datos ingresados en el archivo de texto.
     * @param lista Lista Enlazada que se encarga de almacenar los valores ingresados en el archivo de texto.
     * @return Retorna la Varianza de los datos del archivo de texto.
     */
    public static double varianza(LinkList<Double> lista){
        double media = media(lista);
        double suma_valores = 0;
        for(int i=0;i<lista.getSize();i++){
            suma_valores += Math.pow((lista.get(i)-media),2);
        }
        double res = (suma_valores)/(lista.getSize()-1);
        return res;
    }
    /**
     * Metodo encargado de calcular la Desviacion Estandar de los datos ingresados en el archivo de texto.
     * @param lista Lista Enlazada que se encarga de almacenar los valores ingresados en el archivo de texto.
     * @return Retorna la Desviacion Estandar de los datos del archivo de texto.
     */
    public static double desviacionEstandar(LinkList<Double> lista){
        double varianza = varianza(lista);
        double res = Math.sqrt(varianza);
        return res;
    }
}