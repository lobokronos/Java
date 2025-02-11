package POO_El_Señor_de_los_Anillos;

public class Enano extends Personaje{

    public Enano(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void habilidadEspecial() {

        System.out.println(this.nombre+" Es muy habil con el hacha");

    }
}
