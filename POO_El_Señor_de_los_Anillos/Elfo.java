package POO_El_Señor_de_los_Anillos;

public class Elfo extends Personaje{

    public Elfo(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void habilidadEspecial() {

        System.out.println(this.nombre+" posee una gran punteria con el arco");

    }
}
