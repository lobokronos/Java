package POO_DNI;

import java.util.Scanner;

public class Nif {
    private int dni;
    private char letra;

    public Nif() {
    }

    public Nif(int dni) {
        this.dni = dni;
        letra=calcularletra();
    }


    public void leer() {
        Scanner scanner = new Scanner(System.in);
        dni = scanner.nextInt();
        letra = calcularletra();
    }

    private char calcularletra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni%23];
    }


    public String toString() {
        return this.dni+" - "+this.letra;
    }
}
