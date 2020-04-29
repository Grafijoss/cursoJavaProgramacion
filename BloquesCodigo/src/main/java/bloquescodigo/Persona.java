package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion de codigo static
    static{
        contadorPersonas = 10;
        //No podemos utilizar variables NO estaticas dentro del bloque static
        //idPersona = 2;
        System.out.println("Ejecucion bloque estatico");
    }
    
    //Bloque NO estatico se copia a cada objeto
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = ++contadorPersonas;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
}
