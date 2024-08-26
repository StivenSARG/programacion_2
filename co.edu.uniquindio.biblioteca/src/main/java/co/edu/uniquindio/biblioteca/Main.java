package co.edu.uniquindio.biblioteca;

import model.*;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        GestionBiblioteca gestionBiblioteca = inicializarDatos();

        Scanner mensaje = new  Scanner (System.in);

        int opcion;

        do{
            System.out.println("\nGestión Biblioteca");
            System.out.println("1.Registrar nuevo empleado");
            System.out.println("2.Registrar nuevo miembro");
            System.out.println("3.Registrar nuevo libro");
            System.out.println("4.Consultar empleados biblioteca");
            System.out.println("5.Consultar miembros asociados a la biblioteca");
            System.out.println("6.Consultar libros de la biblioteca");
            System.out.println("7.Salir");
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
                     informacionEmpleados(gestionBiblioteca);
                    break;
                case 5:
                    informacionMiembros(gestionBiblioteca);
                    break;
                case 6:
                    informacionLibros(gestionBiblioteca);
                    break;
                case 7:
                    break;
            }

        }while (opcion !=7);
        mensaje.close();


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

        gestionBiblioteca.getListaPrestamo().add(prestamo1);
        gestionBiblioteca.getListaPrestamo().add(prestamo2);
        gestionBiblioteca.getListaPrestamo().add(prestamo3);


        return gestionBiblioteca;
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








}