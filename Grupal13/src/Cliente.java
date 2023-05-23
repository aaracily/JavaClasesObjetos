//  entidad cliente
public class Cliente {


// atributos de la clase
    private String nombre;
    private String apellido;
   private  int telefono;
    private String AFP;
    private String direccion;
   private String comuna;
    private int edad;
    private String rut;
    int sistemaSalud;
    //constructor vacio
    public Cliente(String ana, String lopez, int i, String planVital, String s, int i1, String s1, int i2){

    }
    // constructor
    public Cliente(String nombre, String apellido, int telefono, String AFP, String direccion, String comuna, int edad, String rut, int sistemaSalud ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.AFP = AFP;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
       /* if(rut < 99999999 & rut > 1){
            this.rut = rut;
        }else {
            rut = 0;
        }*/
        this.sistemaSalud = sistemaSalud;
        evaluarSistemaSalud(this.sistemaSalud);
this.rut = rut;


    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        /*if(rut < 99999999 & rut > 1){
            this.rut = rut;
        }*/
        this.rut = rut;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {

            this.sistemaSalud =sistemaSalud;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // método toString
    public String toString(){

        return "cliente : "+ nombre +   "Apellido :"+ apellido + " telefono  :"+telefono+ "  AFP :"+AFP + "  direccion :"+ direccion+
                "comuna  :"+ comuna +" edad :"+ edad+ "RUT  : " + rut+ "Sistema Salud  :"+ sistemaSalud;

    }


    // método que recibe una valor , lo evalua y retorna un string
    public static void evaluarSistemaSalud( int salud){
        if (salud == 1) {
            System.out.println("Sistema Salud Fonasa");
        }else if(salud == 2){
            System.out.println("Sistema Salud Isapre");
        }else{
            System.out.println("Respuesta no valido");
        }
    }

}
