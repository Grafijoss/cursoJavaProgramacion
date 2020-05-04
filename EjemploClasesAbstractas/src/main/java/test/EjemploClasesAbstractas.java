package test;

import abstracto.domain.*;

public class EjemploClasesAbstractas {
    public static void main(String[] args) {
        // Creamos los objetos
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println("rectangulo = " + rectangulo);
        rectangulo.dibujar();
        
        FiguraGeometrica triangulo = new Triangulo("triangulo");
        System.out.println("triangulo = " + triangulo);
        triangulo.dibujar();
        
        FiguraGeometrica circulo = new Circulo("circulo");
        System.out.println("circulo = " + circulo);
        circulo.dibujar();
        
    }
}
