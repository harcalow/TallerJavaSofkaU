package Ejercicio18;
public class Serie implements Entregable {
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    private final static int numeroDeTemporadasDefecto=3;
    private final static boolean entregadoDefecto=false;
    private final static String tituloDefecto ="";
    private final static String generoDefecto="";
    private final static String creadorDefecto="";
    public Serie(){
        this(tituloDefecto,numeroDeTemporadasDefecto, generoDefecto, creadorDefecto);
    }
    public Serie(String titulo, String creador){
        this(titulo,numeroDeTemporadasDefecto, generoDefecto, creador);
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroDeTemporadas=numeroDeTemporadas;
        this.genero=genero;
        this.creador=creador;
        this.entregado=entregadoDefecto;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getnumeroDeTemporadas() {
        return numeroDeTemporadas;
    }
    public String getGenero() {
        return genero;
    }
    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setnumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString(){
        return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroDeTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador;
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
        Serie objeto=(Serie)a;
        if (numeroDeTemporadas>objeto.getnumeroDeTemporadas()){
            return 1;
        }else if(numeroDeTemporadas==objeto.getnumeroDeTemporadas()){
            return 0;
        }else{
            return -1;
        }
    }
}
