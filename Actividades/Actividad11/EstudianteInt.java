package Actividades.Actividad11;

public class EstudianteInt extends Estudiante{
    private boolean esErasmus;
    private String nacionalidad;

    public EstudianteInt(String string, String string2, String string3, boolean b, String string4){
    }

    public EstudianteInt(Estudiante nombre, Estudiante direccion, Estudiante codigo,
    boolean esErasmus, String nacionalidad){
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
            return false;
        } else return true;
    }
    public boolean esErasmus(){
        if(this.nacionalidad == "americano") return false;
        return true;
    }

    public boolean descuentoParaJovenes(){
        if (esErasmus() == false){
            return false;
        } else if (this.edad >= 25){
            return false;
        } else return true;
    }
}
