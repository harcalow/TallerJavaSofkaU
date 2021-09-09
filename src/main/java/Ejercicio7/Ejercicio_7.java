package Ejercicio7;

public class Ejercicio_7 extends DataEntry.InputData{
    public void run(){
        System.out.println("******** Ejercicio 7 ********");
        System.out.println("Ingresa un valor mayor o igual a cero si es menor volvera a pedir el valor: ");
        double number=0;
        do{
            number=inValue();
        }while (number<0);
        System.out.println("numero ingresado es "+number);
        System.out.println("*****************************");
    }
}
