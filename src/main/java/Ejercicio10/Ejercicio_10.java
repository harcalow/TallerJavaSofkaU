package Ejercicio10;

public class Ejercicio_10 extends DataEntry.InputData {
    public void run(){
        System.out.println("Ejercicio 10");
        System.out.println("Ingresa frase para eliminar los espacios");
        String text=intext();
        text=text.replaceAll(" ","");
        System.out.println(text);
    }

}
