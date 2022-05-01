import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        int dias;
        double precio,total;
        Scanner lt=new Scanner(System.in);
        System.out.println("Escribe el precio de habitacion por día: ");
        double p =lt.nextDouble();
        System.out.println("Escribe los dias de estancia en el hospedaje: ");
        double d =lt.nextInt();
        double t=d*p;
        System.out.println("El total por los "+d+"dias de estancia en el hospedaje es: s/"+t);
    }
}
