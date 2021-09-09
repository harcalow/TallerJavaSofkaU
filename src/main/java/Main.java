import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Ejercicios ejercicios=new Ejercicios();
    //ejercicios.runEjercicio18();
        while(true) {
            int number = 0;
            System.out.println("Prueba de Ejercicios Sofka U");
            System.out.println("Cual deseas probar? ingresa el numero correspondiente:\n" +
                    "\t 1) Ejercicio 1 \n" +
                    "\t 2) Ejercicio 2 \n" +
                    "\t 3) Ejercicio 3 \n" +
                    "\t 4) Ejercicio 4 \n" +
                    "\t 5) Ejercicio 5 \n" +
                    "\t 6) Ejercicio 6 \n" +
                    "\t 7) Ejercicio 7 \n" +
                    "\t 8) Ejercicio 8 \n" +
                    "\t 9) Ejercicio 9 \n" +
                    "\t 10) Ejercicio 10 \n" +
                    "\t 11) Ejercicio 11 \n" +
                    "\t 12) Ejercicio 12 \n" +
                    "\t 13) Ejercicio 13 \n" +
                    "\t 14) Ejercicio 14 \n" +
                    "\t 15) Ejercicio 15 \n" +
                    "\t 16) Ejercicio 16 \n" +
                    "\t 17) Ejercicio 17 \n" +
                    "\t 18) Ejercicio 18 \n" +
                    "\t 19) Salir \n" +
                    "");
            number = (int)inValue();
            if (number == 19) {
                break;
            }else if ((number>0)&&(number<19)){
                switch (number){
                    case(1):
                        ejercicios.runEjercicio1();
                        break;
                    case(2):
                        ejercicios.runEjercicio2();
                        break;
                    case(3):
                        ejercicios.runEjercicio3();
                        break;
                    case(4):
                        ejercicios.runEjercicio4();
                        break;
                    case(5):
                        ejercicios.runEjercicio5();
                        break;
                    case(6):
                        ejercicios.runEjercicio6();
                        break;
                    case(7):
                        ejercicios.runEjercicio7();
                        break;
                    case(8):
                        ejercicios.runEjercicio8();
                        break;
                    case(9):
                        ejercicios.runEjercicio9();
                        break;
                    case(10):
                        ejercicios.runEjercicio10();
                        break;
                    case(11):
                        ejercicios.runEjercicio11();
                        break;
                    case(12):
                        ejercicios.runEjercicio12();
                        break;
                    case(13):
                        ejercicios.runEjercicio13();
                        break;
                    case(14):
                        ejercicios.runEjercicio14();
                        break;
                    case(15):
                        ejercicios.runEjercicio15();
                        break;
                    case(16):
                        ejercicios.runEjercicio16();
                        break;
                    case(17):
                        ejercicios.runEjercicio17();
                        break;
                    case(18):
                        ejercicios.runEjercicio18();
                        break;
                }
            }else{
                System.out.println("El numero no esta en rango de opciones recuerda de 1 a 18 o 19 para salir");
            }
        }



    }
    static String intext(){
        Scanner scan = new Scanner(System.in);
        String text="";
        while (true) {
            text=scan.nextLine();
            if (thereIsText(text)) {
                break;
            } else {
                System.out.println("Es necesario ingresar lo solicitado");
            }
        }
        return text;
    }
    static boolean thereIsText(String text){
        if(text.length()>0){
            return true;
        }else{
            return false;
        }
    }
    static double inValue(){
        String valor="";
        do {
            System.out.println("Ingresa el valor solicitado");
            valor = intext();
        }while (!isNumeric(valor));
        return Double.parseDouble(valor);
    }

    static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("El valor tiene que ser numerico:");
            return false;
        }
    }
}