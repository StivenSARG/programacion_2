package model;

import java.util.ArrayList;
import java.util.List;

/*Clase que representara un sistema que gestiona los libros de una biblioteca*/
public class GestionBiblioteca {

    private String nombre;
    private List<Miembro> listaMiembro = new ArrayList<>();
    private List<Empleado> listaEmpleado = new ArrayList<>();
    private List<Prestamo> listaPrestamo = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecario = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();

    public GestionBiblioteca() {
    }

    public GestionBiblioteca(String nombre, List<Miembro> listaMiembro, List<Empleado> listaEmpleado, List<Prestamo> listaPrestamo,
                             List<Bibliotecario> listaBibliotecario, List<Libro> listaLibros) {

        this.nombre = nombre;
        this.listaMiembro = listaMiembro;
        this.listaEmpleado = listaEmpleado;
        this.listaPrestamo = listaPrestamo;
        this.listaBibliotecario = listaBibliotecario;
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Miembro> getListaMiembro() {
        return listaMiembro;
    }

    public void setListaMiembro(List<Miembro> listaMiembro) {
        this.listaMiembro = listaMiembro;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }
    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public List<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }
    public void setListaPrestamo(List<Prestamo> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }

    public List<Bibliotecario> getListaBibliotecario() {
        return listaBibliotecario;
    }
    public void setListaBibliotecario(List<Bibliotecario> listaBibliotecario) {
        this.listaBibliotecario = listaBibliotecario;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "GestionBiblioteca{" +
                "nombre='" + nombre + '\'' +
                ", listaMiembro=" + listaMiembro +
                ", listaEmpleado=" + listaEmpleado +
                ", listaPrestamo=" + listaPrestamo +
                ", listaBibliotecario=" + listaBibliotecario +
                ", listaLibros=" + listaLibros +
                '}';
    }
}


