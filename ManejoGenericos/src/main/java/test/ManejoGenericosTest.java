package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoIString = new ClaseGenerica("Prueba");
        objetoIString.obtenerTipo();
        
        // No es posible usar tipo primitivos
    }
}
