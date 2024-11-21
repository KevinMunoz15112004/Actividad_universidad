import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cedula;
        String nombre;
        String fechaNacimiento;
        String tipoSangre;
        String Direccion;
        int codigo;
        Scanner sc = new Scanner(System.in);
        cedula = sc.nextLine();
        nombre = sc.nextLine();
        fechaNacimiento = sc.nextLine();
        tipoSangre = sc.nextLine();
        Direccion = sc.nextLine();
        /*codigo = sc.nextInt();*/
        /*Estudiante estudiantee = new Estudiante(cedula, nombre, fechaNacimiento, tipoSangre, Direccion, codigo);
        estudiantee.imprimirDatos();*/
        Persona personaa = new Persona(cedula, nombre, fechaNacimiento, tipoSangre, Direccion);
        personaa.imprimirDatos();
        System.out.println("Cambiar datos");
        personaa.cambiardatoss();
        personaa.imprimirDatos();
        /*cedula = sc.nextLine();
        nombre = sc.nextLine();
        fechaNacimiento = sc.nextLine();
        tipoSangre = sc.nextLine();
        Direccion = sc.nextLine();
        personaa.cambiarDatos(cedula, nombre, fechaNacimiento, tipoSangre, Direccion);
        personaa.imprimirDatos();*/
        /*Persona persona1 = new Persona("1728786756", "Luis Perez", "08/10/2023", "O+", "Barcelona");
       /* persona1.imprimirDatos();
        System.out.println("--------------------------------------------------------------------------------------");
        Estudiante estudiante1 = new Estudiante("1728086746", "Jose Gonzales", "10/11/2077", "O+" ,905768);
        estudiante1.imprimirDatos();
        System.out.println("--------------------------------------------------------------------------------------");
        EstudianteBecado estudianteBecado1 = new EstudianteBecado("1756435645", "Esteban Dido", "09/10/1999", "O+", 909867, "Media Beca");
        estudianteBecado1.imprimirDatos();
        System.out.println("--------------------------------------------------------------------------------------");
        EstudianteDeportista estudianteDeportista1 = new EstudianteDeportista("1789657654", "Elva Zurita", "02/09/2001", "O+", 909875, "Fútbol");
        estudianteDeportista1.imprimirDatos();*/


    }
}