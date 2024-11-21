import java.util.Scanner;

public class Persona {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String tipoSangre;
    private String Direccion;

    //Constructor con parámetros y vacío
    public Persona(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.Direccion = Direccion;
    }

    //Getters
    private String getCedula() {
        return cedula;
    }

    private String getNombre() {
        return nombre;
    }

    private String getFechaNacimiento() {
        return fechaNacimiento;
    }

    private String getTipoSangre() {
        return tipoSangre;
    }

    private String getDireccion() {
        return Direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //Setter de direccion porque la direccion varía
    private void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    //Metodo personalizado
    public void imprimirDatos(){
        System.out.println("Los datos de la persona son: ");
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("FechaNacimiento: " + getFechaNacimiento());
        System.out.println("Tipo de Sangre: " + getTipoSangre());
        System.out.println("Direccion: " + getDireccion());
    }

    //Metodo para cambiar datos
    //forma 1
    public void cambiarDatos() {
        Scanner sc = new Scanner(System.in);
        cedula = sc.nextLine();
        nombre = sc.nextLine();
        fechaNacimiento = sc.nextLine();
        tipoSangre = sc.nextLine();
        Direccion = sc.nextLine();
        setCedula(cedula);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setTipoSangre(tipoSangre);
        setDireccion(Direccion);
    }

    //forma 2
    public void cambiardatoss(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nueva cedula");
        this.cedula=sc.nextLine();
        System.out.println("Ingrese la nueva nombre");
        this.nombre=sc.nextLine();
        this.fechaNacimiento=sc.nextLine();
        this.tipoSangre=sc.nextLine();
        this.Direccion=sc.nextLine();
    }
}
