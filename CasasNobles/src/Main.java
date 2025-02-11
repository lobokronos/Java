import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[]args) {

        HashMap<String, Personaje> personas = new HashMap<>();

        personas.put("Samurai", new Samurai("Hatsumoto", "samurai", "katana"));
        personas.put("Bushi", new Samurai("Hatate", "samurai", "wakizashi"));
        personas.put("Ninja", new Ninja("Ichigo", "ninja", "shuriken"));
        personas.put("Shinobi", new Ninja("Sasuke", "Ninja", "kunai"));
        personas.put("Shogun", new Shogun("Orochimaru", "Shogun", "abanico"));

        personas.forEach((clave,valor)->

                valor.accion());



        Scanner scanner = new Scanner(System.in);
        String imput;

        do {
            System.out.println("intreoduce un personaje: ");
            imput = scanner.next();
            if (personas.containsKey(imput)) {
                personas.get(imput).accion();
            } else {
                System.out.println("no existe ese personaje");
            }
        } while (!personas.containsKey(imput));
    }
}
