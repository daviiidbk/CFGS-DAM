package Actividades.Actividad11;

public class EstudianteInt extends Estudiante{
    private boolean esErasmus;
    private String nacionalidad;

    public EstudianteInt(){
    }

    public EstudianteInt(String nombre, String direccion, int edad, String codigo, boolean esErasmus, String nacionalidad){
        super(nombre, direccion, edad, codigo);
        this.esErasmus = esErasmus;
        this.nacionalidad = nacionalidad;
    }

    public boolean getEsErasmus() {
        return this.esErasmus;
    }

    public void setEsErasmus(boolean esErasmus) {
        this.esErasmus = esErasmus;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean esEuropeo(){
        if(this.nacionalidad == "americano"){
            System.out.println( getNombre() + " no es europeo.");
            return false;
        } else System.out.println( getNombre() + " es europeo.");
        return true;
    }
    public boolean esErasmus(){
        if(this.nacionalidad == "americano") return false;
        return true;
    }

    public boolean descuentoParaJovenes(){
        if (esErasmus() == false){
            System.out.println( getNombre() + " no tiene acceso al descuento.");
            return false;
        } else if (this.edad >= 25){
            System.out.println( getNombre() + " no tiene acceso al descuento.");
            return false;
        } else {
            System.out.println( getNombre() + " tiene acceso al descuento.");
            return true;
        }
    }
}
