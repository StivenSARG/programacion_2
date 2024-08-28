package services;

import model.*;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        GestionBiblioteca gestionBiblioteca = inicializarDatos();

        Scanner mensaje = new  Scanner (System.in);

        int opcion;

        do{
            System.out.println("\nGestión Biblioteca");
            System.out.println("1.Nuevo registro biblioteca");
            System.out.println("2.Consultar registro biblioteca");
            System.out.println("3.Eliminar libro");
            System.out.println("4.Registrar prestamo");
            System.out.println("5.Registrar devolucion");
            System.out.println("6.Registrar multa");
            System.out.println("7.salir");
            System.out.println("Seleccione una opción: ");
            opcion = mensaje.nextInt();

            switch (opcion){
                case 1:
                    nuevoRegistro(gestionBiblioteca,mensaje);
                    break;
                case 2:
                    consultaBiblioteca(gestionBiblioteca, mensaje);

                    break;
                case 3:
                    eliminarLibro(gestionBiblioteca, mensaje);
                    break;
                case 4:
                    registrarPrestamo(gestionBiblioteca, mensaje);
                    break;
                case 5:
                    registrarDevolucion(gestionBiblioteca, mensaje);
                    break;
                case 6:
                    registrarMulta(gestionBiblioteca, mensaje);
                    break;
                case 7:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("La opción no existe");
                    break;
            }

        }while (opcion != 7);
        mensaje.close();
    }

    private static GestionBiblioteca inicializarDatos() {
        GestionBiblioteca gestionBiblioteca = new GestionBiblioteca();

        Bibliotecario bibliotecario1 = new Bibliotecario();
        bibliotecario1.setNombre("Cristian");
        bibliotecario1.setIdEmpleado("0123456789");
        bibliotecario1.setGestionBiblioteca(gestionBiblioteca);

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
        prestamo1.setFechaPrestamo(LocalDate.of(2024, 8,27));
        prestamo1.setFechaDevolucion(LocalDate.of(2024, 8,31));

        prestamo1.setMiembro(miembro1);
        prestamo1.setLibro(libro2);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setFechaPrestamo(LocalDate.of(2024, 8,25));
        prestamo2.setFechaDevolucion(LocalDate.of(2024, 9,5));

        prestamo2.setMiembro(miembro2);
        prestamo2.setLibro(libro3);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setFechaPrestamo(LocalDate.of(2024, 8,20));
        prestamo3.setFechaDevolucion(LocalDate.of(2024, 8,31));

        prestamo2.setMiembro(miembro2);
        prestamo2.setLibro(libro3);
        prestamo3.setMiembro(miembro3);
        prestamo3.setLibro(libro4);

        gestionBiblioteca.getListaPrestamo().add(prestamo1);
        gestionBiblioteca.getListaPrestamo().add(prestamo2);
        gestionBiblioteca.getListaPrestamo().add(prestamo3);


        return gestionBiblioteca;
    }

    private static void  nuevoRegistro(GestionBiblioteca gestionBiblioteca, Scanner mensaje){

        int opcion;
        do{
            System.out.println("Elija la opcion del nuevo registro que desea realizar: ");
            System.out.println("1.Registro nuevo empleado");
            System.out.println("2.Registro nuevo miembro");
            System.out.println("3.Registro nuevo libro ");
            System.out.println("4.Salir");
            opcion = mensaje.nextInt();

            switch (opcion){
                case 1:
                    registrarEmpleado(gestionBiblioteca, mensaje);
                    break;

                case 2:
                    registrarMiembro(gestionBiblioteca, mensaje);
                    break;

                case 3:
                    registrarLibro(gestionBiblioteca, mensaje);
                    break;
                case 4:
                    System.out.println("Saliendo a menu principal.");
                default:
                    System.out.println("La opción no existe");
                    break;
            }
        }while (opcion !=4);
    }

    private static void registrarEmpleado(GestionBiblioteca gestionBiblioteca, Scanner mensaje){
        mensaje.nextLine();
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String nombre = mensaje.nextLine();
        System.out.println("Ingrese el numero de identificación del nuevo empleado: ");
        String idEmpleado = mensaje.nextLine();

        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setIdEmpleado(idEmpleado);

        gestionBiblioteca.getListaEmpleado().add(nuevoEmpleado);

        System.out.println("Nuevo empleado creado exitosamente");
    }

    private static void registrarMiembro(GestionBiblioteca gestionBiblioteca, Scanner mensaje){
        mensaje.nextLine();

        System.out.println("Ingrese el nombre del nuevo miembro asociado a la biblioteca: ");
        String nombre = mensaje.nextLine();
        System.out.println("Ingrese el numero de identificación del nuevo miembro asociado a la biblioteca: ");
        String idMiembro = mensaje.nextLine();

        Miembro nuevoMiembro = new Miembro();
        nuevoMiembro.setNombre(nombre);
        nuevoMiembro.setIdMiembro(idMiembro);

        gestionBiblioteca.getListaMiembro().add(nuevoMiembro);

        System.out.println("Nuevo miembro de la Biblioteca creado exitosamente");
    }

    private static void registrarLibro(GestionBiblioteca gestionBiblioteca, Scanner mensaje){
        mensaje.nextLine();

        System.out.println("Nuevo registro de libro ");
        System.out.println("Ingrese el titulo del libro:");
        String titulo = mensaje.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        String autor = mensaje.nextLine();
        System.out.println("Ingrese el ISBN del libro: ");
        String iSBN = mensaje.nextLine();
        System.out.println("Estado del libro: ");
        String estado = mensaje.nextLine();

        Libro nuevoLibro = new Libro();
        nuevoLibro.setTitulo(titulo);
        nuevoLibro.setAutor(autor);
        nuevoLibro.setISBN(iSBN);
        nuevoLibro.setEstado(estado);

        gestionBiblioteca.getListaLibros().add(nuevoLibro);

    }


    private static void consultaBiblioteca(GestionBiblioteca gestionBiblioteca,Scanner mensaje){

       int opcion;
        do{
            System.out.println("Ingrese la opcion que desea realizar. ");
            System.out.println("1. Consultar lista empleados registrados. ");
            System.out.println("2.Consultar miembros asociados a la biblioteca.");
            System.out.println("3.Consultar libros de la biblioteca. ");
            System.out.println("4.Consultar prestamos realizados. ");
            System.out.println("5.Salir");
            opcion = mensaje.nextInt();

            switch (opcion){
                case 1:
                    informacionEmpleados(gestionBiblioteca);
                    break;

                case 2:
                    informacionMiembros(gestionBiblioteca);
                    break;

                case 3:
                    informacionLibros(gestionBiblioteca);
                    break;
                case 4:
                    informacionPrestamos(gestionBiblioteca);
                    break;

                case 5:
                    System.out.println("Saliendo al menu principal");
                default:
                    System.out.println("La opcion no exite");
                    break;
            }
        }while( opcion != 5);

    }

    private static void informacionEmpleados(GestionBiblioteca gestionBiblioteca){
        for(Empleado empleado: gestionBiblioteca.getListaEmpleado()){
            System.out.println(empleado);
        }
    }

    private static void informacionMiembros( GestionBiblioteca gestionBiblioteca){
        for(Miembro miembro: gestionBiblioteca.getListaMiembro()){
            System.out.println(miembro);

        }
    }

    private static void informacionLibros(GestionBiblioteca gestionBiblioteca){
        for(Libro libro: gestionBiblioteca.getListaLibros()){
            System.out.println(libro);
        }
    }

    private static void informacionPrestamos(GestionBiblioteca gestionBiblioteca){
        for ( Prestamo prestamo: gestionBiblioteca.getListaPrestamo()){
            System.out.println(prestamo);
        }
    }

    private static void eliminarLibro(GestionBiblioteca gestionBiblioteca, Scanner mensaje){
        mensaje.nextLine();
        System.out.println("Ingrese el título del libro que desea eliminar:");
        String titulo = mensaje.nextLine();

        Libro libroAEliminar = null;
        for (Libro libro : gestionBiblioteca.getListaLibros()) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null) {
            Bibliotecario bibliotecario = gestionBiblioteca.getListaBibliotecario().get(0);
            bibliotecario.eliminarLibro(libroAEliminar);
        } else {
            System.out.println("El libro con el título '" + titulo + "' no se encuentra en el inventario.");
        }
    }

    private static void registrarPrestamo(GestionBiblioteca gestionBiblioteca, Scanner mensaje){
        mensaje.nextLine();
        System.out.println("Ingrese el ID del miembro que solicita el prestamo: ");
        String idMiembro = mensaje.nextLine();
        System.out.println("Ingrese el titulo del libro que desea prestar: ");
        String titulo = mensaje.nextLine();
        System.out.println("Ingrese la fecha del prestamo (YYYY-MM-DD): ");
        String fechaPrestamoStr = mensaje.nextLine();
        System.out.println("Ingrese fecha de devolucion (YYYY-MM-DD): ");
        String fechaDevolucionStr = mensaje.nextLine();

        Miembro miembro = null;
        for(Miembro m: gestionBiblioteca.getListaMiembro()){
            if(m.getIdMiembro().equals(idMiembro)){
                miembro = m;
                break;
            }
        }
        if (miembro == null) {
            System.out.println("No se en contro el ID ingresado. ");
        }

        Libro libro = null;
        for (Libro l: gestionBiblioteca.getListaLibros()){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                libro = l;
                break;
            }
        }
        if(libro == null){
            System.out.println("No se encontro un libro con el titulo ingresado.");
        }

        if (miembro != null && libro != null && libro.getEstado().equalsIgnoreCase("Disponible")){
            Prestamo   nuevoPrestamo = new Prestamo();
            nuevoPrestamo.setMiembro(miembro);
            nuevoPrestamo.setLibro(libro);

            gestionBiblioteca.getListaPrestamo().add(nuevoPrestamo);
            libro.setEstado("prestado");
            System.out.println("Prestamo registrado exitosamente. ");
        }else{
            System.out.println("El prestamo no se puede realizar revice los datos." );
        }


    }

    private static void registrarDevolucion(GestionBiblioteca gestionBiblioteca, Scanner mensaje) {
        mensaje.nextLine();
        System.out.println("Ingrese el título del libro que se desea devolver:");
        String titulo = mensaje.nextLine();
        System.out.println("Ingrese el ID del miembro que realiza la devolución:");
        String idMiembro = mensaje.nextLine();

        Libro libro = null;
        for (Libro devolver : gestionBiblioteca.getListaLibros()) {
            if (devolver.getTitulo().equalsIgnoreCase(titulo)) {
                libro = devolver;
                break;
            }
        }

        Miembro miembro = null;
        for (Miembro m : gestionBiblioteca.getListaMiembro()) {
            if (m.getIdMiembro().equals(idMiembro)) {
                miembro = m;
                break;
            }
        }

        if (libro != null && miembro != null) {
            Bibliotecario bibliotecario = gestionBiblioteca.getListaBibliotecario().get(0);
            bibliotecario.registrarDevolucion(libro, miembro);
        } else {
            System.out.println("No se encontró el libro o el miembro en el sistema.");
        }
    }

    private static void registrarMulta(GestionBiblioteca gestionBiblioteca, Scanner mensaje){
        mensaje.nextLine(); // Consumir la nueva línea
        System.out.println("Ingrese el ID del miembro asociado al préstamo:");
        String idMiembro = mensaje.nextLine();
        Prestamo prestamo = null;
        for (Prestamo p : gestionBiblioteca.getListaPrestamo()) {
            if (p.getMiembro().getIdMiembro().equals(idMiembro)) {
                prestamo = p;
                break;
            }
        }
        if (prestamo != null) {
            System.out.println("Ingrese la fecha límite de devolución (YYYY-MM-DD):");
            String fechaLimiteStr = mensaje.nextLine();
            LocalDate fechaLimite = LocalDate.parse(fechaLimiteStr);
            Bibliotecario bibliotecario = gestionBiblioteca.getListaBibliotecario().get(0);
            bibliotecario.registrarMulta(prestamo, fechaLimite);
        } else {
            System.out.println("No se encontró un préstamo para el miembro con ID: " + idMiembro);
        }
    }
}







