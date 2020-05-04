package test;

import datos.AccesoDatos;
import datos.*;

public class ManejoInterfaces {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        
        datos = new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        
        System.out.println("Acceso a la constante de la interfaz = " + AccesoDatos.MAX_REGISTROS);
        
    }
    
    
}
