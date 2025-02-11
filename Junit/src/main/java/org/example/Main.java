package org.example;

public class Main {
    public static void main(String[] args) {

        GestorAlumnos g1 = new GestorAlumnos();

        g1.agregarAlumno("Raul");
        g1.eliminarAlumno("Raul");
        System.out.println(g1.obtenerListaAlumnos());

        System.out.println(g1.buscarAlumno("Raul"));

        System.out.println(g1.obtenerListaAlumnos());
        System.out.println(g1.cantidadAlumnos());

    }
}
