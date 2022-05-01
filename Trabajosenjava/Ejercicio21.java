import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        double largo,ancho,alto;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el largo: ");
        double l =lt.nextDouble();
        System.out.println("Ingrese el ancho: ");
        double a =lt.nextDouble();
        System.out.println("Ingrese la altura: ");
        double al =lt.nextDouble();
        System.out.println("El area del paralelepipedo es: "+2+(l*a)+(l*al)+(a*al));
        
    }
}
