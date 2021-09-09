package Ejercicio14;

import javax.xml.crypto.Data;

public class Ejercicio_14 extends DataEntry.InputData {
    public void run(){
        System.out.println("******** Ejercicio 14 ********");
        System.out.println("Ingresa el numero que quieres que empiece a contar en 2 en 2 \n " +
                "hasta 1000\n");
        int number=(int) inValue();
        for (int i=number;i<=1000;i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\n*****************************");
    }

}
