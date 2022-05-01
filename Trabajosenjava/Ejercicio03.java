import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) throws Exception {

        String no;
        int a;
        int b=2022;
        
        //Datos de entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        no = sc.nextLine();
        System.out.println("Hola " + no + " En que año naciste");

        a = sc.nextInt();
        
        int edad = b - a;

        System.out.println("tu edad es " + edad);

        
    }
}
