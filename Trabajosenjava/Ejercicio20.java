import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        double kilometro,milla;
        Scanner lt=new Scanner(System.in);
        System.out.println(" Escribe una distancia en millas: ");
        double m =lt.nextDouble();
        double k=m*1.609;
        System.out.println(m+" millas convertidos a kilometros es: "+k);

    }
}
