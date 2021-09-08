package Ejercicio17;

public class Ejercicio_17 {
    public void run(){
        System.out.println("Ejercicio 17");

        //Creamos un array de Electrodomesticos
        Electrodomestico  electrodomesticos[]=new Electrodomestico[10];
        double sumadeElectrodomesticos=0;
        double sumadeTelevisiones=0;
        double sumadeLavadoras=0;

        //Asignamos cada una de las posiciones como queramos
        electrodomesticos[0]=new Electrodomestico(100, 40, 'A', "azul");
        electrodomesticos[1]=new Electrodomestico();
        electrodomesticos[2]=new Television(350, 50, 'B', "negro", 38, false);
        electrodomesticos[3]=new Lavadora(200,10,'I',"gris",120);
        electrodomesticos[4]=new Lavadora(100,15,'B',"negro",200);
        electrodomesticos[5]=new Lavadora(10, 120, 'W', "blanco", 40);
        electrodomesticos[6]=new Television(250, 70);
        electrodomesticos[7]=new Television();
        electrodomesticos[8]=new Television(200, 60, 'C', "blanco", 30, true);
        electrodomesticos[9]=new Lavadora();

        for(int i=0;i<electrodomesticos.length;i++){

            if(electrodomesticos[i] instanceof Electrodomestico){
                sumadeElectrodomesticos+=electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Lavadora){
                sumadeLavadoras+=electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Television){
                sumadeTelevisiones+=electrodomesticos[i].precioFinal();
            }
        }

        System.out.println("El precio de los electrodomesticos es de "+sumadeElectrodomesticos);
        System.out.println("El precio de las lavadoras es de "+sumadeLavadoras);
        System.out.println("El precio de las televisiones es de "+sumadeTelevisiones);


    }
}
