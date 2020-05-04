package test;

import java.io.*;

public class EntradaDatos1 {
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in); // InputStreamReader puede leer un solo caracter
        BufferedReader brInput = new BufferedReader(input); // BufferedReader puede leer una linea completa
        
        System.out.println("Introduce un dato");
        
        try {
            captura = brInput.readLine();
            System.out.println("Dato introducido: " + captura);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
