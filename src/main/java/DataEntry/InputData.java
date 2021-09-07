package DataEntry;
import java.util.Scanner;

public class InputData {
    public double inValue(String message){
        String valor="";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingresa el valor de "+message+": ");
            valor = scan.nextLine();
        }while (!this.isNumeric(valor));
        return Double.parseDouble(valor);
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
    public String intext(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

}
