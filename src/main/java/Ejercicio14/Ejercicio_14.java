package Ejercicio14;

import javax.xml.crypto.Data;

public class Ejercicio_14 extends DataEntry.InputData {
    public void run(){
        System.out.println("Ejercico 14 \n" +
                "Ingresa el numero que quieres que empiece a contar en 2 en 2 \n " +
                "hasta 1000\n");
        int number=(int) inValue(" numero ");
        for (int i=number;i<=1000;i+=2){
            System.out.print(i+" ");
        }
    }

}
