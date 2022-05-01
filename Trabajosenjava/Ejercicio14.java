import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        double dias,gasto_comida,gasto_hotel;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingresa los dias de viaje: ");
        double d =lt.nextDouble();
        System.out.println("Ingresa el gasto de hotel por dia: ");
        double gh =lt.nextDouble();
        System.out.println("Ingrese el gasto de comida diaria: ");
        double gc =lt.nextDouble();
        double t=(gh*d)+(gc*d)+(d*100);
        System.out.println("El total de dinero para comida es: s/"+gc*d);
        System.out.println("El total de dinero para el hotel es: s/"+gh*d);
        System.out.println("El total de dinero para otros gastos es: s/"+d*100);
        System.out.println("El dinero total del viaje es: s/"+t);
        


    }
}
