package model;


public class Miembro {
    public String nombre;
    public String idMiembro;

    public Miembro (){
    }

    public Miembro(String nombre, String idMiembro){
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

    @Override
    public String toString() {
        return "Miembro: " +"\n"+
                "nombre: " + nombre + "\n" +
                "Numero ID Miembro: " + idMiembro+"\n";
    }
}
