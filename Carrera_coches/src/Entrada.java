public class Entrada {
    public static void main(String[] args) {

Coche c1=new Coche("aston martin","1234ABC",152);
Coche c2=new Coche();

        int random=(int) (Math.random() * 21);
        System.out.println("-----Primera inscripcion de coches (solo 1):");

        System.out.println(c1.mostrarDatos());
        System.out.println(c2.mostrarDatos());

        c1.setModelo("BMW");
        c1.setMatricula("0000AAA");
        c1.setCv(160);

        c2.setModelo("Nissan");
        c2.setMatricula("1111BBB");
        c2.setCv(142);
        System.out.println("\n-----Actualizacion de datos de los coches participantes:");

        System.out.println(c1.mostrarDatos());
        System.out.println(c2.mostrarDatos());

        System.out.println("\n-----Aceleracion");

c1.acelerar(random);
c2.acelerar(random);

        System.out.println(c1.mostrarDatos());
        System.out.println(c2.mostrarDatos());


        Coche cocheGanador=new Coche();

        if( c1.getKm()>c2.getKm()){
            cocheGanador=c1;
            System.out.println("El coche ganador es: "+cocheGanador.getModelo()+" con matrícula "+cocheGanador.getMatricula());
        }else if(c2.getKm()>c1.getKm()){
            cocheGanador=c2;
            System.out.println("El coche ganador es: "+cocheGanador.getModelo()+" con matrícula "+cocheGanador.getMatricula());
        }else if(c2.getKm()==c1.getKm()){
            System.out.println("Empate");
        }
    }
}

