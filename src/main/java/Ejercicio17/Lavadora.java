package Ejercicio17;

public class Lavadora extends Electrodomestico{
    private int carga;
    private static final int cargaDefecto=5;
    public Lavadora(){
        this(precioBaseDefecto,pesoDefecto, consumoEnergeticoDefecto, colorDefecto, cargaDefecto);
    }
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, consumoEnergeticoDefecto, colorDefecto, cargaDefecto);
    }
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    public double precioFinal(){
        double precio=super.precioFinal();
        if (carga>30){
            precio+=50;
        }
        return precio;
    }

}
