package Ejercicio7;

public class Ejercicio_7 extends DataEntry.InputData{
    public void run(){
        System.out.println("Ejercicio7");
        System.out.println("Ingresa un valor mayor o igual a cero: ");
        double number=0;
        do{
            number=inValue(" numero ");
        }while (number<0);
        System.out.println("numero ingresado es "+number);
    }
}
