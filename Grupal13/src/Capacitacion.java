import java.time.LocalDate;

public class Capacitacion {

//Atributos
    private int id;
    private Cliente rutCliente;
    private int dia;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

//constructor vacio

    public Capacitacion() {
        this.id =id();
    }

    //constructor

    public Capacitacion( int dia, String lugar, int duracion, int cantidadAsistentes) {
        this();
        this.dia = dia;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getId() {
        return id;
    }
  //Método con acceso privado, que genera números par aid
    private int id (){
       return (int)(Math.random() *100)+1;
  }
   /* public void setId(int id) {
        this.id = id;
    }*/

    public Cliente getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Cliente rutCliente) {
        this.rutCliente = rutCliente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }
}
