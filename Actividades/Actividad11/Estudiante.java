package Actividades.Actividad11;

public class Estudiante extends Persona {
    private String codigo;

    // Constructor sin parámetros
    public Estudiante() {
    }

    // Constructor con parámetros
    public Estudiante(String nombre, String direccion, int edad, String codigo) {
        super(nombre, direccion, edad);
        this.codigo = codigo;
    }

    // Métodos getter y setter para el código
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    // Método toString que incluye la información de la persona y el código del estudiante
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + "" +
                ", direccion='" + direccion + "" +
                ", edad=" + edad +
                ", codigo='" + codigo + "" +
                '}';
    }
}
