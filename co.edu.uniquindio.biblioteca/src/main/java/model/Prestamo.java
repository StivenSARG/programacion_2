package model;

public class Prestamo {
    public String fechaPrestamo;
    public String fechaDevolucion;
    private Miembro miembro;
    private Libro libro;

    public Prestamo(){
    }

    public Prestamo (String fechaPrestamo, String fechaDevolucion, Miembro miembro, Libro libro){
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.miembro = miembro;
        this.libro = libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Miembro getMiembro() {
        return miembro;
    }
    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                ", miembro=" + miembro +
                ", libro=" + libro +
                '}';
    }
}
