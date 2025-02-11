package Jefes_y_directivos;

public class Jefe extends Trabajador implements Responsable{
    private int nivelResponsabilidad;


    public Jefe(String nombre, String apellido, String dni, String identificadorSueldo,int nivelResponsabilidad) {
        super(nombre, apellido, dni, identificadorSueldo);
        this.nivelResponsabilidad=nivelResponsabilidad;
    }


    @Override
    public void mostrarDatos(){
        System.out.println("El jefe manda sobre los trabajadores. Tiene un nivel de responsabilidad de: "+this.nivelResponsabilidad);
    }

    @Override
    public void emitirVoto() {
        int voto=(int) (Math.random()*5)+1;
        System.out.println("Voto del Jefe= "+voto);
    }
}
