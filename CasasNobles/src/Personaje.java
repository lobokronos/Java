public class Personaje implements Accion{

    private String nombre;
    private String oficio;

   private String arma;

    public Personaje(String nombre, String oficio, String arma) {
        this.nombre = nombre;
        this.oficio = oficio;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void accion() {

    }
}
