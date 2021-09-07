package Ejercicio11;

public class Ejercicio_11 extends DataEntry.InputData {
    public void run(){
        System.out.println("Ejercicio 11");
        System.out.println("Escribe la frase a revisar");
        String text=intext();
        int a=0,e=0,i=0,o=0,u=0;
        for (int j=0;j<text.length();j++){
            if ((text.charAt(j)=='a')||(text.charAt(j)=='A')){a+=1;}
            else if((text.charAt(j)=='e')||(text.charAt(j)=='E')){e+=1;}
            else if((text.charAt(j)=='i')||(text.charAt(j)=='I')){i+=1;}
            else if((text.charAt(j)=='o')||(text.charAt(j)=='O')){o+=1;}
            else if((text.charAt(j)=='u')||(text.charAt(j)=='U')){u+=1;}
        }

        System.out.println("La longitud de la frase es "+text.length()+"\n" +
                "Catidad de a:"+a+ "\n" +
                "Catidad de e:"+e+ "\n" +
                "Catidad de i:"+i+ "\n" +
                "Catidad de o:"+o+ "\n" +
                "Catidad de u:"+u+ "\n" +
                "");
    }

}
