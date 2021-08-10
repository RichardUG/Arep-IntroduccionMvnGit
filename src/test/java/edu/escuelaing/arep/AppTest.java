package edu.escuelaing.arep;

import edu.escuelaing.arep.Calculadora.Calculadora;
import edu.escuelaing.arep.LinkedList.LinkList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Clase encargada de realizar las pruebas unitarias.
 * @author  Richard Santiago Urrea Garcia
 * @version 1.0.  (10 de Agosto del 2021)
 */
public class AppTest {
    /**
     * Primer caso de prueba.
     */
    @Test
    public void Prueba1() {
        LinkList<Double> elementos = new LinkList<Double>();
        elementos.add(15.0);elementos.add(69.9);elementos.add(6.5);elementos.add(22.4);elementos.add(28.4);
        elementos.add(65.9);elementos.add(19.4);elementos.add(198.7);elementos.add(38.8);elementos.add(138.2);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(60.32000000000001,media,0.01);
        assertEquals(62.25583060601187,desviacionEstandar, 0.18);
    }
    /**
     * Segundo caso de prueba.
     */
    @Test
    public void Prueba2() {
        LinkList<Double> elementos = new LinkList<Double>();
        elementos.add(33.7);elementos.add(345.7);elementos.add(305.12);elementos.add(301.63);elementos.add(290.65);
        elementos.add(258.2);elementos.add(311.67);elementos.add(331.78);elementos.add(123.92);elementos.add(411.82);
        elementos.add(400.0);elementos.add(121.02);elementos.add(345.46);elementos.add(222.33);elementos.add(175.56);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(265.2373333333333 ,media,0.01);
        assertEquals(109.22241380822545,desviacionEstandar, 1.41);
    }
    /**
     * Tercer caso de prueba.
     */
    @Test
    public void Prueba3() {
        LinkList<Double> elementos = new LinkList<Double>();
        elementos.add(4.0);elementos.add(3.0);elementos.add(2.0);elementos.add(7.0);elementos.add(8.0);
        elementos.add(4.0);elementos.add(5.0);elementos.add(3.0);elementos.add(5.0);elementos.add(7.0);
        elementos.add(6.0);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(4.909091,media,0.01);
        assertEquals(1.831767,desviacionEstandar, 0.09);
    }

}