package Ejercicio18;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    private final static int horasEstimadasDefecto=10;
    private final static boolean entregadoDefecto=false;
    private final static String tituloDefecto ="";
    private final static String generoDefecto="";
    private final static String companiaDefecto="";

    public Videojuego(){
        this(tituloDefecto,horasEstimadasDefecto, generoDefecto, companiaDefecto);
    }

    public Videojuego(String titulo, int horasEstimadas){
        this(titulo,horasEstimadas, generoDefecto, companiaDefecto);
    }
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compania=compania;
        this.entregado=entregadoDefecto;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    public String getGenero() {
        return genero;
    }
    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void sethorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compania;
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego objeto=(Videojuego)a;
        if (horasEstimadas>objeto.getHorasEstimadas()){
            return 1;
        }else if(horasEstimadas==objeto.getHorasEstimadas()){
            return 0;
        }else{
            return -1;
        }
    }
}
