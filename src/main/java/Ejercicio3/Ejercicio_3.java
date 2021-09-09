package Ejercicio3;
import java.math.*;
public class Ejercicio_3 extends DataEntry.InputData {
    public void run() {
        System.out.println("******** Ejercicio 3 ********");
        System.out.println("Calculo del area de un circulo");
        System.out.println("Ingresa el radio del circulo:");
        double radio=inValue();
        double area=Math.PI*Math.pow(radio,2);
        System.out.println("*****************************");
    }
}
