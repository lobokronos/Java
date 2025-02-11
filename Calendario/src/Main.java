import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calendar c= new GregorianCalendar();

        //Inicializa el mes a un valor no valido para forzar la entrada en el bucle while
        int mes=-1;
        int anio=0;

        //Pregunta por el mes mientras no sea valido
        while(mes<0 || mes>11) {
            System.out.println("introduce un mes valido");
            mes = scanner.nextInt() - 1;
        }

        //Pregunta por el año
        System.out.println("introduce el año");
        anio=scanner.nextInt();

        //Genera el calendario a partir de la clase utilizando los valores de mes y año introducidos, teniendo en cuenta el dia 1
        GregorianCalendar gCal = new GregorianCalendar(anio,mes,1);

        //Calcula el dia de la semana en la que empieza el mes. El valor 1 es el domingo
        int diaDeLaSemana= gCal.get(Calendar.DAY_OF_WEEK);
        //Calcula el maximo de las semanas que tiene el mes, la primera semana es 0 (zero-based)
        int semanasTotal=gCal.getActualMaximum(Calendar.WEEK_OF_MONTH);
        //Calcula el maximo dia del mes
        int diasTotal=gCal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("total dias: " + diasTotal);
        //Crea el array de la primera linea del calendario donde se imprimen los nombre de los dias
        String [] dias= {"D","L","M","X","J","V","S"};

        //Se utiliza para imprimir el numero del dia del mes hasta el dia maximo
        int count=1;

        //Comienza el bucle para imprimir el calendario. El valor de i es el numero de la fila
        //Se le suman 3 por lo siguiente:
        // 1. En semanasTotal la primera semana devuelta es la semana 0
        // 2. La primera fila contiene los nombres de los dias
        // 3. La semana empieza en domingo en lugar de lunes, por lo que se debe contar una semana mas
        for(int i=1;i<=semanasTotal+3;i++){
            if(i==1) { //Si es la primera fila, se imprimen los nombres de los dias
                ImprimirTitulo(dias);
            }else { //Para el resto de filas se imprime los numeros de los dias correspondientes
                for (int j = 1; j <= 7; j++) { //Recorre las columnas que son 7 (7 dias de la semana)
                    if(i==2){ //En la segunda fila se calcula cuando empieza la impresion de los numeros de los dias
                        if(j<diaDeLaSemana){ //diaDeLaSemana contiene el nombre del dia de la semana en la que empieza el mes, por lo tanto imprime tabulaciones hasta que llega el dia 1
                            System.out.print("\t");
                        }else{ //Aqui empieza el dia uno y el resto de dias de la primera semana (fila 2)
                            System.out.print("\t"+count);
                            count ++;
                        }

                    }else { //El resto de dias. diasTotal contiene el ultimo dia del mes y si count (numero del dia que se esta imprimiendo) es mayor, no se imprime nada mas
                        if(count<=diasTotal) {
                            System.out.print("\t" + count);
                            count++;
                        }
                    }
                }
                System.out.println(); //Importante hacer el salto de linea al final de la semana
            }
        }
    }

    static void ImprimirTitulo(String[] titulo)
    {
        for(int x= 0;x<titulo.length;x++)
        {
            System.out.print("\t"+titulo[x]);
        }
        System.out.println();
    }
}