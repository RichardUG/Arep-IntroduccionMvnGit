package edu.escuelaing.arep;

import edu.escuelaing.arep.Calculadora.Calculadora;
import edu.escuelaing.arep.LinkedList.LinkList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

/**
 * Clase encargada de ejecutar el programa.
 * @author  Richard Santiago Urrea Garcia
 * @version 1.0.  (10 de Agosto del 2021)
 */
public class App 
{

    public static void main( String[] args ) {
        try {
            LinkList<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("Valores.txt"));
            double n;
            while ((sCadena = bf.readLine())!=null) {
                elementos = new LinkList<Double>();
                String[] lista = sCadena.split(" ");
                for (String elemento: lista){
                    n = Double.parseDouble(elemento);
                    elementos.add(n);
                }
                Calculadora(elementos);
            }
            bf.close();
        }catch (Exception  e){
            System.out.println("Se ha presentado un Error.");
        }

    }

    /**
     * Metodo encargado de obtener la media y la desviacion estandar de los datos ingresados.
     * @param elementos Elementos de la lista.
     */
    public static void Calculadora(LinkList<Double> elementos){
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        System.out.println("Media: " + media + ", Desviación Estándar: "+ desviacionEstandar);
    }
}
