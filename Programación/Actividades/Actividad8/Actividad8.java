package Actividades.Actividad8;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad8 {

    static Scanner scanner = new Scanner(System.in);
    static int menu = -1;

    public static void main(String[] args) {
        /*
         * Crea una aplicación en Java que cree un array de 20 elementos
         * Cada elemento del array debe contener un número entero comprendido
         * entre 1 y 10. Los números enteros debem generarse de manera aleatoria.
         * 
         * Además el programa debe mostrar un menú al usuario con las siguientes
         * opciones:
         * 
         * · Imprimir el mayor valor del array
         * · Imprimir el menor valor del array
         * · Calcular la media de todos los valores del array
         * · Imprimir todos los valores del array
         * · Calcular el número de veces que se encuentra un número (pedido por teclado
         * al usuario) dentro del array (número de ocurrencias)
         * 
         * Se mostrará el menú anterior hasta que el usuario introduzca un 0 por
         * teclado. Debe generarse un método para cada una de las opciones del menú
         * anterior.
         */
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int valor = (int) (Math.random() * 10 + 1);
            array[i] = valor;
        }
        System.out.println("Se ha generado el array aleatorio.");
        while (menu != 0) {
            System.out.println("Seleccione una opción: ");
            System.out.println("0: Cerrar el programa.");
            System.out.println("1: Mostrar el mayor valor del array.");
            System.out.println("2: Mostrar el menor valor del array");
            System.out.println("3: Mostrar la media de los valores del array.");
            System.out.println("4: Mostrar todos los valores del array.");
            System.out.println("5: Mostrar la frecuencia de un valor del array.");
            int menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("¡Adiós!");
                    System.exit(menu);
                case 1:
                    mayorValor(array);
                    break;
                case 2:
                    menorValor(array);
                    break;
                case 3:
                    media(array);
                    break;
                case 4:
                    mostrarArray(array);
                    break;
                case 5:
                    frecuencia(array);
                    break;
                default:
                    System.out.println("Número no reconocido.");
                    break;
            }
        }
    }

    public static void mayorValor(int[] array) {
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El valor mayor del array es: " + mayor);
    }

    public static void menorValor(int[] array) {
        int menor = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("El valor menor del array es: " + menor);
    }

    public static void media(int[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("El valor de la media del array es: " + (suma / array.length));
    }

    public static void mostrarArray(int[] array) {
        System.out.println("Los valores del array son los siguientes: " + Arrays.toString(array));
    }

    public static void frecuencia(int[] array) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor a buscar: ");
        int valor = entrada.nextInt();
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor)
                contador++;
        }
        System.out.println("El valor " + valor + " aparece " + contador + " veces.");
    }
}
