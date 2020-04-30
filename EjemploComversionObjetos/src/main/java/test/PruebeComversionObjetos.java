package test;

import ejemplocomversionesobjetos.*;

public class PruebeComversionObjetos {

    public static void main(String[] args) {
        Empleado empleado; // Empleado es la clase padre
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO); // Apuntamos a un tipo de menor jerarqua
        System.out.println(empleado.obtenerDetalles()); // Solo podemos llamar metoodos en comun entre la clase empleado y escitor
        
        Escritor escritor = (Escritor) empleado; // Creamos una nueva variable escritor y hacemos una comversion a Escritor
        System.out.println(escritor.getTipoDeEscrituraEnTexto());
        System.out.println(((Escritor) empleado).getTipoDeEscrituraEnTexto()); // Hacemos la comversion sin crear la variable escritor
        
        empleado = new Gerente("Gerente nombre", 15000, "Sistemas");
        System.out.println(((Gerente) empleado).getDepartamento());
                
        
    }
}
