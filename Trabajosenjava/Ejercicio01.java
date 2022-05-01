cdimport java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
    //2.1
    //Definir variables
    double a,b;
    //Datos de entrada
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la base:");
    a=lt.nextDouble();
    System.out.println("Ingrese la altura:");
    b=lt.nextDouble();
    //Proceso
    Double area = (a * b) /2;
    //Datos de salida
    System.out.println("El area del triangulo es " + area);
    }
}



//Definir variables
double s;
double d;
//Datos de entrada
Scanner lt=new Scanner(System.in);
System.out.println("Ingrese monto en soles :");
s=lt.nextDouble();
//Proceso
d = s / 3.85;
//Datos de salida
System.out.println("Usted puede adquirir " + d + "dolares");