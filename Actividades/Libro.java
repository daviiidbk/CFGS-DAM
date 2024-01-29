package Actividades;
import java.util.Objects;

public class Libro {
    String titulo;
    String autor;
    int ejemplares;
    int prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return this.prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public boolean prestamo() {
        if (ejemplares == prestados) {
            System.out.println("No quedan ejemplares disponibles para prestar.");
            return false;
        } else{
            prestados++;
            System.out.println("Se ha prestado un ejemplar de " +titulo+ ". Quedan " +(ejemplares - prestados)+ " ejemplares disponibles.");
            return true;
        }
    }
    public boolean devolucion() {
        if (prestados == 0){
            System.out.println("No hay ejemplares prestados que devolver.");
            return false;
        }
        prestados--;
        System.out.println("Se ha devuelto un ejemplar de " +titulo+ ". Quedan " +(ejemplares-prestados)+ " disponibles.");
        return true;
    }

    @Override
    public String toString() {
        return "{" +
            " Titulo='" + getTitulo() + "'" +
            ", Autor='" + getAutor() + "'" +
            ", Ejemplares='" + getEjemplares() + "'" +
            ", Prestados='" + getPrestados() + "'" +
            "}";
    }

}
