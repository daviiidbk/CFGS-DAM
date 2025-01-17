package Unidad1;
import java.lang.Math;
import java.util.Scanner;
public class Unidad1 {
    public static void main(String[] args) {
        ejercicio6();
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
    System.out.println("Principio de Ejercicio 5.");
    System.out.println("#1 = " + 24 % 5);
    System.out.println("#2 = " + 7/2 + 2.5);
    System.out.println("#3 = " + 10.8/2 + 2);
    System.out.println("#4 = " + (4 + 6)*3 + 2*(5 - 1));
    System.out.println("#5 = " + 5/2 + 17 % 3);
    System.out.println("#6 = " + ((7 >= 5) || (27 != 8)));
    System.out.println("#7 = " + ((45 <= 7) || !(5 >= 7)));
    System.out.println("#8 = " + (27 % 4 + 15/4));
    System.out.println("#9 = " + (37 / 4 * 4 - 2));
    System.out.println("#10 = " + ((25>20) && !(7 <= 2)));
    System.out.println("#11 = " + (('H'<'J') && ('9'!='7')));
    System.out.println("#12 = " + ((25>20) && (13>5)));
    System.out.println("#13 = " + (((10+4)<(15-3))||((2*5+1)>(14-2*2))));
    System.out.println("#14 = " + ((4*2 <= 8) || (2*2 < 5) && (4 > 3 + 1)));
    System.out.println("#15 = " + ((10<=2*5)&&(3<4)|| !(8>7) && (3*2 <= 4*2-1)));
    System.out.println("Final de Ejercicio 5.");
}

public static void ejercicio6(){
    //Pasa el diagrama a código.
    System.out.println("Principio de Ejercicio 6.");
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el radio del círculo: ");
    double R = s.nextInt();
    double area = 3.14 * R * R;
    System.out.println("Área del círculo: " + area);
    System.out.println("Final de Ejercicio 6.");
}
}
