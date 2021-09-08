package Ejercicio17;

public class Television extends Electrodomestico{

    private int resolucion;
    private boolean sintonizadorTDT;
    private static final  int resolucionDefecto=20;
    private static final  boolean sintonizadorTDTDefecto=false;
    public Television(){
        this(precioBaseDefecto, pesoDefecto, consumoEnergeticoDefecto, colorDefecto, resolucionDefecto, sintonizadorTDTDefecto);
    }
    public Television(double precioBase, double peso){
        this(precioBase, peso,consumoEnergeticoDefecto, colorDefecto, resolucionDefecto, sintonizadorTDTDefecto);
    }
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    public int getResolucion(){
        return resolucion;
    }
    public boolean getSintonizadorTDT(){
        return sintonizadorTDT;
    }
    public double precioFinal(){
        double precio=super.precioFinal();

        if (resolucion>40){
            precio+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            precio+=50;
        }
        return precio;
    }

}
