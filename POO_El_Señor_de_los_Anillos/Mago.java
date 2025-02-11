package POO_El_Señor_de_los_Anillos;

public class Mago extends Personaje{


    public Mago(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void habilidadEspecial() {

        System.out.println(this.nombre+" protege al resto con su bastón magico");

    }
}
