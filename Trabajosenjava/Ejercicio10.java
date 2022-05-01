import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        double altura,largo,ancho,precio;
        Scanner lt=new Scanner(System.in);
        System.out.println("Escribe la altura de la alberca ");
        altura =lt.nextDouble();
        System.out.println("Escribe el largo de la alberca: ");
        largo =lt.nextDouble();
        System.out.println("Escribe el ancho de la alberca: ");
        ancho =lt.nextDouble();
        System.out.println("Escribe el precio del metro cubico de agua: ");
        precio =lt.nextDouble();
        double volumen=(altura*largo*ancho);
        double pago=(volumen*precio);
        System.out.println("El pago es: "+volumen + "Litros de agua es: s/ "+pago);
        


        

    }
}
