package Ejercicio3;
import java.math.*;
public class Ejercicio_3 extends DataEntry.InputData {
    public void run() {
        System.out.println("Calculo del area de un circulo");
        System.out.println("    radio del circulo:    ");
        double radio=inValue("radio");
        double area=Math.PI*Math.pow(radio,2);
        System.out.println("El area del circulo de radio "+radio+" es: "+area);
    }
}
