import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        double ahorro,sueldo;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el sueldo: ");
        double s =lt.nextDouble();
        double a=s*.15*4*12;
        System.out.println("El ahorro semanal es: s/"+s*.15);
        System.out.println("El ahorro mensual es: s/"+s*.15*4);
        System.out.println("El ahorro anual es: s/"+a);
        

    }
}
