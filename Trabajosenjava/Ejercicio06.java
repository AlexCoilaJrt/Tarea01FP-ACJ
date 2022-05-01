import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) throws Exception {
        Double precio,valor,cobro;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el precio por m2: ");
        precio=lt.nextDouble();
        System.out.println("Ingrese el valor de m2: ");
        valor=lt.nextDouble();
        //Proceso
        double c= precio/valor;
        System.out.println("El total a pagar por las: "+precio*(valor)+c);
        

        
        


        
      
    
        



    }
}
