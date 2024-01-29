package Actividades.Actividad12;
import java.util.Objects;

public class Profesor extends Persona {
    private double salario;

    public Profesor() {
    }

    public Profesor(double salario, String nombre, int anyoNacimiento) {
        super();
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Profesor salario(double salario) {
        setSalario(salario);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " salario='" + getSalario() + "'" +
            "}";
    }
    @Override
    public double calcularDescuento(double cantidad){
        return cantidad * 0.02;
    }
}
