package POO_El_Señor_de_los_Anillos;

public class Humano extends Personaje{
    public Humano(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void habilidadEspecial() {

        System.out.println(this.nombre+" posee un corage inigualable en la batalla");
    }
}
