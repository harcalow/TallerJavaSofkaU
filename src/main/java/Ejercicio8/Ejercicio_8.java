package Ejercicio8;


public class Ejercicio_8 extends DataEntry.InputData{
    public void run(){
        System.out.println("Ejercicio 8");
        String []week= new String[]{"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        System.out.println("Ingresa dia de la semana para verificar si es laboral o no \n" +
                "Solo validos ");
        for (String i: week) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        String text="";
        boolean check=true;
        while (check){
            text=intext();
            for (int i=0;i<week.length;i++) {
                if (text.equals(week[i])) {
                    check = false;
                }
            }
            if (check==true){
                System.out.println("valor no valido ingresa nuevamente");
            }
        }
        switch (text){
            case "lunes":
                System.out.println("Día laboral");
                break;
            case "martes":
                System.out.println("Día laboral");
                break;
            case "miercoles":
                System.out.println("Día laboral");
                break;
            case "jueves":
                System.out.println("Día laboral");
                break;
            case "viernes":
                System.out.println("Día laboral");
                break;
            case "sabado":
                System.out.println("Día no laboral");
                break;
            case "domingo":
                System.out.println("Día no laboral");
                break;
        }
    }

}
