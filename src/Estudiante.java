public class Estudiante extends Persona{
    private int codigo;

    //Elementos Generales
    public Estudiante(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion, int codigo) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, Direccion);
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
        System.out.println("Los datos del estudiante son: ");
        System.out.println("Codigo del estudiante: " + getCodigo());
    }

}
