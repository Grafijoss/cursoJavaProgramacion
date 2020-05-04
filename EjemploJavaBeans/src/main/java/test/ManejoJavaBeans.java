package test;

import beans.PersonaBean;

public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean personaBean = new PersonaBean();
        
        personaBean.setNombre("Claudia");
        personaBean.setEdad(23);
        
        System.out.println("Persona : Nombre = " + personaBean.getNombre() + ", Edad = " + personaBean.getEdad());
        
    }
}
