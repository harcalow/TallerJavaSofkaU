package Ejercicio12;

public class Ejercicio_12 extends DataEntry.InputData{
    public void run(){
        System.out.println("******** Ejercicio 12 ********");
        System.out.println("Ejercicio 12 \n" +
                "Comparacion de plabras");
        System.out.println("Ingresa primera palabra");
        String text1=intext();
        System.out.println("Ingresa segunda palabra");
        String text2=intext();
        String differences="";
        if (text1.equals(text2)){
            System.out.println("Si son iguales");
        }else{
            if (text2.length()>text1.length()){
                for (int i=0 ;i<text1.length();i++){
                    if (text1.charAt(i)!=text2.charAt(i)){
                        differences+=text2.charAt(i);
                    }
                }
                differences+=text2.substring(text1.length());

            }else{
                for (int i=0 ;i<text2.length();i++){
                    if (text2.charAt(i)!=text1.charAt(i)){
                        differences+=text2.charAt(i);
                    }
                }
                differences+=text1.substring(text2.length());
            }

            System.out.println("No son iguales y las diferencias son "+differences);
        }
        System.out.println("*****************************");
    }
}
