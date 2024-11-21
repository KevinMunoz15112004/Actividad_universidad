public class DocenteNombramiento extends Docente{
    private String tipoNombramiento;

    //Constructor General
    public DocenteNombramiento(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion, int codigo, String tipoNombramiento) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, Direccion, codigo);
        this.tipoNombramiento = tipoNombramiento;
    }

    //Getters
    private String getTipoNombramiento() {
        return tipoNombramiento;
    }

    //Metodo personalizado
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Tipo de nombramiento");
        System.out.println("El tipo de nombramiento es: " + getTipoNombramiento());
    }
}
