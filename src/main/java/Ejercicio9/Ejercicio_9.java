package Ejercicio9;
public class Ejercicio_9 extends DataEntry.InputData{
    public void run(){
        System.out.println("Ejercicio 9");
        String text ="La sonrisa sera la mejor arma contra la tristeza ";
        text=text.replaceAll("a","e");
        System.out.println("Ingresa frase adicionar ");
        String inText=intext();
        text=text+inText;
        System.out.println(text);
    }
}
