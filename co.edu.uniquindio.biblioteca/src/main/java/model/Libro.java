package model;

public class Libro {
    public String titulo;
    public String autor;
    public String iSBN;
    public String estado;
    public Libro(){
    }

    public Libro(String titulo, String autor, String iSBN,String  estado){
        this.titulo = titulo;
        this.autor = autor;
        this.iSBN = iSBN;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return iSBN;
    }
    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
