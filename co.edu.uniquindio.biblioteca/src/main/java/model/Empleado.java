package model;

public class Empleado {
    public String nombre;
    public String idEmpleado;

    public Empleado (){
    }

    public Empleado (String nombre, String idEmpleado){
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado: " +"\n"+
                "nombre: " + nombre +"\n" +
                "Numero ID Empleado: " + idEmpleado+"\n";
    }
}
