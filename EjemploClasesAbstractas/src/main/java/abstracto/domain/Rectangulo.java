package abstracto.domain;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        // Agregamos el comportamiento de la clase abstracta
        System.out.println("Here should printing: " + this.getClass().getSimpleName());
    }

}
