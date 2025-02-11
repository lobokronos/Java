public class EntradaCarrera {
    public static void main(String[] args) {

        int etapa = 100000;
        int random=(int) (Math.random() * 21);


        Coche c1 = new Coche("Audi", "7780-BVK", 168);
        Coche c2 = new Coche("Ferrari", "2204-XLM", 200);
        Coche cocheGanador = new Coche();

        System.out.println("#### EMPIEZA LA CARRERA ####\n");
        do {
            c1.acelerar(random);
            c2.acelerar(random);

        } while (c1.getKm() < etapa && c2.getKm() < etapa);

        System.out.println(c1.mostrarDatos());
        System.out.println(c2.mostrarDatos());

        System.out.println("\n### META ####\n");
        if (c1.getKm() > c2.getKm()) {
            cocheGanador = c1;
            System.out.println("El coche ganador es: " + cocheGanador.getModelo() + " con matrícula " + cocheGanador.getMatricula());

        } else if (c2.getKm() > c1.getKm()) {
            cocheGanador = c2;
            System.out.println("El coche ganador es: " + cocheGanador.getModelo() + " con matrícula " + cocheGanador.getMatricula());

        } else if (c2.getKm() == c1.getKm()) {
            System.out.println("Empate");
        }
    }
}
