package Ejercicio2;
public class Ejercicio_2 extends DataEntry.InputData{
    public void run() {
        double x=super.inValue("x");
        double y=super.inValue("y");
        if (x>y){
            System.out.println("x :"+x+" Es mayor que y :"+y);
        }else if(x<y){
            System.out.println("x :"+x+" Es menor que y :"+y);
        }else{
            System.out.println("x :"+x+" son iguales y :"+y);
        }
    }
    }

