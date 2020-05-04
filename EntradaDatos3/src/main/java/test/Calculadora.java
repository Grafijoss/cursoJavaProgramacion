package test;

import java.util.*;
import static calculadora.Operaciones.sumar;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor: ");
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int b = scanner.nextInt();
        int resultado = sumar(a, b);
        System.out.println("El resultado de la suma es: " + resultado);
        
        
    }
}
