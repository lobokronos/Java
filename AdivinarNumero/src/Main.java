import java.io.*;
import java.util.Scanner;

public class Main {

    /**
     * Reto 6. Realiza una aplicación de adivinación. Para ello se deberán seguir la
     * siguiente secuencia de acciones:
     * a. El sistema generará un número aleatorio (entre 0 y 20)
     * b. Seguidamente el sistema irá pidiendo números al usuario de forma
     * recurrente hasta que coincida con el aleatorio generado
     * c. En cada número introducido, en caso de no coincidir mostrará el mensaje
     * "Lo siento, inténtalo de nuevo". Cuando coincida el número introducido
     * con el que introduce el usuario deberá mostrar el mensaje "Enhorabuena,
     * has acertado el número en 5 intentos".
     * d. Cuando se adivine el número se deberá escribir en un fichero llamado
     * juego.txt el nombre del usuario y el número de intentos realizados con el
     * siguiente formato: nombre, intentos (Borja,6)
     */

    public static void main(String[] args) {
        System.out.println("\n***  Bienvenido al juego de adivinacion numérica  ***");
        System.out.println("Ultimo Record:");

        ultimoRecord(new File("Record.txt"));

        System.out.println("\nPor favor, introduce tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        System.out.println("Bienvenido " + nombre + ". ¡BUENA SUERTE!:");

        int numeroAleatorio = (int) (Math.random() * 21);
        int contador = 1;
        System.out.println("Introduce un numero para adivinar:");
        int intentos = scanner.nextInt();

        while (numeroAleatorio != intentos) {
            System.out.println("Incorrecto. Vuelve a introducir un numero:");
            intentos = scanner.nextInt();
            contador++;
        }

        System.out.println("¡Lo has adivinado! El numero de intentos ha sido de: " + contador);
        recordSuperado(new File("Record.txt"), contador);
    }

    public static void ultimoRecord(File f) {
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            String lectura;
            int record = 0;
            while ((lectura = br.readLine()) != null) {
                System.out.println(lectura);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void recordSuperado(File f, int intentosNuevo) {
        if (f.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String recordString = br.readLine();

                int record = Integer.valueOf(recordString);

                if (intentosNuevo < record) {
                    System.out.println("Enhorabuena, has superado el Record");
                    PrintWriter pw=new PrintWriter(f);
                    pw.println(intentosNuevo);
                    pw.close();
                } else {
                    System.out.println("No has superado el Record. El actual es: " + record);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("El contenido del archivo no es válido.");
            }
        }
        else {
            System.out.println("No se ha encontrado el fichero de records.");
        }

    }
}