package Ejercicio15;

import javax.xml.crypto.Data;

public class Ejercicio_15 extends DataEntry.InputData {
    public void run(){
        System.out.println("******** Ejercicio 15 ********");
        boolean exit=true;
        while(exit) {
            String menu = "****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR";
            System.out.println(menu);
            System.out.println("Selecciona el item");
            int item = (int) inValue();
            if (item == 8) {
                exit = false;
            }else if((item>0)&&(item<8)){
                switch (item){
                    case (1):
                        System.out.println("1-NUEVO ACTOR\n");
                        break;
                    case (2):
                        System.out.println("2-BUSCAR ACTOR\n");
                        break;
                    case (3):
                        System.out.println("3-ELIMINAR ACTOR\n");
                        break;
                    case (4):
                        System.out.println("4-MODIFICAR ACTOR\n");
                        break;
                    case (5):
                        System.out.println("5-VER TODOS LOS ACTORES\n");
                        break;
                    case (6):
                        System.out.println("6-VER PELICULAS DE LOS ACTORES\n");
                        break;
                    case (7):
                        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n");
                        break;
                }
            }else{
                System.out.println("OPCION INCORRECTO");
            }
        }
        System.out.println("*****************************");
    }
}
