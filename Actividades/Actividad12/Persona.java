package Actividades.Actividad12;

public abstract class Persona {
    private String nombre;
    private int anyoNacimiento;

    public Persona(){
    }

    public Persona(String nombre, int anyoNacimiento) {
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoNacimiento() {
        return this.anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", anyoNacimiento='" + getAnyoNacimiento() + "'" +
            "}";
    }
    public abstract double calcularDescuento(double cantidad);

}
