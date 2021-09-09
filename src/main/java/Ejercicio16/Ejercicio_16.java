package Ejercicio16;

import javax.xml.crypto.Data;

public class Ejercicio_16 extends DataEntry.InputData {
    public void run(){
        System.out.println("******** Ejercicio 16 ********");
        System.out.println("Ingresa Nombre");
        String nombre=intext();
        System.out.println("Ingresa la edad en años");

        int edad=(int)inValue();
        char sexo=' ';
        while(true){
            System.out.println("Ingresa sexo H: hombre M: mujer");
            String sexoInput=intext();
            sexo=sexoInput.charAt(0);
            if ((sexo=='H')||(sexo=='M')){
                break;
            }
            else{
                System.out.println("Verifica solo es valido H o M");
            }
        }
        System.out.println("Ingresa Peso en Kg");
        double peso=inValue();
        System.out.println("Ingresa Altura en metros");
        double altura=inValue();
        Persona persona1 =new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 =new Persona(nombre,edad,sexo);
        Persona persona3 =new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        String estadoDePeso= pesoIdeal(persona1.calcularIMC());
        System.out.println("La persona 1 tiene:" +estadoDePeso);

        estadoDePeso= pesoIdeal(persona2.calcularIMC());
        System.out.println("La persona 2 tiene:" +estadoDePeso);

        estadoDePeso= pesoIdeal(persona3.calcularIMC());
        System.out.println("La persona 3 tiene:" +estadoDePeso);

        String estadoEdad=mayorDeEdad(persona1.esMayorDeEdad());
        System.out.println("La persona 1 es "+estadoEdad);
        estadoEdad=mayorDeEdad(persona2.esMayorDeEdad());
        System.out.println("La persona 2 es "+estadoEdad);
        estadoEdad=mayorDeEdad(persona3.esMayorDeEdad());
        System.out.println("La persona 3 es "+estadoEdad);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        System.out.println("*****************************");
    }
    public String pesoIdeal(double valor){
        if (valor ==1){
            return "Tiene Sobrepeso";
        }else  if(valor==0){
            return "Peso Ideal";
        }else {
            return "Bajo de Peso";
        }
    }
    public String mayorDeEdad(boolean valor){
        if (valor) {
            return "Eres Mayor de Edad";
        }else {
            return "Eres menor de Edad";
        }
    }
}
