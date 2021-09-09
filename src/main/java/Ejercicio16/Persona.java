package Ejercicio16;
public class Persona {
    private static final char sexoDefecto='H';
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    public Persona(){
        this("", 0,sexoDefecto, 0, 0);
    }
    public Persona(String nombre,int edad, char sexo){
        this(nombre, edad,sexo, 0, 0);
    }
    public Persona(String nombre,int edad, char sexo,double peso,double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo(sexo);
    }
    public boolean esMayorDeEdad(){
        if (edad>=18){
            return true;
        }else {
            return false;
        }
    }
    public void comprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoDefecto;
        }
    }
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
    public double calcularIMC(){
        double imc=peso/Math.pow(altura,2);
        if (imc<20){
            return -1;
        }else if((imc>=20)&&(imc<=25)){
            return 0;
        }else{
            return 1;
        }
    }


    private void generarDni() {
        final int divisor = 23;
        //Generamos un número de 8 digitos
        int numberDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numberDNI - (numberDNI / divisor * divisor);
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
        DNI = Integer.toString(numberDNI) + letraDNI;
       }

    private char generaLetraDNI(int res) {
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'W', 'V', 'X'};
        return letras[res];
    }

    //sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
