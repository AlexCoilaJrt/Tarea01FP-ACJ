import java.util.Scanner;

public class EjercicioCondMult {
    public static void profesor() {
        System.out.println("La funcion del docente es enseñar: ");
        
    }
    public static void estudiante() {
        System.out.println("La funcion del estudiante es aprender: ");
        
    }
    public void maquinaPC() {
        System.out.println("La funcion de la pc es procesar informacion: ");
        
    }
    public void proyector() {
        System.out.println("Proyectar una imagen, informacion: ");
        
    }
    //Un objetoen programacion es una instancia de una clase
    //Cuando esta en static lo reconoce, en cambio si es un objeto hace lo abajo

    public static void main(String[] args) {
        EjercicioCondMult objx=new EjercicioCondMult();
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el algoritmo que desea probar\n1=Profesor"+
        "\n2=Estudiante\n3=MaquinaPC\n4=Proyector");
        int opcMet=lt.nextInt();
        switch (opcMet) {
            case 1:
                profesor(); break;
                case 2:estudiante();  break;
                case 3: objx.maquinaPC(); break;
                case 4: objx.proyector();; break;
                
        
            default: System.err.println("Opcion no existe: "); break;
        }

       



    
        







    }

}