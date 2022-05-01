import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) throws Exception {
        int min;
        double precio,total;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Tiempo de la llamada en minutos: ");
        min=lt.nextInt();
        System.out.println("Precio por minuto de la llamada: ");
        precio=lt.nextDouble();
        //Proceso
        double t=(min*precio);
        System.out.println("Total a pagar: "+(min)+"Minutos de la llamada es: S/"+t);




    }
}
