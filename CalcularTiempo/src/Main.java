import java.util.Scanner;

public class Main {

    //---------------------------------------------------------------------------------//
    // Reto1: Realiza un conversor de tiempo, para ello se deberán seguir la siguiente
    // secuencia de acciones:
    //   a. Se le pedirá al usuario introducir una cantidad numérica (que representará
    //      los segundo)
    //   b. el programa calculará las horas minutos y segundo correspondiente a la
    //      cantidad introducida
    //  c. La aplicación sacar por consola la cantidad de horas minutos y segundos
    //      calculado
    //----------------------------------------------------------------------------------//

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //Utilizamos el objeto scanner para qu el usuariopueda introducir posteriormente los segundos de la operación.

        int calculosegundos, calculominutos , segundos, minutos, horas;  //Declaramos las variables a utilizar

        System.out.println("Introduce el número de segundos a procesar: ");

        calculosegundos = scanner.nextInt();  //El usuario introducirá los segundos a partir de los cuales se hara el resto de la operación.
        calculominutos = calculosegundos/60; //La operacion saca los minutos a partir de la division de estos entre 60.
        segundos= calculosegundos%60;        //Aquí calculamos los segundos a partir del RESTO de la operacion anterior.
        horas= calculominutos/60;           //Calculamos las horas que hay dividiendo los minutos entre 60.
        minutos= calculominutos%60;         //Calculando el RESTO de la operacion anterior, sacamos los minutos.

        System.out.printf("El resultado del tiempo procesado es:\n"+horas+"horas\n"+minutos+"minutos\n"+segundos+"segundos");
        //Imprimimos el restulado final utilizando una concatenación con saltos de linea para mejorar el resultado visual.//


    }
}