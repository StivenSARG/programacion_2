package model;

import services.IBibliotecario;
import services.IGestionarInventario;

import java.time.LocalDate;
import java.time.Period;

public class Bibliotecario extends Empleado implements IBibliotecario, IGestionarInventario {

    private GestionBiblioteca gestionBiblioteca;


    public Bibliotecario(){
    }

    public Bibliotecario(String nombre, String idEmpleado, GestionBiblioteca gestionBiblioteca) {
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

    @Override
    public void gestionarItem() {

    }

    @Override
    public void registrarDevolucion(Libro libro, Miembro miembro){
        if(libro.getEstado().equalsIgnoreCase("Prestado")){
            libro.setEstado("Disponible");
            System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto por " + miembro.getNombre() +
                    " con ID: " + miembro.getIdMiembro());
        }else{
            System.out.println("El libro " + libro.getTitulo() + " no está registrado como prestado");
        }
    }

    @Override
    public void registrarMulta(Prestamo prestamo, LocalDate fechaLimite) {
        if(prestamo.getFechaDevolucion().isAfter(fechaLimite)){
            Period periodo = Period.between(fechaLimite, prestamo.getFechaDevolucion());
            int diasRetraso = periodo.getDays();
            double multa = diasRetraso*5000;
            System.out.println("Multa registrada para: " + prestamo.getMiembro().getNombre() +
                    " por el retraso al devolver el libro: " + prestamo.getLibro().getTitulo() + ": " + multa);
        }else{
            System.out.println("La multa no se aplica ya que el libro se devolvió a tiempo");
        }
    }

    public GestionBiblioteca getGestionBiblioteca() {
        return gestionBiblioteca;
    }

    public void setGestionBiblioteca(GestionBiblioteca gestionBiblioteca) {
        this.gestionBiblioteca = gestionBiblioteca;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "gestionBiblioteca=" + gestionBiblioteca +
                ", nombre='" + nombre + '\'' +
                ", idEmpleado='" + idEmpleado + '\'' +
                '}';
    }
}