package POO_El_Señor_de_los_Anillos;

import java.util.ArrayList;

public class Aventura {
    public static void main(String[]args){

        Hobbit hob1=new Hobbit("Frodo","Hobbit");
        Humano h1=new Humano("Aragorn","humano");
        Elfo e1=new Elfo("Legolas","elfo");
        Enano en1=new Enano("Gimly","enano");
        Mago m1=new Mago("Gandalf","mago");

        ArrayList<Personaje> comunidad=new ArrayList<>();
        comunidad.add(h1);
        comunidad.add(hob1);
        comunidad.add(e1);
        comunidad.add(en1);
        comunidad.add(m1);

        for(Personaje personaje:comunidad) {
            personaje.habilidadEspecial();

        }
        System.out.println("---------------------------------------");
        comunidad.remove(h1);

        for(Personaje personaje:comunidad){
            personaje.habilidadEspecial();
        }
    }
}
