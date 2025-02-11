import java.util.Scanner;

public class Main {

    //--------------------------------------------------------------------------------
    //Reto2: Realiza una calculadora de IVA. para ello se deberán seguir la siguiente
    // secuencia de acciones:
    //  a. Se pedirá al usuario que introduzca por consola un valor numérico (el
    //     precio de adquisición de un artículo (sin IVA)) y también se le pedirá que
    //     introduzca otro valor numérico (el IVA que se le ha aplicado).
    //  b. El sistema calculará el precio del producto tanto sin IVA como con él
    //  c. Finalmente se mostrarán ambos precios formateados.
    //--------------------------------------------------------------------------------



    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);                                //Activamos el objeto que nos permitira usar el scanner despues.


        System.out.printf(">INTRODUZCA EL PRECIO DEL ARTICULO:\t");
        double precioArticulo = scanner.nextDouble();
                                                                                //Campos para que el usuario introduzca los valores de Precio e Iva por teclado.
        System.out.printf(">INTRODUZCA LA CANTIDAD DE IVA: \t");
        double iva = scanner.nextDouble();

        System.out.println("----------------------------------------------");

        double preciosinIVA = precioArticulo;
        double calculoIva = precioArticulo* (iva/100);                          //Declaración de variables y sus valores correspondientes. Usaremos variables "double
        double precioconiva = precioArticulo + calculoIva;                      //para poder introducir numeros decimales.

        System.out.printf("PRECIO SIN IVA:\t\t\t\t\t\t %.2f\n", preciosinIVA);
        System.out.printf("IVA:\t\t\t\t\t\t\t\t %.2f\n", calculoIva);
        System.out.println("-------------");                                    //Cálculo total de los diferentes valores exigidos por el ejercicio con
        System.out.printf("PRECIO TOTAL:\t\t\t\t\t\t %.2f\n", precioconiva);    //tabulaciones y saltos de linea, asi como la peticion de formateo de so-
        System.out.println("-------------");                                    //lamente dos digitos en los decimales.
        System.out.println("Gracias por su compra.");




    }
}