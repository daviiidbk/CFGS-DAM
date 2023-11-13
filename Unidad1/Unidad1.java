package Unidad1;
import java.lang.Math;
public class Unidad1 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
}
public static void ejercicio1(){
    //Calcula el valor de las variables tras ejecutar cada instrucción.
    int A = 5, B = 2, C = 3;
    System.out.println("Principio de Ejercicio 1.");
    A = B;
    System.out.println("#1 " + "A ="+ A + " B =" + B + " C =" + C);
    C = A;
    System.out.println("#2 " + "A ="+ A + " B =" + B + " C =" + C);
    B = (A + B + C) / 2;
    System.out.println("#3 " + "A ="+ A + " B =" + B + " C =" + C);
    A = A + C;
    System.out.println("#4 " + "A ="+ A + " B =" + B + " C =" + C);
    C = B - A;
    System.out.println("#5 " + "A ="+ A + " B =" + B + " C =" + C);
    C = C - A;
    System.out.println("#6 " + "A ="+ A + " B =" + B + " C =" + C);
    A = A * B;
    System.out.println("#7 " + "A ="+ A + " B =" + B + " C =" + C);
    A = A + 3;
    System.out.println("#8 " + "A ="+ A + " B =" + B + " C =" + C);
    A = A % B;
    System.out.println("#9 " + "A ="+ A + " B =" + B + " C =" + C);
    C = C + A;
    System.out.println("#10 " + "A ="+ A + " B =" + B + " C =" + C);
    System.out.println("Final de Ejercicio 1.");
}
public static void ejercicio2(){
    //Evalúa las siguientes expresiones
    System.out.println("Principio de Ejercicio 2.");
    System.out.println("(((3 + 2)^2 - 15)/ 2 * 5)");
    System.out.println("Resultado: " + (((3 + 2)^2 - 15)/ 2 * 5));
    System.out.println("5 - 2 > 4 AND NOT 0.5 == 1/2");
    boolean op1 = (5 - 2) > 4;
    boolean op2 = !(0.5 == 1/2);
    boolean parte1 = op1 && op2;
    System.out.println("Resultado: " + parte1);
    System.out.println("Dado x=1, y=4, z=10, pi=3.14, e=2.71");
    double x = 1, y = 4, z = 10, pi = 3.14, e = 2.71;
    System.out.println("2 * x + 0.5 + y - 1/5 * z");
    double parte2 = 2 * x + 0.5 + y - 1/5 * z;
    System.out.println("Resultado: " + parte2);
    System.out.println("Dado x=1, y=4, z=10, pi=3.14, e=2.71");
    System.out.println("pi * x^2 > y OR 2 * pi * x <= z");
    boolean parte3 = (pi * x*x > y) || (2 * pi * x <= z);
    System.out.println("Resultado: " + parte3);
    System.out.println("Dado x=1, y=4, z=10, pi=3.14, e=2.71");
    System.out.println("e^(x-1)/(x*z)/(x/z)");
    double parte4 = Math.pow(e, (x-1)) / (x*z) / (x/z);
    System.out.println("Resultado: " + parte4);
    System.out.println("''Don '' + ''Juan'' == ''Don Juan'' OR ''A'' == ''a''");
    boolean parte5 = "Don " + "Juan" == "Don Juan" || "A" == "a";
    System.out.println("Resultado: " + parte5);
    System.out.println("Final de Ejercicio 2.");
}

public static void ejercicio5(){
    //Evalúa las siguientes expresiones.
}

public static void ejercicio6(){
    //Pasa el diagrama a código.
}
}
