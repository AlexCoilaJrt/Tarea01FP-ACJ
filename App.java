import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double precio,horas, total;
        //Datos de entrada 
        Scanner lt=new Scanner(System.in);
        System.out.println("Escribe el precio: ");
        precio=lt.nextDouble();
        System.out.println("Ingrese las horas: ");
        horas= lt.nextDouble();
        //Proceso
        double cobro=precio*(horas);
        System.out.println("El total a pagar por las: "+precio*(horas));
    
    
    }
}
