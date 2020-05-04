package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        // elemento repetido si se agrega
        miLista.add(3);
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("uno");
        miSet.add("dos");
        miSet.add("tres");
       // Elemento duplicado nose a grega
        miSet.add("tres");
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Nombre1", "July");
        miMapa.put("Nombre2", "Juan");
        miMapa.put("Nombre3", "Jorge");
        // Elemento repetido reemplaza al valor agregado previamente
        miMapa.put("Nombre3", "Jorge");
        // Imprimimos las llaves
        imprimir(miMapa.keySet());
        // Imprimimos los valores
        imprimir(miMapa.values());
        // TRaer un valor con la llave
        System.out.println("Nombre3 : " + miMapa.get("Nombre1"));
        
        
        
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento : " + elemento);
        }
        System.out.println("");
    }
    
}
