package Jefes_y_directivos;

public class Autonomo extends Trabajador {

    private int cuotaSS;

    public Autonomo(String nombre, String apellido, String dni, String identificadorSueldo, int cuotaSS) {
        super(nombre, apellido, dni, identificadorSueldo);
        this.cuotaSS = cuotaSS;



    }
    @Override
    public void mostrarDatos () {
        System.out.println("El autonomo paga una cuota de SS de: "+this.cuotaSS);
    }
}