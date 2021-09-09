package Ejercicio2;
public class Ejercicio_2 extends DataEntry.InputData{
    public void run() {

        System.out.println("******** Ejercicio 2 ********");
        System.out.println("Ingresa el valor de x: ");
        double x=super.inValue();
        System.out.println("Ingresa el valor de y: ");
        double y=super.inValue();
        if (x>y){
            System.out.println("x :"+x+" Es mayor que y :"+y);
        }else if(x<y){
            System.out.println("x :"+x+" Es menor que y :"+y);
        }else{
            System.out.println("x :"+x+" son iguales y :"+y);
        }
        System.out.println("*****************************");
    }
    }

