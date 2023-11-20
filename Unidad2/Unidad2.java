package Unidad2;
import java.util.Scanner;
import java.lang.Math;

public class Unidad2 {
    public static void main(String[] args) {
        ejercicio1();
    }
    public static void ejercicio1(){
        /*
        Elabora un programa que calcule la longitud y el área de una circunferencia. Para ello,
        //el usuario debe introducir el radio (que puede contener decimales). Recuerda que el
        número pi es una constante de la clase Math (Math.PI).
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Radio de la cicunferencia: ");
        double radio = input.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Con un radio de " + radio + " la circunferencia tendrá un longitud de " + longitud + " y un área de " + area);
    }
}
