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

    private boolean isNumeric(String cadena) {
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
        String text="";
        while (true) {
            text=scan.nextLine();
            if (this.thereIsText(text)) {
                break;
            } else {
                System.out.println("Es necesario ingresar lo solicitado");
            }
        }
        return text;
    }
    private boolean thereIsText(String text){
        if(text.length()>0){
            return true;
        }else{
            return false;
        }
    }

}
