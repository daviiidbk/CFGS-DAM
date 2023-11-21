package Unidad2;
import java.util.Scanner;
import java.lang.Math;

public class Unidad2 {
    public static void main(String[] args) {
        ejercicio6();
    }
    public static void ejercicio1(){
        /* 
         * Elabora un programa que calcule la longitud y el área de una circunferencia. Para ello,
         * el usuario debe introducir el radio (que puede contener decimales). Recuerda que el
         * número pi es una constante de la clase Math (Math.PI).
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Radio de la cicunferencia: ");
        double radio = input.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Con un radio de " + radio + " la circunferencia tendrá un longitud de " + longitud + " y un área de " + area);
    }
    public static void ejercicio2(){
        /* 
         * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de
         * manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
         * solicite las ventas (en kilos) de cada semestre para ada fruta. La aplicación
         * mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado
         * en 2,35€ y el kilo de peras en 1,95€.
         */
        double manzanas = 2.35;
        double peras = 1.95;
        Scanner input = new Scanner(System.in);
        System.out.println("Anotar kilos de manzanas vendidos el primer semestre: ");
        double kilosMS1 = input.nextDouble();
        System.out.println("Anotar kilos de peras vendidos el primer semestre: ");
        double kilosPS1 = input.nextDouble();
        double semestre1 = kilosMS1*manzanas + kilosPS1*peras;
        System.out.println("Anotar kilos de manzanas vendidos el segundo semestre: ");
        double kilosMS2 = input.nextDouble();
        System.out.println("Anotar kilos de peras vendidos el segundo semestre: ");
        double kilosPS2 = input.nextDouble();
        double semestre2 = kilosMS2*manzanas + kilosPS2*peras;
        double importeAnual = semestre1 + semestre2;
        double totalKilosM = kilosMS1 + kilosMS2;
        double totalKilosP = kilosPS1 + kilosPS2;
        double totalVentas = totalKilosM + totalKilosP;
        System.out.println("Este año, a vendido " + totalKilosM + " kilos de manzanas.");
        System.out.println(totalKilosP + " kilos de peras.");
        System.out.println("Siendo en total " + totalVentas + " kilos de ambas.");
        System.out.println("El importe anual es de " + importeAnual + " euros.");
    }
    public static void ejercicio3a(){
        /*
         * Escribir un programa que pida un número al usuario y muestra su valor absoluto
         * Utilizando un operador ternario.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        double num = input.nextDouble();
        double numAbs = num < 0 ? -num : num;
        System.out.println("Su valor absoluto es: " + numAbs);
    }
    public static void ejercicio3b(){
        /*
         * Escribir un programa que pida un número al usuario y muestra su valor absoluto
         * Utilizando una sentencia condicional if.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        double num = input.nextDouble();
        if (num < 0){
            num = -num;
        }
        System.out.println("Su valor absoluto es: " + num);
    }
    public static void ejercicio3c(){
        /*
         * Escribir un programa que pida un número al usuario y muestra su valor absoluto
         * Utilizando el método abs() de la clase Math.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        double num = input.nextDouble();
        double numAbs = Math.abs(num);
        System.out.println("Su valor absoluto es: " + numAbs);
    }
    public static void ejercicio4(){
        /*
         * Escribir un programa que solicite la base imponible (precio del producto) y el
         * porcentaje de impuestos a aplicar (7% de IGIC, por ejemplo). El programa mostrará
         * por pantalla el precio final del producto y el coste de impuestos.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el precio del producto: ");
        double precio = input.nextDouble();
        System.out.println("Indique el porcentaje de impuestos a aplicar: ");
        double impuesto = input.nextDouble();
        double costeImpuesto = precio * (impuesto/100);
        double precioFinal = precio + costeImpuesto;
        System.out.println("El precio final del producto es de " + precioFinal + " euros.");
        System.out.println("El coste de impuesto es de " + costeImpuesto + " euros.");
    }
    public static void ejercicio5(){
        /*
         * Elaborar un programa que solicite al usuario un número m y un número n. El programa
         * deberá indicar cuánto hay que sumarle al número m para que sea múltiplo de n.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indicar valor de m: ");
        double m = input.nextDouble();
        System.out.println("Indicar valor de n: ");
        double n = input.nextDouble();
        double resto = m % n;
        System.out.println("Hay que sumarle " + resto + " a m para que sea múltiplo de n.");
    }
    public static void ejercicio6(){
        /*
         * Elaborar un programa que sea capaz de calcular la solución de una ecuación de segundo
         * grado. Para ello, el usuario deberá introducir los coeficientes a, b y c. El programa
         * empleará la fórmula de las ecuaciones de segundo grado. En caso de que el contenido de
         * la raiz sea negativo, se mostrará que la ecuación no tiene solución real.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Introducir valor de a: ");
        double a = input.nextDouble();
        System.out.println("Introducir valor de b: ");
        double b = input.nextDouble();
        System.out.println("Introducir valor de c: ");
        double c = input.nextDouble();
        double raiz = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        double division = 2*a;
        if (raiz >= 0){
            double ecuacion = (-b + raiz) / division;
            System.out.println("El resultado de la ecuación es: " + ecuacion);
            double ecuacion2 = (-b - raiz) / division;
            if (ecuacion2 != ecuacion){
                System.out.println("El segundo resultado de la ecuación es: " + ecuacion2);
            }
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
