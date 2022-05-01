import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        int kw;
        double precio,total;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese los kilowatts consumidos: ");
        kw =lt.nextInt();
        System.out.println("Ingrese el precio del kilowatts: ");
        precio =lt.nextDouble();
        double t=kw*precio;
        System.out.println("El total a pagar por kw: "+kw+"kilowatts consumidos es: s/"+t);




    }
}
