package Actividades.Actividad11;

public class Persona {
    protected String nombre;
    protected String direccion;
    protected int edad;

    public Persona(){
    }

    public Persona(String nombre, String direccion, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean mayorEdad(){
        if (this.edad == 18){
            return true;
        } return false;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }

}
