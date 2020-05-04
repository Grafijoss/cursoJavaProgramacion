package test;

import static utileria.Archivo.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\desarrollos\\Java\\archivosCreados\\archivoPruebaJava.txt"; // la carpeta ya debe estar creada
        
        // Creamos un archivo
        crearArchivo(nombreArchivo);
        
        // Escribir en el archivo
        escribirArchivo(nombreArchivo);
        
        // Leemos el archivo
        // leerArchivo(nombreArchivo);
        
        // Anexamos al archivo
        anexarArchivo(nombreArchivo);
        
        // Leemos el archivo
        leerArchivo(nombreArchivo);
    }
}
