package Unidad3;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Unidad3 {
    public static void main(String[] args){
        ejercicio8();
    }
    public static void ejercicio1(){
        /* Elabora un programa que muestra por 
         * pantalla los 20 primeros números naturales.
         */
        int num = 0;
        while(num < 20){
            num++;
            System.out.println(num);
        }
    }
    public static void ejercicio2(){
        /* Elabora un programa que muestre por pantalla
         * los números pares comprendidos entre el 1 y el 200.
         */
        int num = 0;
        while(num <= 200){
            num++;
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
    public static void ejercicio3(){
        /* Elabora un programa que lea un número positivo
         * 'n' introducido por teclado, calcule su factorial
         * y muestre por pantalla Recuerda que el factorial de un
         * número es multiplicar el número por todos los anteriores
         * hasta llegar al 1. Ejemplo: 5! 5·4·3·2·1 = 120.
         */
        int num, entrada = 0;
        int factorial = 1;
        System.out.println("Introduce un número: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        entrada = num;
        while(num >= 1){
            factorial = factorial * num;
            num--;
        }
        System.out.println("El factorial de " + entrada + " es " + factorial);
    }
    public static void ejercicio4(){
        /* Realiza un programa que lea 10 números y luego indique
         * cuántos han sido positivos y cuántos negativos.
         */
        int positivos = 0, negativos = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Introduzca un número: ");
            if(input.nextInt() > 0){
                positivos++;
            }else {
                negativos++;
            }
        }
        System.out.println("Se introdujeron " + positivos + " números positivos.");
        System.out.println("Se introdujeron " + negativos + " números negativos.");
    }
    public static void ejercicio5(){
        /* Realiza un programa que sume independientemente los números
         * y los números impares de los números comprendidos entre 100 y 200.
         * Finalmente, mostrará por pantalla ambas sumas.
         */
        int sumaI = 0;
        for(int i = 100; i<=200; i++){
            if(i % 2 != 0){
                sumaI = sumaI + i;
            }
        }
        int sumaP = 0;
        for(int i = 100; i<200; i++){
            if(i % 2 == 0){
                sumaP = sumaP + i;
            }
        }
        System.out.println("La suma de los números impares entre 100 y 200 es: " + sumaI);
        System.out.println("La suma de los números pares entre 100 y 200 es: " + sumaP);
    }
    public static void ejercicio6(){
        /* Realiza un programa que pida un número entero N entre 0 y 20 y luego
         * muestre por pantalla los números desde 1 hasta N, uno en cada línea,
         * repitiendo cada número tantas veces como su valor. Ejemplo:
         * 
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */
        System.out.println("Introduce un número entero entre 0 y 20: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void ejercicio7(){
        /*Elabora un programa que pida diez números reales por teclado, los almacene
        en un array, y luego muestra la suma de todos los valores. */
        double valor = 0;
        double suma = 0;
        double[] array = new double[10];
        for( int i = 0; i < 10; i++){
            System.out.println("Introduzca un valor: ");
            Scanner input = new Scanner(System.in);
            valor = input.nextDouble();
            suma += valor;
        }
        System.out.println("La suma total de los valores es el siguiente: " + suma);
    }
    public static void ejercicio8(){
        /* Elabora un programa que pida diez números por teclado, los almacene en un array y
        posteriormente indique cuál es el máximo y cuál es el mínimo. */
        double valor = 0;
        double[] array = new double[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Introduzca un valor: ");
            Scanner input = new Scanner(System.in);
            valor = input.nextDouble();
            array[i] = valor;
        }
        double minimo = array[0];
        double maximo = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minimo) minimo = array[i];
            if(array[i] > maximo) maximo = array[i];
        }
        System.out.println("El valor mínimo del array es: " + minimo);
        System.out.println("El valor máximo del array es: " + maximo);
    }
    public static void ejercicio9(){
        /* Crea un programa que cree dos arrays de enteros de tamaño 20. El primer array
         * se rellenará con valores aleatorios. El segundo array se creará escribiendo el
         * primer array en orden inverso. Finalmente, mostrar ambos arrays por pantalla
        */
        int[] randomArray = new int[20];
        int[] inversoArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.random();
        }
        int contador = 20;
        while 
        for (int i = 0; i < randomArray.length; i++){
            System.out.println(randomArray[i]);
        }
    }
}