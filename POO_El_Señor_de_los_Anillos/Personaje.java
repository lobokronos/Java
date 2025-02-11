package POO_El_Señor_de_los_Anillos;

abstract class Personaje {
    protected String nombre;
    protected String raza;

    public Personaje(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public abstract void habilidadEspecial();
}
