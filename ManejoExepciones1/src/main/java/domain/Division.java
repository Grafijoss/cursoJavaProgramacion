package domain;

public class Division {

    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperacionExepcion {
        if (this.denominador == 0) {
            throw new OperacionExepcion("Denominador igual a 0");
        }
        
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void visualizarOperacion(){
        System.out.println("Eñ resultado de la division es : " + (this.numerador / this.denominador));
    }
}
