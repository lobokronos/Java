package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClaseTest {

    @Test
    public void agregarAlumno_test() {
        GestorAlumnos g1 = new GestorAlumnos();
        g1.agregarAlumno("Raul");               //Agregamos un alumno.
        assertEquals("Raul", "Raul");    //Comprobamos que el alumno introducido coincide con el esperado.
        assertTrue(g1.buscarAlumno("Raul"));    //Comprobamos que el alumno se encuentra en ala lista.

        System.out.println(g1.obtenerListaAlumnos());
    }

    @Test
    public void eliminarAlumno_test() {
        GestorAlumnos g1 = new GestorAlumnos();
        g1.agregarAlumno("Juan");                //Agregamos un alumno nuevo.
        assertTrue(g1.buscarAlumno("Pepe"));     //Verificamos que el alumno nuevo se ha agregado a la lista.

        System.out.println(g1.obtenerListaAlumnos());


        g1.eliminarAlumno("Juan");               //Eliminamos este mismo alumno.
        assertFalse(g1.buscarAlumno("Juan"));    //Comprobamos que el alumno ha dejado de existir en la lista.

        System.out.println(g1.obtenerListaAlumnos());   //Imprimimos el resultado por pantalla para comprobarlo visualmente.
    }

    @Test
    public void cantidadAlumnos_test() {
        GestorAlumnos g1 = new GestorAlumnos();
        g1.agregarAlumno("Pepe");               //Agregamos alumno Pepe.
        g1.agregarAlumno("Lola");               //Agregamos alumna Lola.
        assertNotNull(g1);                             // Nos aseguramos de que la lista ya contenga valores (no este vacía).
        assertTrue(g1.buscarAlumno("Pepe"));    //Comprobamos que Pepe figura en la lista.
        assertTrue(g1.buscarAlumno("Lola"));    //Comprobamos que Lola figura en la lista.
        assertEquals(g1.cantidadAlumnos(), 2);   //Comprobamos que la lista contiene exáctamente 2 miembros.

        System.out.println(g1.cantidadAlumnos());       //Imprimimos el resultado por pantalla para comprobarlo visualmente.


        g1.eliminarAlumno("Lola");              //Borramos un nombre para comprobar que el numero de elementos de la lista desciende.
        assertFalse(g1.buscarAlumno("Lola"));   //Aseguramos que Lola ha dejado de existir en la lista.
        assertEquals(g1.cantidadAlumnos(), 1);   //Comprobamos que el numero de elementos de la lista ha descendido.

        System.out.println(g1.cantidadAlumnos());       //Imprimimos el resultado por pantalla para comprobarlo visualmente.
    }

    @Test
    public void buscarAlumno_test() {
        GestorAlumnos g1 = new GestorAlumnos();
        g1.agregarAlumno("Ruben");                //Agregamos el alumno Ruben.
        assertTrue(g1.buscarAlumno("Ruben"));     //Comprobamos que se encuentra en la lista. Debe aparecer True
        assertFalse(g1.buscarAlumno("Lola"));     //Comprobamos que otro alumno al azar no se encuentra en la lista. Debe aparecer False

        System.out.println(g1.buscarAlumno("Ruben"));   //Imprimimos el resultado por pantalla para comprobarlo visualmente.
        System.out.println(g1.buscarAlumno("Lola"));    //Imprimimos el resultado por pantalla para comprobarlo visualmente.
    }

    @Test
    public void obtenerListaAlumnos_test() {
        GestorAlumnos g1 = new GestorAlumnos();           //Creamos el objeto
        g1.agregarAlumno("Ruben");
        g1.agregarAlumno("Juan");               //Agregamos 3 alumnos
        g1.agregarAlumno("Maria");

        List<String> lista = g1.obtenerListaAlumnos();     //Creamos una lista y la igualamos al metodo obtenerListaAlumnos para que recoja los valores

        assertNotNull(lista);                           //Aseguramos que la lista no esta vacía y que ha guardado los valores

        assertTrue(g1.buscarAlumno("Ruben"));   //Comprobamos que Ruben se encuentra en la lista
        assertTrue(g1.buscarAlumno("Juan"));    //Comprobamos que Juan se encuentra en la lista
        assertTrue(g1.buscarAlumno("Maria"));   //Comprobamos que Maria se encuentra en la lista

        System.out.println(lista);                      //Impresion por pantalla del listado para ver los resultados.

    }
}
