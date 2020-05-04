package test;

import java.util.*;

public class EntradaDatos {
    public static void main(String[] args) {
        String captura = null;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un dato:");
        captura = scanner.nextLine();
        while(!"salir".equals(captura)) {
            System.out.println("El dato ingresado es: " + captura);
            captura = scanner.nextLine();
        }
        
        
    }
}
