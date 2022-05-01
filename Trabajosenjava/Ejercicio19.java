import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        double area,base_mayor,base_menor,altura;
        Scanner lt=new Scanner(System.in);
        System.out.println("Escribe la base mayor: ");
        double bma =lt.nextDouble();
        System.out.println("Escribe la base mayor");
        double bme =lt.nextDouble();
        System.out.println("Escribe la altura del trapecio: ");
        double a =lt.nextDouble();
        double ar=((bma+bme)*a)/2;
        System.out.println("El area del trapecio es: "+ar);
        

    }
}
