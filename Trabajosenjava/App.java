import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a,b;
    //Datos de entrada
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese el lado a:");
    a=lt.nextDouble();
    System.out.println("Ingrese el lado b:");
    b=lt.nextDouble();
    //Proceso
    double f = a * a;
    double g = b * b;
    double r = f + g;
    

    double t = r * r;
    //Datos de salida
    System.out.println("La hipotenusa:" + t);
    }
}
