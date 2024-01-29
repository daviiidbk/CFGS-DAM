package Actividades.Actividad10;
import java.util.Scanner;
import java.util.Objects;

public class Biblioteca {

    static Scanner s = new Scanner(System.in);
    static int menu = -1;

    public static void main(String[] args) {
        // Pruebas de funcionamiento de creación y métodos de préstamos y devoluciones.
        Libro libro1 = new Libro("El Quijote de la Mancha", "Miguel de Cervantes", 2, 0);
        Libro libro2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 0);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        libro1.prestamo();
        libro1.prestamo();
        System.out.println(libro1.toString());
        libro1.prestamo();
        libro2.devolucion();
        // Creación de otro libro
        Libro libro3 = new Libro("Mortadelo y Filemón", "Francisco Ibañez", 10, 2);

        //Creación de menú de uso del sistema para una biblioteca.
        System.out.println("Bienvenid@ al sistema de la biblioteca.");
        while(menu != 0){
            System.out.println("Por favor, seleccione una opción: ");
            System.out.println("0: Salir");
            System.out.println("1: Préstamo de 'El Quijote de la Mancha'");
            System.out.println("2: Devolución de 'El Quijote de la Mancha'");
            System.out.println("3: Préstamo de 'El Capitán Alatriste'");
            System.out.println("4: Devolución de 'El Capitán Alatriste'");
            System.out.println("5: Préstamo de 'Mortadelo y Filemón'");
            System.out.println("6: Devolución de 'Mortadelo y Filemón'");
            menu = s.nextInt();
            switch(menu){
                case 0: System.exit(0);
                break;
                case 1: libro1.prestamo();
                break;
                case 2: libro1.devolucion();
                break;
                case 3: libro2.prestamo();
                break;
                case 4: libro2.devolucion();
                break;
                case 5: libro3.prestamo();
                break;
                case 6: libro3.devolucion();
                break;
                default: System.out.println("No se ha reconocido el valor.");
                }
            }
        }
    }
