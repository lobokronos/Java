import java.util.Scanner;

/*Reto3: Realiza una calculadora de sueldo. para ello se deberán seguir la siguiente
        secuencia de acciones:
        a. El programa pedirá por consola al usuario que introduzca dos valores
        numéricos: el sueldo de un trabajador y su número de pagas.
        b. El programa calculará el sueldo bruto, sueldo bruto mensual, sueldo neto,
        sueldo neto anual, teniendo en cuenta que se aplica una retención del 0.15
        c. Finalmente se mostrarán por consola todos los resultados obtenidos*/

public class Main{

public static void main (String []args) {
    Scanner scanner = new Scanner (System.in);

    double sueldo, numeroPagas, brutomes, netomes, netoanno, irpf, retencionaplicada, calculoretencion;

    System.out.println( "Introduzca el sueldo: ");
    sueldo = scanner.nextDouble();
    System.out.println("Introduzca el numero de pagas al año: ");
    numeroPagas = scanner.nextDouble();
    retencionaplicada = 0.15;
    irpf = sueldo * retencionaplicada;
    netoanno= sueldo-irpf;
    brutomes= sueldo/numeroPagas;
    netomes= brutomes-(irpf/numeroPagas);

    System.out.printf("Sueldo bruto/año: \t\t\t\t%.2f\n", sueldo);
    System.out.printf("Sueldo neto/año (con 0,15 IRPF): %.2f\n", netoanno);
    System.out.printf("Sueldo bruto/mes: \t\t\t\t%.2f\n", brutomes);
    System.out.printf("Sueldo neto/mes (con 0,15 IRPF): %.2f\n", netomes);








}
 }