import java.time.LocalDate;
import java.util.Date;

public class Usuario {


    // atributos
    private String nombre;
    private String rut;
    private LocalDate fechaNacimiento;

    //constructor vacio
    public Usuario(){

    }
    //constructor
    public Usuario(String nombre, String rut, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate  getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate  fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", rut=" + rut +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
