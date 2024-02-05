package Actividades.Actividad11;
import Actividades.Actividad11.Estudiante;

public class Main{
    public static void main(String[] args) {
        Estudiante alu1 = new Estudiante("David", "Las Palmas", 21, "001");
        Estudiante alu2 = new Estudiante("Germán", "Ciudad Jardín", 21, "002");
        EstudianteInt alu3 = new EstudianteInt("Sarah", "Tafira", 18, "003", false, "americano");
        EstudianteInt alu4 = new EstudianteInt("Pablo", "Jinámar", 27, "004", true, "portugués");
        EstudianteInt alu5 = new EstudianteInt("Juan", "Vecindario", 20, "005", true, "francés");
        alu3.esEuropeo();
        alu4.esEuropeo();
        alu5.esEuropeo();
        alu3.descuentoParaJovenes();
        alu4.descuentoParaJovenes();
        alu5.descuentoParaJovenes();
    }
}
