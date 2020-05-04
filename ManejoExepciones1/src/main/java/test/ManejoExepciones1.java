package test;

import domain.Division;
import domain.OperacionExepcion;


public class ManejoExepciones1 {
    public static void main(String[] args) {
        
        try {
            Division divisiion = new Division(10,0);
        } catch (OperacionExepcion ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        System.out.println("El programa continua");
    }
}
