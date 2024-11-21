public class Docente extends Persona{
    private int codigo;

    //Constructor general
    public Docente(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion, int codigo) {
        super(cedula, nombre, fechaNacimiento, Direccion, tipoSangre);
        this.codigo = codigo;
    }

    //Getters
    private int getCodigo() {
        return codigo;
    }

    //Metodo personalizado
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Datos Docente");
        System.out.println("Codigo del docente: " + getCodigo());
    }
}
