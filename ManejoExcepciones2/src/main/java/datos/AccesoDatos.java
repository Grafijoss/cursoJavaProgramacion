package datos;

import excepciones.*;

public interface AccesoDatos {

    int MAX_REGISTROS = 10; // todas las variables son constantes public static final

    void insertar() throws AccesoDatosEx; // Se agrega public y abstract por defecto
    
    void listar() throws AccesoDatosEx; // Se agrega public y abstract por defecto
    
    public abstract void simularError(boolean simularError);

}
