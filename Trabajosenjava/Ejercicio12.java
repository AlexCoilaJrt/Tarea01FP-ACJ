import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        double precio,total,descuento,IGV;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo: ");
        precio =lt.nextDouble();
        double d= precio*.20;
        double I=(precio-d)*.15;
        double t=(precio-d)+I;
        System.out.println("El precio con descuento es: s/"+(precio-d));
        System.out.println("el descuento aplicado es: s/"+d);
        System.out.println("El precio final ya con IGV aplicado es: s/"+t);
        System.out.println("El IGV aplicado es: s/"+I);




    }
}
