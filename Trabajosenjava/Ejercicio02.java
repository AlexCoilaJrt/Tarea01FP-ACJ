import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) throws Exception {
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
    System.out.println("Usted puede adquirir " + d + " dolares");
    }
}
