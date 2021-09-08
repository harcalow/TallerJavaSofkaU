package Ejercicio13;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Ejercicio_13 {
    public void run(){
        System.out.println("Ejercicio 13 \n" +
                "Fecha actual");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));

    }

}
