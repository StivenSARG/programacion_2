package services;

import model.Empleado;
import model.Libro;

public interface IBibliotecario {

    void gestionarPrestamo();
    void eliminarLibro(Libro libro);

}

