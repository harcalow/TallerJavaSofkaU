package Ejercicio18;

public class Ejercicio_18{
    public void run(){
        //Creamos dos arrays de cada tipo de objeto
        Serie series[]=new Serie[5];
        Videojuego videojuegos[]=new Videojuego[5];

        //Creamos un objeto en cada posicion del array
        series[0]=new Serie("Expediente X", 11,"Ciencia ficcion","Chris Carter");
        series[1]=new Serie("Friends", 10, "Humor", "David Crane y Marta Kauffman");
        series[2]=new Serie("The Walking Dead", 11 ,"Humor", "Seth MacFarlane");
        series[3]=new Serie("Dark","Baran bo Odar");
        series[4]=new Serie();

        videojuegos[0]=new Videojuego("Tetris", 15, "Arcade", "Nintendo");
        videojuegos[1]=new Videojuego("Pac-Man", 1);
        videojuegos[2]=new Videojuego("Street Fighter II", 6, "Arcade", "Nintendo");
        videojuegos[3]=new Videojuego();
        videojuegos[4]=new Videojuego("Halo: Combat Evolved", 10, "Disparos", "Microsoft");


        series[1].entregar();
        series[3].entregar();
        series[2].entregar();

        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();

        int catidadEntregados=0;

        for(int i=0;i<series.length;i++){
            if(series[i].isEntregado()){
                catidadEntregados+=1;
                series[i].devolver();
            }
            if(videojuegos[i].isEntregado()){
                catidadEntregados+=1;
                videojuegos[i].devolver();
            }
        }
        System.out.println("La cantidad de articulos entregados es: "+catidadEntregados);

        Serie serieMayor=series[0];
        Videojuego videojuegoMayor=videojuegos[0];
        for(int i=1;i<series.length;i++){
            if(series[i].compareTo(serieMayor)==1){
                serieMayor=series[i];
            }
            if(videojuegos[i].compareTo(videojuegoMayor)==1){
                videojuegoMayor=videojuegos[i];
            }

        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}
