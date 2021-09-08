package Ejercicio17;
public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final String colorDefecto = "blanco";
    protected static final char consumoEnergeticoDefecto = 'F';
    protected static final double precioBaseDefecto = 100;
    protected static final double pesoDefecto = 5;

    private String colores[]={"blanco","negro","rojo","azul","gris"};


    public Electrodomestico(){
        this(precioBaseDefecto, pesoDefecto, consumoEnergeticoDefecto, colorDefecto);
    }
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, consumoEnergeticoDefecto, colorDefecto);
    }
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    public void comprobarConsumoEnergetico(char consumoEnergetico){

        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumoEnergeticoDefecto;
        }

    }
    private void comprobarColor(String color){
        //Colores disponibles
        //String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean buscar=false;

        for(int i=0;i<colores.length && !buscar;i++){
            if(colores[i].equals(color)){
                buscar=true;
                break;
            }
        }
        if(buscar){
            this.color=color;
        }else{
            this.color=colorDefecto;
        }

    }
    public double precioFinal(){
        double precio=0;
        switch(consumoEnergetico){
            case 'A':
                precio+=100;
                break;
            case 'B':
                precio+=80;
                break;
            case 'C':
                precio+=60;
                break;
            case 'D':
                precio+=50;
                break;
            case 'E':
                precio+=30;
                break;
            case 'F':
                precio+=10;
                break;
        }

        if(peso>=0 && peso<19){
            precio+=10;
        }else if(peso>=20 && peso<49){
            precio+=50;
        }else if(peso>=50 && peso<=79){
            precio+=80;
        }else if(peso>=80){
            precio+=100;
        }
        return precioBase+precio;
    }


}
