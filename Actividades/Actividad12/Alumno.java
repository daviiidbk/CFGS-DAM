package Actividades.Actividad12;
import java.util.Objects;

public class Alumno extends Persona{
    private String curso;

    public Alumno() {
    }

    public Alumno(String curso, String nombre, int anyoNacimiento) {
        super();
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Alumno curso(String curso) {
        setCurso(curso);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " curso='" + getCurso() + "'" +
            "}";
    }
    @Override
    public double calcularDescuento(double cantidad){
        return cantidad * 0.1;
    }
    
}
