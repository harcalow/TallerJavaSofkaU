package Ejercicio4;

public class Ejercicio_4 extends DataEntry.InputData{
    public void run(){
        System.out.println(" Calculo de IVA");
        double cost = inValue("Precio");
        double IVA=0.21;//21 %
        double totalCost=(cost*IVA)+cost;
        System.out.println("El costo total con IVA de 21% es: "+totalCost);

    }
}
