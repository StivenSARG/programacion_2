package model;


public class Miembro {
    public String nombre;
    public String idMiembro;
    private Prestamo prestamo;

    public Miembro (){
    }

    public Miembro(String nombre, String idMiembro, Prestamo prestamo){
        this.nombre = nombre;
        this.idMiembro =idMiembro;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getIdMiembro() {
        return idMiembro;
    }
    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
}
