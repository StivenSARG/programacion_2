package co.edu.uniquindio.biblioteca;

import model.*;

public class Main {
    public static void main(String[] args) {

        GestionBiblioteca gestionBiblioteca = inicializarDatos();


    }

    private static GestionBiblioteca inicializarDatos() {
        GestionBiblioteca gestionBiblioteca = new GestionBiblioteca();

        Bibliotecario bibliotecario1 = new Bibliotecario();
        bibliotecario1.setNombre("Cristian");
        bibliotecario1.setIdEmpleado("0123456789");

        gestionBiblioteca.getListaBibliotecario().add(bibliotecario1);

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Karol");
        empleado1.setIdEmpleado("1234567890");

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Andres");
        empleado2.setIdEmpleado("23456789012");

        gestionBiblioteca.getListaEmpleado().add(empleado1);
        gestionBiblioteca.getListaEmpleado().add(empleado2);

        Libro libro1 = new Libro();
        libro1.setTitulo("Los hombres invisibles");
        libro1.setAutor("Mario Mendoza");
        libro1.setISBN("089-789");
        libro1.setEstado("Disponible");

        Libro libro2 = new Libro();
        libro2.setTitulo("El principito");
        libro2.setAutor("Antoine Saint");
        libro2.setISBN("675-432");
        libro2.setEstado("Prestado");

        Libro libro3 = new Libro();
        libro3.setTitulo("El tunel");
        libro3.setAutor("Ernesto Sabato");
        libro3.setISBN("321-456");
        libro3.setEstado("Prestado");

        Libro libro4 = new Libro();
        libro4.setTitulo("Billy Summers");
        libro4.setAutor("Stephen King");
        libro4.setISBN("098-876");
        libro4.setEstado("Prestado");

        gestionBiblioteca.getListaLibros().add(libro1);
        gestionBiblioteca.getListaLibros().add(libro2);
        gestionBiblioteca.getListaLibros().add(libro3);
        gestionBiblioteca.getListaLibros().add(libro4);

        Miembro miembro1 = new Miembro();
        miembro1.setNombre("Gladys");
        miembro1.setIdMiembro("3456789012");

        Miembro miembro2 = new Miembro();
        miembro2.setNombre("Manuela");
        miembro2.setIdMiembro("4567890123");

        Miembro miembro3 = new Miembro();
        miembro3.setNombre("Sebastian");
        miembro3.setIdMiembro("5678901234");

        gestionBiblioteca.getListaMiembro().add(miembro1);
        gestionBiblioteca.getListaMiembro().add(miembro2);
        gestionBiblioteca.getListaMiembro().add(miembro3);

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setFechaPrestamo("");
        prestamo1.setFechaDevolucion("");

        prestamo1.setMiembro(miembro1);
        prestamo1.setLibro(libro2);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setFechaPrestamo("");
        prestamo2.setFechaDevolucion("");

        prestamo2.setMiembro(miembro2);
        prestamo2.setLibro(libro3);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setFechaPrestamo("");
        prestamo3.setFechaDevolucion("");

        prestamo3.setMiembro(miembro3);
        prestamo3.setLibro(libro4);








        return gestionBiblioteca;
    }
}