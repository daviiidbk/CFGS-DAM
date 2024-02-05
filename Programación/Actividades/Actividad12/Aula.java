package Actividades.Actividad12;

public class Aula {
    public static void main(String[] args){
        Profesor pro1 = new Profesor(2000, "Eustaquio", 1969);
        Profesor pro2 = new Profesor(1000, "Karen", 1950);
        Alumno alu1 = new Alumno("Bachillerato", "Natalaia", 2000);
        Alumno alu2 = new Alumno("Cuarto ESO", "Horacio", 2002);
        System.out.println("Eustaquio compra un libro de Lengua y Literatura española por 40 euros. Ese es el descuento que se le aplica: " + pro1.calcularDescuento(40));
        System.out.println("Karen compra un reproductor de casetes para sus clases de Inglés por 55 euros. Ese es el descuento que se le aplica: " +pro2.calcularDescuento(55));
        System.out.println("Natalaia compra material escolar por 26 euros. Ese es el descuento que se le aplica: " + alu1.calcularDescuento(26));
        System.out.println("Horacio compra unos cuadernos por 15 euros. Ese es el descuento que se le aplica: " + alu2.calcularDescuento(15));
    }
}
