import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;

public class Ejercicio08 {
    public static void main(String[] args) throws Exception {
        double distancia,velocidad,tiempo;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese distancia en km: ");
        distancia=lt.nextDouble();
        System.out.println("Ingrese distancia/velocidad: ");
        velocidad=lt.nextDouble();
        //Proceso
        double t= (distancia/velocidad);
        System.out.println("El tiempo por: "+(distancia)+"kilometro recorrdo es: "+t+("horas:"));
       
    }
}
