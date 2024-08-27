package model;

import services.IBibliotecario;
import services.IGestionarInventario;

public class Bibliotecario extends Empleado implements IBibliotecario, IGestionarInventario {
    private GestionBiblioteca gestionBiblioteca;


    public Bibliotecario(){
    }

    public Bibliotecario(String nombre, String idEmpleado,GestionBiblioteca gestionBiblioteca) {
        super(nombre, idEmpleado);
    }

    @Override
    public void gestionarPrestamo() {

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
    public void gestionarItem() {

    }
}


