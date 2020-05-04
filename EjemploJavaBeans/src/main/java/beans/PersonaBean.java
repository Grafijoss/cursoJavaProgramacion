package beans;

import java.io.Serializable; // Serializa la clase para enviarla por internet

public class PersonaBean implements Serializable{ // Serializable solo se usa si se va a comportir por internet
    
    private String nombre; // The variables should be private 
    private int edad; // The variables should be private 
    
    public PersonaBean(){ // Empty constructor is required
        
    }
    
    public PersonaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
