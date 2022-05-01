import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        double meses,semanas,dias,horas;
        Scanner lt=new Scanner(System.in);
        System.out.println("escribe tu edad: ");
        double a=lt.nextDouble();
        double m=a*12;
        double s=m*4.34524;
        double d=s*7;
        double h=d*24;
        System.out.println("La persona ha vivido: ");
        System.out.println(m+"meses: ");
        System.out.println(s+" semanas");
        System.out.println(d+" dias");
        System.out.println(h+" horas");


    }
}
