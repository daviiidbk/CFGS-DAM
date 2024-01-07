package Unidad3;
import java.util.Scanner;
import java.util.ArrayList;

public class Unidad3 {
    public static void main(String[] args){
        ejercicio1();
    }
    public static void ejercicio1(){
        /* Elabora un programa que muestra por 
         * pantalla los 20 primeros números naturales.
         */
        int num = 0;
        while(num <= 20){
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
        int num = 0;
        int factorial = 1;
        System.out.println("Introduce un número: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while(num >= 1){
            factorial = factorial * num;
            num--;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
    }
    public static void ejercicio4(){
        /* Realiza un programa que lea 10 números y luego indique
         * cuántos han sido positivos y cuántos negativos.
         */
        for(int i = 0; i<=10; i++){
            System.out.println("Introduzca un número: ")
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
        }
        System.out.println();
    }
}