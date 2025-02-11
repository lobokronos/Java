package Jefes_y_directivos;



import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String, Persona> personajes = new HashMap<>();

        personajes.put("Asalariado", new Asalariado("Juan", "Martin", "50995232T", "g33", 4));
        personajes.put("Autonomo", new Autonomo("Julio", "Cesar", "77889456Y", "g45", 32));
        personajes.put("Jefe", new Jefe("Alfonso", "Guerra", "41225687M", "t50", 4));
        personajes.put("Directivo", new Directivo("Pepe", "Directin", "32557894J", 21));


        personajes.forEach((nombre, Persona) ->
                Persona.mostrarDatos());


        if (personajes.containsKey("Jefe")) {
            personajes.get("Jefe").mostrarDatos();

        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        Jefe j1 = new Jefe("Ali", "baba", "54789965R", "65h", 32);
        Directivo d1 = new Directivo("Fernando", "Casimirez", "544497852S", 63);

        j1.mostrarDatos();
        d1.mostrarDatos();

        j1.emitirVoto();
        d1.emitirVoto();

    }
}