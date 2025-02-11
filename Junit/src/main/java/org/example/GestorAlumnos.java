package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se utiliza para hacer la gestion del listado de alumnos.
 * Esta clase proporciona los metodos necesarios para agregar, quitar y
 * consultar alumnos de un listado.
 *
 * @version 1.0
 */
public class GestorAlumnos extends ArrayList<String> {
    /**
     * Atributo listaAlumnos de tipo "List". Guarda datos de tipo String
     */
    private List<String> listaAlumnos;

    /**
     * Constructor clase GestorAlumnos
     */
    public GestorAlumnos() {
        this.listaAlumnos = new ArrayList<>();
    }

    /**
     * Método agregarAlumno:
     * agrega un alumno al atributo listaAlumnos(List)
     *
     * @param nombre : nombre del alumno nuevo
     */
    public void agregarAlumno(String nombre) {
        listaAlumnos.add(nombre);
    }

    /**
     * Método eliminarAlumno:
     * Elimina un alumno
     *
     * @param nombre : nombre del alumno a eliminar
     * @return accion de eliminar dicho nombre a la lista
     */
    public boolean eliminarAlumno(String nombre) {
        return listaAlumnos.remove(nombre);
    }
    //JAVADOC + TEST

    /**
     * Método consultarAlumnos:
     * Consulta el numero de alumnos del listado
     *
     * @return longitud del listado en valor numérico (int).
     */
    public int cantidadAlumnos() {
        return listaAlumnos.size();
    }

    /**
     * Metodo buscarAlumno:
     * Comprueba si un alumno se encuentra en el listado.
     *
     * @param nombre del alumno a consultar.
     * @return true (el nombre del alumno esta en la lista) o false (el nombre no se encuentra en la lista).
     */
    public boolean buscarAlumno(String nombre) {
        return listaAlumnos.contains(nombre);
    }
    //JAVADOC + TEST

    /**
     * Método obtenerListaAlumnos:
     * Obtiene todos los nombres del listado de alumnos.
     *
     * @return listaAlumnos: listado completo de los alumnos existentes en la lista.
     */
    public List<String> obtenerListaAlumnos() {
        return listaAlumnos;
    }
}
