package POO_El_Señor_de_los_Anillos;

public class Hobbit extends Personaje{

    public Hobbit(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(this.nombre+" posee la habilidad de esconderse a la perfeccion.");

    }
}
