package Actividades.Actividad11;

public class Estudiante extends Persona{
    private String codigo;

    public Estudiante(){
    }

    Estudiante(Estudiante nombre, Estudiante direccion, String codigo){
        this.codigo = codigo;
    }

    public Estudiante(String string, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            "}";
    }

}
