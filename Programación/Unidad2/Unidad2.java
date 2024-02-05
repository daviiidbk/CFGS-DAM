package Unidad2;
import java.util.Scanner;
import java.lang.Math;

public class Unidad2 {
    public static void main(String[] args) {
        ejercicio10();
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
    public static void ejercicio7(){
        /*
         * Una empresa que gestiona un parque acuático te solicita una aplicación que les ayuda a
         * calcular el importe que hay que cobrar en la taquilla por la compra de una serie de
         * entradas (cuyo número será introducido por el usuario). Existen dos tipos de entrada:
         * infantiles y adutlos. Las entradas infantiles tienen un precio de 15,50€. Las entradas
         * de adultos cuestan 20€. En caso de que la compra total supere los 100€, se debe hacer un
         * 5% de descuento, indicando expresamente que se le ha hecho un descuento por esta razón y
         * mostrando cuál ha sido el importe del descuento.
         */
        Scanner input = new Scanner(System.in);
        double precioInf = 15.50;
        double precioAdu = 20;
        System.out.println("Indicar número de entradas infantiles: ");
        double entI = input.nextDouble();
        System.out.println("Indicar número de entradas adultos: ");
        double entA = input.nextDouble();
        double compraTotal = entI*precioInf + entA*precioAdu;
        if (compraTotal > 100){
            System.out.println("La compra supera los 100 euros por lo que se le aplicará un 5% de descuento.");
            double descuento = 0.05;
            double importeDescuento = compraTotal*descuento;
            System.out.println("El importe de descuento es de " + importeDescuento);
            double precioFinal = compraTotal - importeDescuento;
            System.out.println("El precio final es de " + precioFinal);
        } else {
            System.out.println("La compra total vale: " + compraTotal);
        }
    }
    public static void ejercicio8(){
        /*
         * Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado.
         * El número debe estar comprendido entre 0 y 99.999.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Teclee un número entre 0 y 99.999: ");
        int num = input.nextInt();
        int x = num;
        int cifras = 0;
        do {
            x = x/10;
            cifras++;
        } while (x != 0);
        System.out.println("El numero " + num + " tiene " + cifras + " cifras.");
    }
    public static void ejercicio9if(){
        /*
         * Elabora un programa qu solicite al usuario una nota de 0 a 10 y muestre:
         * a. Insuficiente si la nota está entre 0 y 4
         * b. Suficiente si la nota es 5
         * c. Bien si la nota es 6
         * d. Notable si la nota es 7 u 8
         * e. Sobresaliente si la nota es 9 o 10
         * Elabora el programa utilizando la sentencia if.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indicar nota: ");
        int nota = input.nextInt();
        if (nota < 5){
            System.out.println("Insuficiente");
        } else if (nota == 5){
            System.out.println("Suficiente");
        } else if (nota == 6){
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8){
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
    public static void ejercicio9IfDouble(){
        /*
         * Elabora un programa qu solicite al usuario una nota de 0 a 10 y muestre:
         * a. Insuficiente si la nota está entre 0 y 4
         * b. Suficiente si la nota es 5
         * c. Bien si la nota es 6
         * d. Notable si la nota es 7 u 8
         * e. Sobresaliente si la nota es 9 o 10
         * Elabora el programa utilizando la sentencia if. Esta solución se adapta a si
         * las notas fueran doubles.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indicar nota: ");
        double nota = input.nextDouble();
        if (nota < 5){
            System.out.println("Insuficiente");
        } else if (nota < 6){
            System.out.println("Suficiente");
        } else if (nota < 7){
            System.out.println("Bien");
        } else if (nota < 9){
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
    public static void ejercicio9switch(){
        /*
         * Elabora un programa qu solicite al usuario una nota de 0 a 10 y muestre:
         * a. Insuficiente si la nota está entre 0 y 4
         * b. Suficiente si la nota es 5
         * c. Bien si la nota es 6
         * d. Notable si la nota es 7 u 8
         * e. Sobresaliente si la nota es 9 o 10
         * Elabora el programa utilizando la sentencia switch.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indicar nota: ");
        int nota = input.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                break;
        }
    }
    public static void ejercicio10(){
        /*
         * Elaborar un programa que solicite al usuario un número de mes y muestra por
         * pantalla el nombre correspondiente del mes. Ejemplo: 11 -> Noviembre.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indicar número de mes: ");
        int mes = input.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                break;
        }
    }
}
