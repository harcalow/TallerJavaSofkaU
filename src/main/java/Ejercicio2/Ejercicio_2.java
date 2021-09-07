package Ejercicio2;
import java.util.Scanner;
public class Ejercicio_2 {
    public void run() {
        Scanner scan = new Scanner(System.in);
        String valor="";
        do {
            System.out.println("Ingresa el valor x:");
            valor = scan.nextLine();
        }while (!this.isNumeric(valor));
        double x=Double.parseDouble(valor);
        do {
            System.out.println("Ingresa el valor y:");
            valor = scan.nextLine();
        }while (!this.isNumeric(valor));
        double y=Double.parseDouble(valor);
        if (x>y){
            System.out.println("x :"+x+" Es mayor que y :"+y);
        }else if(x<y){
            System.out.println("x :"+x+" Es menor que y :"+y);
        }else{
            System.out.println("x :"+x+" son iguales y :"+y);
        }
    }
    public boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("El valor tiene que ser numerico:");
            return false;
        }
    }
}
