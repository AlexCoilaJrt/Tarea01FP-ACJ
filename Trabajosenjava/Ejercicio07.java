import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) throws Exception {
        double kilometros,costo,total;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Kilometros a recorrer: ");
        kilometros=lt.nextDouble();
        System.out.println("Costo por kilometro: ");
        costo=lt.nextDouble();
        //Proceso
        double t=kilometros*(costo);
        System.out.println("El total es de: "+t);





    }
}
