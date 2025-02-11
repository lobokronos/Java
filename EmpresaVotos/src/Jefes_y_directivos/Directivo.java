package Jefes_y_directivos;

public class Directivo extends Persona implements Responsable{

private int porcentajeEmpresa;
    public Directivo(String nombre, String apellido, String dni, int porcentajeEmpresa) {
        super(nombre, apellido, dni);
        this.porcentajeEmpresa=porcentajeEmpresa;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El directivo "+this.nombre+" "+this.apellido+" con DNI: "+this.dni+" se lleva un porcentaje de la empresa del "+this.porcentajeEmpresa+"%");
    }

    @Override
    public void emitirVoto(){
        int voto=(int) (Math.random()*(5)+5);
        System.out.println("Voto del Directivo= "+voto);

    }
}
