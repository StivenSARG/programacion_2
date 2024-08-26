package model;

import services.IBibliotecario;
import services.IGestionarInventario;

public class Bibliotecario extends Empleado implements IBibliotecario, IGestionarInventario {


    public Bibliotecario(){
    }

    public Bibliotecario(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

    @Override
    public void gestionarPrestamo() {
    }

    @Override
    public void gestionarItem() {
        
    }
}
