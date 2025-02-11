package Jefes_y_directivos;

public class Asalariado extends Trabajador{

    private int numeroPagas;

    public Asalariado(String nombre, String apellido, String dni, String identificadorSueldo, int numeroPagas) {
        super(nombre, apellido, dni, identificadorSueldo);
        this.numeroPagas=numeroPagas;

    }
    @Override
    public void mostrarDatos(){
        System.out.println("El asalariado es un tipo de trabajador. Este tiene "+this.numeroPagas+" pagas al año");

    }
}
