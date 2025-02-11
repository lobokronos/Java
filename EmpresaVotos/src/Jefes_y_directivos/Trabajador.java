package Jefes_y_directivos;

public class Trabajador extends Persona {
    private String identificadorSueldo;

    public Trabajador(String nombre, String apellido, String dni,String identificadorSueldo) {
        super(nombre, apellido, dni);
        this.identificadorSueldo=identificadorSueldo;
    }


    @Override
    public void mostrarDatos() {
        System.out.println("El trabajador "+this.nombre+" "+this.apellido+" con DNI: "+this.dni+" pertenece al grupo de trabajo:"+this.identificadorSueldo);

    }
}
