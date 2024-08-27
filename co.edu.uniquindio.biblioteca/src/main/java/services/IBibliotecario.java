package services;

import model.Libro;
import model.Miembro;
import model.Prestamo;

import java.time.LocalDate;

public interface IBibliotecario {

    void eliminarLibro(Libro libro);
    void registrarDevolucion(Libro libro, Miembro miembro);
    void registrarMulta(Prestamo prestamo, LocalDate fechaLimite);

}

