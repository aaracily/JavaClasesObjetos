import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;
public class Main {


    public static int ingresoInt(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String ingresoString(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void main(String[] args) {
        // almacenar los datos ingresados por consola
      /*  String nombre = ingresoString("Datos de Cliente : Ingrese nombre :");
        String apellido = ingresoString("Ingrese apellido :");
        int telefono = ingresoInt("ingrese numero de teléfono :");
        String afp = ingresoString("Ingrese afp :");
        String direccion = ingresoString("Ingrese dirección : ");
        String comuna = ingresoString("Ingrese comuna :");
        int edad =  ingresoInt("Ingrese edad : ");
        String rut = ingresoString("Ingrese rut");
        int sistemaS = ingresoInt("Seleccione sistema Salud 1) FONASA 2) ISAPRE");
        // instanciar la clase cliente, pasar parámetros al constructor
        Cliente c1 = new Cliente(nombre, apellido, telefono, afp, direccion, comuna, edad, rut, sistemaS);
*/
        //almacenar datos ingresados por consola
        /*int dia = ingresoInt("Datos Capacitación  mes de Junio. Ingrese día de inicio");
        String lugar = ingresoString("Ingrese lugar ceremonia de incio");
        int duracion = ingresoInt("Ingrese cantidad de meses de duración");
        int asistentes = ingresoInt("Ingrese cantidad de asistentes");
        //instanciar clase capacitacion
        Capacitacion cap1 = new Capacitacion(dia,lugar,duracion,asistentes);
        cap1.setRutCliente(c1);
        System.out.println("Bienvenido  "+ c1.getNombre()+"  RUT "+cap1.getRutCliente().getRut()+ "/n El inicio de su capacitacion con ID "+ cap1.getId() + " será celebrada  en "+ cap1.getLugar());
*/
        //instanciar clase Usuario
        Usuario us1 = new Usuario("Marta","19.200.876-k",  LocalDate.of(1989,03,20));
        //System.out.println(us1);
        System.out.println(us1);
    }
}
