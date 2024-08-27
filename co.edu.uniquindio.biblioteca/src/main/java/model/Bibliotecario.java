package model;

import services.IBibliotecario;
import services.IGestionarInventario;

import java.time.LocalDate;

public class Bibliotecario extends Empleado implements IBibliotecario, IGestionarInventario {
    private GestionBiblioteca gestionBiblioteca;


    public Bibliotecario(){
    }

    public Bibliotecario(String nombre, String idEmpleado,GestionBiblioteca gestionBiblioteca) {
        super(nombre, idEmpleado);
        this.gestionBiblioteca = gestionBiblioteca;
    }


    @Override
    public void eliminarLibro(Libro libro) {
        if(gestionBiblioteca.getListaLibros().contains(libro)){
            gestionBiblioteca.getListaLibros().remove(libro);
            System.out.println("El libro: " + libro.getTitulo() + " ha sido eliminado");
        }else{
            System.out.println("El libro: " + libro.getTitulo() + " no se encuentra");
        }
    }

    public GestionBiblioteca getGestionBiblioteca() {
        return gestionBiblioteca;
    }
    public void setGestionBiblioteca(GestionBiblioteca gestionBiblioteca) {
        this.gestionBiblioteca = gestionBiblioteca;
    }

    @Override
    public void registrarMulta(Prestamo prestamo, LocalDate fechaLimite) {

    }

    @Override
    public void registrarDevolucion(Libro libro, Miembro miembro) {
        libro.setEstado("Disponible");

        Prestamo prestamoEliminar = null;
        for(Prestamo prestamo : gestionBiblioteca.getListaPrestamo()){
            if(prestamo.getLibro().equals(libro) && prestamo.getMiembro().equals(miembro)){
                prestamoEliminar = prestamo;
                break;

            }
        }
        if (prestamoEliminar != null){
            gestionBiblioteca.getListaPrestamo().remove(prestamoEliminar);
            System.out.println("Devolucion registrada ");
        }else{
            System.out.println("No se encontro el prestamo asociado a la devolucion");
        }


    }

    @Override
    public void gestionarItem() {

    }
}


